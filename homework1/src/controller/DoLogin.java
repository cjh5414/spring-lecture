package controller;

import model.Customer;
import service.CustomerService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by jihun on 2018. 10. 21..
 */

@WebServlet("/doLogin")
public class DoLogin extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public DoLogin() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String password = request.getParameter("password");

        CustomerService service = CustomerService.getInstance();
        Customer customer = service.login(id, password);

        String page;

        if (customer == null) {
            page = "/view/loginFail.jsp";
            request.setAttribute("id", id);
        }
        else {
            page = "/view/loginSuccess.jsp";
            request.setAttribute("customer", customer);
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(page);
        dispatcher.forward(request, response);
    }
}
