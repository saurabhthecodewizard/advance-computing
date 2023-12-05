package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.TutorialDaoImpl;
import pojos.Tutorial;
import pojos.User;

/**
 * Servlet implementation class TutorialPage
 */
@WebServlet("/tutorials")
public class TutorialPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		try(PrintWriter pw = response.getWriter())
		{
			pw.print("<h5>Tutorial Page</h5>");
			
			HttpSession hs = request.getSession();
			
			User user = (User) hs.getAttribute("user_details");
			
			if(user!=null)
			{
				pw.print("<h5>Hello, user : "+user+"</h5>");
				
				TutorialDaoImpl tutorialDao = (TutorialDaoImpl) hs.getAttribute("tutorials_dao");
				
				String id = request.getParameter("topic_id");
				
				int topicId = Integer.parseInt(id);
				
				List<Tutorial> tutorials = tutorialDao.getTutorials(topicId);
				
				pw.print("<h5> Topic list </h5>");
				
				pw.print("<form action='tutorial_details'");
				pw.print("<table style='background-color: lightgrey; margin: auto'>");
				pw.print("<h5>");
				for(Tutorial t : tutorials)
					pw.print("<a href=tutorial_details?tutorial_id="+t.getId()+" >"+t.getName()+"<br/>");
				pw.print("</h5>");
				pw.print("</table></form>");
				
			}
			else
				pw.print("<h5> No Cookies !!!!! , Session Tracking failed...</h5>");
			
		}
		catch(Exception e)
		{
			throw new ServletException("err in do-post of " + getClass(), e);
		}
	}

}
