package com.lxisoft.hotel;
import com.lxisoft.menu.Menu;
import com.lxisoft.admin.Admin;
import com.lxisoft.customer.Customer;
public class Hotel{
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.customerDetails();
        Menu menu = new Menu();
        menu.list();
        Admin admin = new Admin();
        admin.adminmenu();

        
    }

}