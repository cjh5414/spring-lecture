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

/**
 * Created by jihun on 2018. 10. 21..
 */

@WebServlet("/doRegister")
public class DoRegister extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public DoRegister() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");

        CustomerService service = CustomerService.getInstance();
        Customer customer = new Customer(id, password, name, gender, email);
        service.addCustomer(customer);

        String page = "/view/registerSuccess.jsp";
        request.setAttribute("customer", customer);

        RequestDispatcher dispatcher = request.getRequestDispatcher(page);
        dispatcher.forward(request, response);
    }
}
