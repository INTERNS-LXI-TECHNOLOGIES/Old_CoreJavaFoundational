package com.lxisoft;

import com.lxisoft.controller.AdminController;
import com.lxisoft.controller.*;

public class Tdd{
public static void main(String[] args)throws Exception {
    FoodController food = new FoodController();
    AdminController admin = new AdminController();
    HotelController hotel = new HotelController();
    
    admin.checkPassword();
    food.foodDetails();
	hotel.list();
}    
}
