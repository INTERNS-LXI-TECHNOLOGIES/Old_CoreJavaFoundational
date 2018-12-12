package com.lxisoft.quizapp.filters;

import java.io.IOException;
import java.util.Hashtable;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.lxisoft.quizapp.controller.QuizAppController;

public class QuizRegisterFilter implements Filter {

    private QuizAppController app;

    public void init(FilterConfig config) {

        this.app = new QuizAppController();
    }

    public void doFilter(ServletRequest req , ServletResponse res , FilterChain chain) 
    throws IOException , ServletException {

        HttpServletResponse response = ((HttpServletResponse)res);
        HttpServletRequest request = ((HttpServletRequest)req);

        HttpSession session = request.getSession(false);

        if(session.getAttribute("user") != null) {

            response.sendError(404);
        }
        else {

            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
    
          
            
            if(name.length() == 0 || email.length() == 0 || username.length() == 0 || password.length() == 0) {
    
                response.sendError(1005);
            }
    
            if (app.getQuizadmincontroller().getUser(username) != -1) {
    
                response.reset();
                response.sendError(1002);
    
            } else if(app.getQuizadmincontroller().getUserByEmail(email) != -1)  {
    
                response.reset();
                response.sendError(1003);
            }    

        } 

    }

    public void destroy() {

    }
}
