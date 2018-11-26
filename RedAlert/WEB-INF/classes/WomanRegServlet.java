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
Women women=new Women();
//int age=Integer.parseInt(request.getParameter("age"));
women.setName(request.getParameter("name"));
//String name=request.getParameter("name");
women.setLocality(request.getParameter("location"));
women.setAge(Integer.parseInt(request.getParameter("age")));
women.setEmail(request.getParameter("email"));
women.setPassword(request.getParameter("password"));

wrc.saveWomanDetails(women.getName(),women.getLocality(),women.getAge(),women.getEmail(),women.getPassword());
out.println(women.getEmail());
out.println(women.getPassword());
}
}