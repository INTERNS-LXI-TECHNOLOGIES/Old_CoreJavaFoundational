package com.lxisoft.quizapp.controller;

import java.util.List;

import com.lxisoft.quizapp.model.User;
import com.lxisoft.quizapp.repository.SqlRepository;

public class QuizAuthController {

    private SqlRepository<User> userTable;

    public QuizAuthController() {

        try {

            this.userTable = new SqlRepository<>(User.class);    
            
        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public boolean authenticate(String username , String pwd) {
 
        List<User> user = this.userTable.retrieve("WHERE username = '" + username + "'");

        if(user.size() == 1) {

            String password = user.get(0).getPassword();

            if(password.equals(pwd)) {
                
                return true;
            }
            else {
                
                System.out.println("Passwords are not equak" + password + "=" + pwd);
            }
        }

        return false;

    }


}