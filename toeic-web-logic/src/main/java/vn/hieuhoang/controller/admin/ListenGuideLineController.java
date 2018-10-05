package vn.hieuhoang.controller.admin;

import vn.hieuhoang.command.ListenGuideLineCommand;
import vn.hieuhoang.core.dto.ListenGuidelineDTO;
import vn.hieuhoang.core.service.ListenGuideLineService;
import vn.hieuhoang.core.service.impl.ListenGuideLineServiceImpl;
import vn.hieuhoang.core.web.common.WebConstant;
import vn.hieuhoang.core.web.utils.RequestUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hieu Hoang on 11/09/2018.
 */
@WebServlet("/admin-guideline-listen-list.html")
public class ListenGuideLineController extends HttpServlet{
    private ListenGuideLineService guideLineService = new ListenGuideLineServiceImpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//          ListenGuideLineCommand command = new ListenGuideLineCommand();
//          command.setMaxPageItems(2);
//          RequestUtil.initSearchBean(request,command);
//          Object[] objects = guideLineService.findListenGuidelineByProperties(null ,null,command.getSortExpression(),command.getSortDirection(),command.getFirstItem(),command.getMaxPageItems());
//          command.setListResult((List<ListenGuidelineDTO>) objects[1]);
//          command.setTotalItems(Integer.parseInt(objects[0].toString()));
//          request.setAttribute(WebConstant.LIST_ITEMS,command);
          RequestDispatcher rd = request.getRequestDispatcher("views/admin/listenguideline/list.jsp");
          rd.forward(request,response);
    }
}
