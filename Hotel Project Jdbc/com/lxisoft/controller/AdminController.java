package com.lxisoft.controller;
import com.lxisoft.model.*;
import java.util.*;
public class AdminController{
    boolean flagCheckUser; 
    boolean flagCheckPassword;
    String username="rahul";
    String password="rahul";
    Admin admin = new Admin();

  
    public boolean checkPassword(){
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter user name :"); 
        admin.setUsername(sc.next());
        System.out.print("Enter password :");
        admin.setPassword(sc.next());     
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
            
        }while(count!=1);
        
    return(false);
     
}        
        
}