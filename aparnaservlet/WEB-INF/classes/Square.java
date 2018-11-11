import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Square extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
		{
			//int num1=Integer.parseInt(request.getParameter("number1"));
			//int num2=Integer.parseInt(request.getParameter("number2"));
		    int sum = (int)request.getAttribute("sum");
			
			int square=sum * sum;
			
			
		 PrintWriter writer=response.getWriter();
		 writer.println(square);
		}
}
