import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Sample extends HttpServlet
{
public void doPost(HttpServletRequest hsreq,HttpServletResponse hsres)
throws ServletException, IOException
	{
		PrintWriter out=hsres.getWriter();
		String name="hhu";
		out.println(name);
	}
}
