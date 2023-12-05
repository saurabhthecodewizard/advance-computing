package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("in do-get : invoked by "+Thread.currentThread());//name,prio,thrd grp
		//set response content type : text/html
		resp.setContentType("text/html");//resp hdr
		//resp body : will be sent from servlet ----->web browser : PW : char , buffered o/p strm
		try(PrintWriter pw=resp.getWriter())
		{
			pw.print("<h4>Welcome 2 second Servlets ...."+LocalDateTime.now()+"</h4>");
		}
		
	}

	@Override
	public void destroy() {
		System.out.println("in second destroy : invoked by "+Thread.currentThread());//name,prio,thrd grp
	}

	@Override
	public void init() throws ServletException {
		System.out.println("in second init : invoked by "+Thread.currentThread());//name,prio,thrd grp
	}
	
	

}