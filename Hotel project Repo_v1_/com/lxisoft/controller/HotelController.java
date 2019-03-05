package com.lxisoft.controller;
import com.lxisoft.view.*;
import java.util.*;
public class HotelController {
    
    Hotelview hotelView = new Hotelview();
    Menuview menuView = new Menuview();
    public void hotelDetails()throws Exception{
        hotelView.foodDetails();
        menuView.list();
    }

    public void displayMainMenu(ArrayList list) { 
        int i=1; 
        Iterator itr1=list.iterator(); 
        while(itr1.hasNext()) { 
            System.out.println(" "+i+"."+itr1.next()); 
            i++; 
        } 
    }
    
}