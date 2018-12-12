package com.lxisoft.quizapp.services;

import java.io.IOException;
import java.util.Hashtable;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.lxisoft.quizapp.controller.QuizAppController;;

public class QuizAnswerService extends HttpServlet {

    private QuizAppController app;

    public void init() {

        this.app = new QuizAppController();

    }

    public void doGet(HttpServletRequest request , HttpServletResponse response) 
    throws IOException , ServletException {

        HttpSession session = request.getSession(false);

        if(session.getAttribute("score") == null) {

            session.setAttribute("score", 0);
        }

        int score = (int)session.getAttribute("score");


        if(request.getParameter("button") != null) {

            response.sendError(1007);
        }
        if(session.getAttribute("qid") != null) {

            int questionId =  (Integer)session.getAttribute("qid");

            Hashtable<String , String> answer = this.app.getQuizadmincontroller().getQuestionById(questionId);

            if(answer.get("answer").equals(request.getParameter ("answer"))) {

                score =+ 10;
            }

            Hashtable<String , String> scoreJson = new Hashtable<>();
            scoreJson.put("score", score + "");

            Gson json = new Gson();

            String jsonStr = json.toJson(scoreJson);

            response.setContentType("application/json");
            response.getWriter().println(jsonStr);
           
        }
        else {

            response.sendError(1006);
        }

    }
}