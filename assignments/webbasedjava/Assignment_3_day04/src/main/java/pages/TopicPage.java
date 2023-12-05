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

import dao.TopicDaoImpl;

/**
 * Servlet implementation class TopicPage
 */
@WebServlet("/topics_list")
public class TopicPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TopicDaoImpl dao;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		try
		{
			dao = new TopicDaoImpl();
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		
		try(PrintWriter pw = response.getWriter())
		{
			pw.print("<h5>Topics Page</h5>");
			
			pw.print("<form action='tutorials' method='post'");
			pw.print("<table style='background-color: lightgrey; margin: auto'>");
			
			dao.getTopics().forEach(t -> pw.print("<tr><td><input type = 'radio' name='topics' value = '"+t.getId()+"' id='"
												+t.getName()+"' /></tr></td><label for='"+t.getName()+"'>"+t.getName()+"</label>"));
			
			pw.print("<tr><td><input type = 'submit' value = 'Choose topic'></td></tr>");
			pw.print("</table></form>");
		}
		catch(Exception e)
		{
			throw new ServletException("err in do-post of " + getClass(), e);
		}
	}

}
