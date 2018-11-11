import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Addition extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
		{
			int num1=Integer.parseInt(request.getParameter("number1"));
			int num2=Integer.parseInt(request.getParameter("number2"));
			int sum=num1+num2;
			
		 PrintWriter writer=response.getWriter();
		 
		 request.setAttribute("sum",sum);
		 writer.println(sum);
	    
		 RequestDispatcher rd=request.getRequestDispatcher("square");  
         rd.include(request, response); 
		
		}
}
