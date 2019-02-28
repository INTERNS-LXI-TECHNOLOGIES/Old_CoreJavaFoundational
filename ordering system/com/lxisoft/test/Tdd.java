package com.lxisoft.test;
import com.lxisoft.hotel.*;
public class Tdd
{
public static void main(String args[])
{
Hotel hotel=new Hotel();

hotel.adminPage();
hotel.foodMenu();
hotel.remove();
hotel.placeOrderAndBillPrinting();
}
}