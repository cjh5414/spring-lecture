package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jihun on 2018. 10. 21..
 */

@WebServlet("/home")
public class Home extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Home() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String page = null;

        if(action.equals("login"))
            page = "/view/loginForm.jsp";
        else if(action.equals("register"))
            page = "/view/registerForm.jsp";
        else
            page = "/view/error.jsp";

        RequestDispatcher dispatcher = request.getRequestDispatcher(page);
        dispatcher.forward(request, response);
    }
}