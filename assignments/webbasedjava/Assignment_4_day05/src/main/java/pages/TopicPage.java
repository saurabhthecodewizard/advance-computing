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

import dao.TopicDaoImpl;
import pojos.Topic;
import pojos.User;

/**
 * Servlet implementation class TopicPage
 */
@WebServlet("/topics_list")
public class TopicPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		
		try(PrintWriter pw = response.getWriter())
		{
			pw.print("<h5>Topics Page</h5>");
			
			HttpSession hs = request.getSession();

			System.out.println("New session " + hs.isNew());
			System.out.println("session ID " + hs.getId());
			
			
			
			User user = (User) hs.getAttribute("user_details");
			
			if(user!=null)
			{
				pw.print("<h5>Hello user, "+user.getName()+"</h5>");
				
				TopicDaoImpl topicDao = (TopicDaoImpl) hs.getAttribute("topics_dao");
				
				List<Topic> topics = topicDao.getTopics();
				
				System.out.println(topics);
				
				
              pw.print("<h5> Candidate List </h5>");
				// dyn form generation
				pw.print("<form action='tutorials'>");
				pw.print("<h5>");
				for (Topic t : topics)
					pw.print("<input type=radio name='topic_id' value=" + t.getId() + " >" + t.getName()
							+ "<br/>");
				pw.print("<input type=submit value='Choose'>");
				pw.print("</h5>");
				pw.print("</form>");
				
//				pw.print("<h5> Topic list </h5>");
//				
//				pw.print("<form action='tutorials'");
//				pw.print("<h5>");
//				for(Topic t : topics)
//					pw.print("<input type=radio name='topic_id' value="+t.getId()+" >"+t.getName()+"<br/>");
//				pw.print("<input type=submit value = 'Choose topic'>");
//				pw.print("</h5>");
//				pw.print("</form>");
				
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
