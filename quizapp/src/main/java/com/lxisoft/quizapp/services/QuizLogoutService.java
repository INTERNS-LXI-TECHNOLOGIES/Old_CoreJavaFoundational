package com.lxisoft.quizapp.services;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class QuizLogoutService extends HttpServlet {

    public void doPost(HttpServletRequest request , HttpServletResponse response) 
    throws IOException , ServletException {

        request.getSession().setAttribute("user", null);

        request.getSession().invalidate();

        response.getWriter().println("/quizapp/");
    }
}