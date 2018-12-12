package com.lxisoft.quizapp.services;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

import com.google.gson.JsonObject;
import com.lxisoft.quizapp.controller.QuizAppController;

public class QuizMainService extends HttpServlet {

    private QuizAppController app;

    public void init() {

        this.app = new QuizAppController();

    }

    public void doPost(HttpServletRequest request , HttpServletResponse response) 
    throws IOException , ServletException {

        HttpSession session = request.getSession();

        if(session.getAttribute("user") != null) {

            int id = (int)session.getAttribute("user");
            String username = app.getQuizadmincontroller().getUserById(id).get("username");
            String json = app.getQuizadmincontroller().getProfileJson(username);
  
            response.setContentType("application/json");
            response.getWriter().println(json);
        }
        else {

            JsonObject json = new JsonObject();
            json.addProperty("status", "login");


            response.setContentType("application/json");
            response.getWriter().println(json);
        }
    }
}