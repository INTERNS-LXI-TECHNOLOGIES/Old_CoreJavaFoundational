package com.lxisoft.view;
import com.lxisoft.model.*;
import java.util.Scanner;
public class Customerview{
    
    Customer customer = new Customer();
 
    public void customerData(){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Customer name : "); 
        customer.setName(sc.next());    
        System.out.print("Enter table no. :"); 
        customer.setTableNo(sc.nextInt());
        }
    
}