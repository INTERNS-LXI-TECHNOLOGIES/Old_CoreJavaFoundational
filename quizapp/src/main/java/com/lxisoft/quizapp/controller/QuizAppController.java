package com.lxisoft.quizapp.controller;

import java.util.List;
import java.util.Hashtable;

import com.lxisoft.quizapp.repository.DBConnection;

public class QuizAppController {

    private QuizAuthController quizAuthController;

    private QuizRegisterController quizRegisterController;

    private QuizAdminController quizAdminController;

    private QuizSiteController quizSiteController;


    public QuizAppController() {
        
        try {
            
            Hashtable<String , String> parameters = new Hashtable<>();
            parameters.put("driver" , "org.mariadb.jdbc.Driver");
            parameters.put("host" , "jdbc:mariadb://localhost/");
            parameters.put("database" , "test");
            parameters.put("user" , "jishnu");
            parameters.put("pwd" , "123");

            DBConnection.setParameters(parameters);
            
            // Create Instances of all other Controllers Here

            this.quizRegisterController = new QuizRegisterController();
            this.quizAuthController = new QuizAuthController();
            this.quizAdminController = new QuizAdminController();
            this.quizSiteController = new QuizSiteController();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    // Getters and setters

    public QuizAuthController getQuizauthcontroller()
	{
		return this.quizAuthController;
	}

	public void setQuizauthcontroller(QuizAuthController quizAuthController)
	{
		this.quizAuthController = quizAuthController;
    }
    
	public QuizRegisterController getQuizregistercontroller()
	{
		return this.quizRegisterController;
	}

	public void setQuizregistercontroller(QuizRegisterController quizRegisterController)
	{
		this.quizRegisterController = quizRegisterController;
    }
    
    public QuizAdminController getQuizadmincontroller()
	{
		return this.quizAdminController;
	}

	public void setQuizadmincontroller(QuizAdminController quizAdminController)
	{
		this.quizAdminController = quizAdminController;
    }

    public QuizSiteController getQuizsitecontroller()
	{
		return this.quizSiteController;
	}

	public void setQuizsitecontroller(QuizSiteController quizSiteController)
	{
		this.quizSiteController = quizSiteController;
    }
    
    public List<Hashtable<String , List<String>>> getQuestions() {

        return this.getQuizadmincontroller().getQuestions();
    }
    
}

