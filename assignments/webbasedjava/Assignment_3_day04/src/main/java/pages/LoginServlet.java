package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDaoImpl;
import pojos.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(value = "/authenticate", loadOnStartup=1)
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDaoImpl dao;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		try {
			dao = new UserDaoImpl();
		}
		catch(Exception e)
		{
			throw new ServletException("err in init of : " + getClass(), e);
		}
		
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			dao.cleanUp();
		} catch (SQLException e) {
			throw new RuntimeException("err in destroy of " + getClass(), e);

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		try(PrintWriter pw = response.getWriter())
		{
			String nm = request.getParameter("name");
			String pwd = request.getParameter("pass");
			
			User user = dao.userLogin(nm, pwd);
			
			if(user != null)
			{
				pw.print("<h5>Login from page</h5>");
				
				//pw.print("<h5> Login Successful ! Your Details :"+user+"</h5>");
				
				response.sendRedirect("topics_list");
			}
			else
			{
				pw.print("<h5> Invalid login, Please <a href='login.html'>Retry</a></h5>");
			}
		}
		catch(Exception e)
		{
			throw new ServletException("err in do-post of " + getClass(), e);
		}
	}

}
