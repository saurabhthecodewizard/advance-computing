package pages;

import java.io.IOException;
import java.io.PrintWriter;

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
 * Servlet implementation class TutorialDetails
 */
@WebServlet("/tutorial_details")
public class TutorialDetails extends HttpServlet {
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
				
				System.out.println(request.getParameter("tutorial_id"));
				
				String id = request.getParameter("tutorial_id");
				
				int tutorialId = Integer.parseInt(id);
				
				Tutorial t = tutorialDao.getSpecificTutorial(tutorialId);
				
				pw.print("<h4>Tutorial details : "+t+"</h4>");
				
				//pw.print("<button onclick='goBack()'>Back</button><script>function goBack(){window.history.back();}</script>");
				
				pw.print("<a href='tutorials?topic_id="+t.getTopicId()+"'><button>Back</button></a>");
				pw.print("<a href='logout'><button>Logout</button><a/>");
				
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
