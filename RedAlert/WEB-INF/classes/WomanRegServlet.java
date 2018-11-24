import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class WomanRegServlet extends HttpServlet
{
public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException,IOException
{	
WomanRegController wrc=new WomanRegController();
PrintWriter out=response.getWriter();
int age=Integer.parseInt(request.getParameter("username"));
wrc.saveWomanDetails(age);
out.println(age);
}
}