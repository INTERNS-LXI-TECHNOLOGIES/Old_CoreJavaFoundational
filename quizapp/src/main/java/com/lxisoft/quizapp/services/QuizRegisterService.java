package com.lxisoft.quizapp.services;

import java.io.IOException;
import java.util.Hashtable;

import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.quizapp.controller.QuizAppController;

public class QuizRegisterService extends HttpServlet {

    private QuizAppController app;

    public void init() {

        this.app = new QuizAppController();

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        HttpSession session = request.getSession(false);

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Hashtable<String, String> userDetails = new Hashtable<>();
        userDetails.put("name", name);
        userDetails.put("email", email);
        userDetails.put("username", username);
        userDetails.put("password", password);

        if (app.getQuizregistercontroller().registerUser(userDetails)) {

            session.setAttribute("user", app.getQuizadmincontroller().getUser(username));

            // Send back Profile json Back to Browser

            response.setContentType("application/json");

            String json = app.getQuizadmincontroller().getProfileJson(username);

            response.getWriter().println(json);

        }

    }
}