package com.lxisoft.view;
import com.lxisoft.model.*;
import java.util.*;
public class Adminview{

    Admin admin = new Admin();

   public Admin adminDetails(){
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter user name :"); 
    admin.setUsername(sc.next());
    System.out.print("Enter password :");
    admin.setPassword(sc.next()); 
    return admin;
   }
   




}