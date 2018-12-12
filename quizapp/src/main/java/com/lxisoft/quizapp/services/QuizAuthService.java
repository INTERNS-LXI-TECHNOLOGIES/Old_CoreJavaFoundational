package com.lxisoft.quizapp.services;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.quizapp.controller.QuizAppController;

public class QuizAuthService extends HttpServlet {

    private QuizAppController app;

    public void init() {

        this.app = new QuizAppController();

    }

    public void doPost(HttpServletRequest request , HttpServletResponse response) 
    throws IOException , ServletException {

        HttpSession session = request.getSession(false);

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(this.app.getQuizauthcontroller().authenticate(username, password)) {

            response.setContentType("application/json");

            String json = app.getQuizadmincontroller().getProfileJson(username);

            session.setAttribute("user", app.getQuizadmincontroller().getUser(username));

            if(json != null) response.getWriter().println(json);
        }
        else {

            response.sendError(1001);
        }



    }
}