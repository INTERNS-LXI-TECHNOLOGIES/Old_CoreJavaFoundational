//package com.lxisoft.javaServlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Sample extends HttpServlet
{
public void doPost(HttpServletRequest hsreq, HttpServletResponse hsres)
throws ServletException,IOException
{

	
PrintWriter out=hsres.getWriter();
int s=Integer.parseInt(hsreq.getParameter("Name"));
int value=2,value1;
out.println(s);
hsreq.setAttribute("value",value);
//value1=(int)hsreq.getAttribute("value");
//out.println(value1);
RequestDispatcher r=hsreq.getRequestDispatcher("game2");
r.include(hsreq,hsres);


}

}


