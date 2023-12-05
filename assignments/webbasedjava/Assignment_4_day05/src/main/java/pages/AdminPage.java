package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pojos.User;

/**
 * Servlet implementation class AdminPage
 */
@WebServlet("/admin")
public class AdminPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		try(PrintWriter pw = response.getWriter())
		{
			HttpSession hs = request.getSession();
			
			User admin = (User) hs.getAttribute("user_details");
			
			if(admin!=null)
			{
				pw.print("<h4>Welcome admin, hello : "+admin.getName()+"</h4>");
			}
			else
				pw.print("<h5> No Cookies !!!!! , Session Tracking failed...</h5>");
			
			pw.print("<h5> <a href='logout'>Log Me Out</a></h5>");
			
		}
		catch(Exception e)
		{
			throw new ServletException("err in do-post of " + getClass(), e);
		}
		
	}

}
