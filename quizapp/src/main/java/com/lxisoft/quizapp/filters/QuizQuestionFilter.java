package com.lxisoft.quizapp.filters;

import java.io.IOException;
import java.util.Hashtable;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.lxisoft.quizapp.controller.QuizAppController;

public class QuizQuestionFilter implements Filter {

    private QuizAppController app;

    public void init(FilterConfig config) {

        this.app = new QuizAppController();
    }

    public void doFilter(ServletRequest req , ServletResponse res , FilterChain chain) 
    throws IOException , ServletException {

        HttpServletResponse response = ((HttpServletResponse)res);
        HttpServletRequest request = ((HttpServletRequest)req);

        HttpSession session = request.getSession(false);

        if(session.getAttribute("user") == null) {

            response.sendError(404);
        }

    }

    public void destroy() {

    }
}
