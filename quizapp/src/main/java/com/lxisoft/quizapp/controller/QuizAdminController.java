package com.lxisoft.quizapp.controller;

import java.util.List;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import com.google.gson.Gson;


import com.lxisoft.quizapp.model.Option;
import com.lxisoft.quizapp.model.Question;
import com.lxisoft.quizapp.model.User;
import com.lxisoft.quizapp.model.Site;
import com.lxisoft.quizapp.repository.SqlRepository;

public class QuizAdminController {

    private SqlRepository<Question> questionTable;

    private SqlRepository<Option> optionTable;

    private SqlRepository<User> userTable;

    public QuizAdminController() {

        try {

            this.optionTable = new SqlRepository<>(Option.class);
            this.questionTable = new SqlRepository<>(Question.class);
            this.userTable = new SqlRepository<>(User.class);

        } catch (Exception e) {

            e.printStackTrace();
        }
      
    }

    public List<Hashtable<String , List<String>>> getQuestions() {

        List<Hashtable<String , List<String>>> qodatas  = new ArrayList<>();

        Hashtable<String , List<String>> questiondata = null;
 
        List<Question> questions = this.questionTable.retrieve();


        for(Question tquest : questions) {


            List<String> id = new ArrayList<>();
            id.add(tquest.getId() + "");

            questiondata = new Hashtable<>();

            Option opt = this.optionTable.retrieve("WHERE id = " + tquest.getOptionId()).get(0);
            questiondata.put(tquest.getQuestion(), opt.getOptions());
            questiondata.put("id" , id );
            qodatas.add(questiondata);
        }

        return qodatas;

    }

    public List<Hashtable<String , String>> getUsers() {

        List<Hashtable<String , String>> udatas = new ArrayList<>();
        List<User> users = this.userTable.retrieve();
        Hashtable<String , String> user = null;

        for(User tuser : users) {

            user = new Hashtable<>();

            user.put("id" , tuser.getId() + "");
            user.put("name" , tuser.getName());
            user.put("email" , tuser.getEmail());
            user.put("username" , tuser.getUsername());
            user.put("password", tuser.getPassword());
            
            udatas.add(user);
        }

        return udatas;
    }

    public Hashtable<String , String> getQuestionById(int id) {

        try {
            
            List<Question> question  = this.questionTable.retrieve("WHERE id = " + id);

           Hashtable<String , String> answer = new Hashtable<>();

           answer.put("answer", question.get(0).getAnswer());

           return answer;
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }

        return null;
    }

    public Hashtable<String , String> getUserById(int id) {

        List<User> users = this.userTable.retrieve("WHERE id = " + id);

        if(users.size() == 1) {

            Hashtable<String , String> user = new Hashtable<>();

            user.put("username", users.get(0).getUsername());

            return user;
        }

        return null;

    }

    public String getProfileJson(String username) {

        try {

            List<User> users = this.userTable.retrieve("WHERE username = '" + username + "'");

            if(users.size() == 0) {

                return null;
            }
            else {

                User user = users.get(0);

                Hashtable<String , String> userProfileMap = new Hashtable<>();

                userProfileMap.put("name" , user.getName());
                userProfileMap.put("email" , user.getEmail());
                userProfileMap.put("username" , user.getUsername());

                Gson userJson = new Gson();

                return userJson.toJson(userProfileMap);
            }

            
        } catch (Exception e) {
            
            e.printStackTrace();
        }

        return null;
    }

    public int getUserByEmail(String email) {
       
        try {

            List<User> users = this.userTable.retrieve("WHERE email = '" + email + "'");

            if(users.size() == 0) {

                return -1;
            }
            else {

                return 1;
            }

            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        return -1;


    }

    public int getUser(String username) {

        try {

            List<User> users = this.userTable.retrieve("WHERE username = '" + username + "'");

            if(users.size() == 0) {

                return -1;
            }
            else {

                User user = users.get(0);
                
                return user.getId();    
            }

            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        return -1;
    }

    public boolean addQuestion(Hashtable<String, List<String>> data , String answer) {

        try {
            
            Enumeration<String> dataQuestion = data.keys();
            List<String> dataOptions = data.get(dataQuestion.nextElement());
    
            Option options = new Option();
            options.setOptions(dataOptions);
    
            this.optionTable.create(options);
    
            Question question = new Question();
            question.setQuestion(data.keys().nextElement());
            question.setAnswer(answer);

            question.setOptionId(this.optionTable.getLastInsertId());
            
            this.questionTable.create(question);    

        } catch (Exception e) {
            
            e.printStackTrace();
        }

        return false;

    }

    public boolean editQuestion(int qid , Hashtable<String, List<String>> data , String answer) {

        try {
            
            Enumeration<String> dataQuestion = data.keys();
            List<String> dataOptions = data.get(dataQuestion.nextElement());
    
            Option options = new Option();
            options.setOptions(dataOptions);
    
            this.optionTable.create(options);
    
            Question question = new Question();
            question.setQuestion(data.keys().nextElement());
            question.setAnswer(answer);
            question.setOptionId(qid); 
            question.setId(qid);
 
            this.questionTable.update(question);    

        } catch (Exception e) {
            
            e.printStackTrace();
        }

        return false;
    }

    public boolean removeQuestion(int qid) {

        Question question = this.questionTable.retrieve("WHERE id = " + qid).get(0);
        Option option = this.optionTable.retrieve("WHERE id = " + question.getOptionId()).get(0);

        if(this.questionTable.delete(question)) {

            if(this.optionTable.delete(option)) {

                return true;
            }
        }

        return false;
    }


    public boolean addUser(Hashtable<String , String> userDetails) {

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

            if(this.userTable.create(obj)) {

                return true;
            }
            
        } catch (Exception e) {

            e.printStackTrace();
        }


        return false;
    }

    public boolean editUser(int uid ,Hashtable<String , String> userDetails) {

        User user = new User();

        user.setId(uid);
        user.setName(userDetails.get("name"));
        user.setEmail(userDetails.get("email"));
        user.setUsername(userDetails.get("username"));
        user.setPassword(userDetails.get("password"));

        try {

            if(this.userTable.update(user)) {

                return true;
            }
            
        } catch (Exception e) {

            e.printStackTrace();
        }

        return false;
    }

    public boolean removeUser(int uid) {

        User user = this.userTable.retrieve(" WHERE id = " + uid).get(0);

        if(this.userTable.delete(user)) {

            return true;
        }

        return false;
    }
}