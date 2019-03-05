package com.lxisoft;
import com.lxisoft.controller.*;
import com.lxisoft.view.*;
import com.lxisoft.model.*;

class Tdd{
    public static void main(String[] args) throws Exception{
            
AdminController adminc = new AdminController();
HotelController hotelc = new HotelController();
Customerview customer = new Customerview();
customer.customerData();
adminc.checkPassword();
hotelc.hotelDetails();
}
}