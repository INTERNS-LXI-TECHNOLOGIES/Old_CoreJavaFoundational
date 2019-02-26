package com.lxisoft.view.Customerview;
public class Customerview{
 
    public void customerData(){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter table no. :"); 
        setTableNo(sc.nextInt());
        System.out.print("Enter Customer name : "); 
        SetName(sc.next()); 
    }
    
}