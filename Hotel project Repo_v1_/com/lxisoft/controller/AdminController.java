package com.lxisoft.controller;
import com.lxisoft.view.*;
import com.lxisoft.model.*;
public class AdminController{
    Admin admin;
    Adminview adminview =new Adminview();
    boolean flagCheckUser; 
    boolean flagCheckPassword;
    String username="rahul";
    String password="rahul";
    

    public boolean checkPassword(){
    
        this.admin=adminview.adminDetails();
        flagCheckUser=admin.getUsername().equals(this.username);
        flagCheckPassword=admin.getPassword().equals(this.password); 
        int count=0;
        do{
            if (flagCheckUser==true) { 
            
                if(flagCheckPassword==true){ 
            
                    System.out.println("Login success...."); 
                    return(true); 
                }
                else{
            
                    System.out.println("___________________Sorry Try again___________________"); 
                    ++count; 
                    if(count==3) { 
                        break; 
                    } 
                } 
            }
            else { 
                
                System.out.println("___________________Sorry Try again___________________"); 
                ++count; 

                if (count==3) break; 
            } 
            
        }while(count!=3);
        
    return(false);
     
}        
        
}