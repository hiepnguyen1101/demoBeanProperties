package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Company;
import Bean.Employee;
import Bean.Name;

/**
 * Servlet implementation class BeanProperties
 */
@WebServlet("/bean-properties")
public class BeanProperties extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BeanProperties() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Name name = new Name("Marty", "Hall");
		Company company = new Company("coreservlets.com",
				"Customized Java EE and Ajax Training");
		Employee employee = new Employee(name, company);
		request.setAttribute("employee", employee);
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("/bean-properties.jsp");
		dispatcher.forward(request, response);
	}

}
