package com.lxisoft.quizapp.controller;

import java.util.Hashtable;

import com.lxisoft.quizapp.model.User;
import com.lxisoft.quizapp.repository.SqlRepository;

public class QuizRegisterController {

    private SqlRepository<User> userTable;

    public QuizRegisterController() {

        try {

            this.userTable = new SqlRepository<>(User.class);

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public boolean registerUser(Hashtable<String,String> userDetails) {

        String name = userDetails.get("name");
        String email = userDetails.get("email");
        String username = userDetails.get("username");
        String password = userDetails.get("password");

        User obj = new User();
        obj.setName(name);
        obj.setEmail(email);
        obj.setUsername(username);
        obj.setPassword(password);

        try {

            this.userTable.create(obj);
            
        } catch (Exception e) {

            e.printStackTrace();
        }

        return true;
    }

}