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

public class QuizQuestionService extends HttpServlet {

    private QuizAppController app;

    public void init() {

        this.app = new QuizAppController();

    }

    public void doGet(HttpServletRequest request , HttpServletResponse response) 
    throws IOException , ServletException {

        HttpSession session = request.getSession(false);


        if(session.getAttribute("qid") == null) {

            session.setAttribute("id" , 0);

            int id = (int)session.getAttribute("id");

            Hashtable<String , List<String>> question = this.app.getQuestions().get(id);

            String questionIdStr = question.get("id").get(id);
            int questionId = Integer.parseInt(questionIdStr);

            session.setAttribute("qid" , questionId);          

            Gson json = new Gson();

            JsonElement jsonStr = json.toJsonTree(question);

            response.setContentType("application/json");
            response.getWriter().println(jsonStr);

        }
        else {

            if(request.getParameter("button") != null) {

                
                int i = (int)session.getAttribute("id");
                i++;
                session.setAttribute("id", i);
        
                try {
        
                    Hashtable<String , List<String>> question = this.app.getQuestions().get(i);         
                    
                    if(question.get("id") == null) {

                        response.sendError(1007);
                    }
                    else {

                        session.setAttribute("qid" , question.get("id").get(0));
        
                        Gson json = new Gson();
            
                        JsonElement jsonStr = json.toJsonTree(question);
            
                        response.setContentType("application/json");
                        response.getWriter().println(jsonStr);

                    }
        
                    
                } catch (Exception e) {
     
           
                }
            
            }
    
    
        }

    }
}