package vn.hieuhoang.controller.web;

import com.sun.istack.internal.logging.Logger;
import vn.hieuhoang.command.UserCommand;
import vn.hieuhoang.core.dto.UserDTO;
import vn.hieuhoang.core.service.UserService;
import vn.hieuhoang.core.service.impl.UserServiceImpl;
import vn.hieuhoang.core.web.common.WebConstant;
import vn.hieuhoang.core.web.utils.FormUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Hieu Hoang on 19/08/2018.
 */
@WebServlet("/login.html")
public class LoginController extends HttpServlet {
    private final Logger log = Logger.getLogger(this.getClass());
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher rd = request.getRequestDispatcher("/views/web/login.jsp");
        rd.forward(request,resp);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        UserCommand command = FormUtil.populate(UserCommand.class,request);
        UserDTO pojo = command.getPojo();
        UserService userService = new UserServiceImpl();
        if (userService.isUserExist(pojo) != null) {
            if (userService.findRoleByUser(pojo) != null && userService.findRoleByUser(pojo).getRoleDTO() != null) {
                if (userService.findRoleByUser(pojo).getRoleDTO().getName().equals(WebConstant.ROLE_ADMIN)) {
                    request.setAttribute(WebConstant.ALERT,WebConstant.TYPE_SUCCESS);
                    request.setAttribute(WebConstant.MESSAGE_RESPONE,"ADMIN");
                } else if (userService.findRoleByUser(pojo).getRoleDTO().getName().equals(WebConstant.ROLE_USER)) {
                    request.setAttribute(WebConstant.ALERT,WebConstant.TYPE_SUCCESS);
                    request.setAttribute(WebConstant.MESSAGE_RESPONE,"USER");
                }
            }
        } else {
            request.setAttribute(WebConstant.ALERT,WebConstant.TYPE_ERROR);
            request.setAttribute(WebConstant.MESSAGE_RESPONE,"Tên hoặc mật khẩu sai");
        }
        RequestDispatcher rd = request.getRequestDispatcher("/views/web/login.jsp");
        rd.forward(request,resp);
    }
}
