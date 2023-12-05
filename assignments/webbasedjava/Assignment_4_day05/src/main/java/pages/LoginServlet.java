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
import javax.servlet.http.HttpSession;

import dao.TopicDaoImpl;
import dao.TutorialDaoImpl;
import dao.UserDaoImpl;
import pojos.User;
import utils.DBUtils;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(value = "/authenticate", loadOnStartup=1)
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDaoImpl userDao;
	private TopicDaoImpl topicDao;
	private TutorialDaoImpl tutorialDao;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		try {
			userDao = new UserDaoImpl();
			topicDao = new TopicDaoImpl();
			tutorialDao = new TutorialDaoImpl();
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
			userDao.cleanUp();
			topicDao.cleanUp();
			tutorialDao.cleanUp();
			DBUtils.closeConnection();
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
			
			User user = userDao.userLogin(nm, pwd);
			
			if(user != null)
			{
				pw.print("<h5>Login from page</h5>");
				
				HttpSession session = request.getSession();
				System.out.println("from login page ");
				System.out.println("New session " + session.isNew());
				System.out.println("session ID " + session.getId());
				
				session.setAttribute("user_details", user);
				session.setAttribute("user_dao", userDao);
				session.setAttribute("topics_dao", topicDao);
				session.setAttribute("tutorials_dao", tutorialDao);
				
				if(user.getRole().equals("admin"))
					response.sendRedirect("admin");
				else
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
