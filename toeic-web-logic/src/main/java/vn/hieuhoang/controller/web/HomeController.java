package vn.hieuhoang.controller.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Hieu Hoang on 17/08/2018.
 */
@WebServlet("/home.html")
public class HomeController extends HttpServlet {
    protected void doGet(HttpServletRequest request , HttpServletResponse response)
            throws ServletException,IOException {
        RequestDispatcher rd = request.getRequestDispatcher("views/web/home.jsp");
        rd.forward(request,response);
    }

    protected void doPost(HttpServletRequest request ,HttpServletResponse response)
            throws ServletException ,IOException {

    }
}