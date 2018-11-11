import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SamplePage extends HttpServlet
{
public void doPost(HttpServletRequest hsreq, HttpServletResponse hsres)
throws ServletException,IOException
{
//RequestDispatcher r=new RequestDispatcher();
	
PrintWriter out=hsres.getWriter();
int n=(int)hsreq.getAttribute("value");
String s="sdf";
out.println(n);

}

}
