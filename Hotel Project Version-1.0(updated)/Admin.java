package com.lxisoft.admin;
import com.lxisoft.menu.Menu;
import java.util.*;
public class Admin{
 
    public String userName;
    public String password;
    public String username;
    public String passWord;


    public Admin() { 
        userName="admin"; 
        passWord="system"; 
    } 

    public boolean checkPassword() { 
    
        Scanner sc=new Scanner(System.in); 
        int count=0; 
        
        System.out.print("Enter username :"); 
        username=sc.next(); 
        System.out.print("Enter password :");
        password=sc.next(); 
        boolean flag_check_user; 
        boolean flag_check_password;
        if(username.equals(userName)){
        flag_check_user=username.equals(userName);
        
        if(password.equals(passWord)){
        flag_check_password=password.equals(passWord);
         
        do{
            if (flag_check_user==true) { 
            
                if(flag_check_password==true){ 
            
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
                
                System.out.println("___________________Sorry plz Try again___________________"); 
                ++count; 
            
                if (count==3) break; 
            } 
            
        }while(count!=3);
    }
}
    return(false); 
}
        
            

    
    

public void resetPassword() { 
    Scanner sc = new Scanner(System.in);
    String psw=passWord; 
    System.out.print("Enter current password : "); 
    password=sc.nextLine(); 
    boolean flag_check_password=password.equals(psw); 
    if(flag_check_password==true) {
        System.out.print("Enter New password : "); 
        passWord=sc.next(); 
        System.out.print("Enter New password again : "); 
        String ps=sc.next(); 
        if(passWord.equals(ps)) { 
            passWord=ps;
            System.out.println("Reset password....."); 
        } 
        else { 
            System.out.print("password not match : ");
            passWord=psw; 
        }
    } 
}
    
 
public void adminmenu() {
    Admin admin1=new Admin(); 
    Scanner sc=new Scanner(System.in); 
    int ch; 
    ch=1; 
    Menu show_menu = new Menu(); 
    boolean flag=false; 
    boolean flag1=false;
    boolean flag2;  
    
    flag=show_menu.list(); 
        if(flag==true) { 
            flag1=admin1.checkPassword(); 
            if(flag1==true) {
                System.out.println("____________________Admin menu____________________");
                System.out.println("1.Add item"); 
                System.out.println("2.Remove item"); 
                System.out.println("3.Edit profile"); 
                System.out.println("4.Reset Password"); 
                System.out.println("5.Exit");
                System.out.print("Enter your choice : "); 
                ch=sc.nextInt(); 
                switch(ch) { 
                    case 1: show_menu.additem(); 
                    break; 
                    case 2: show_menu.removeitem(); 
                    break; 
                    case 3: show_menu.editprofile(); 
                    break; 
                    case 4: admin1.resetPassword(); 
                    break; 
                    case 5: break; 
                    default: break; 
                } 
            } 
        } 
        
//while(ch!=5); 
} 
} 

 


