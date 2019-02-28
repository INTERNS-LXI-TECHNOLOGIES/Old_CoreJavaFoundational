package com.lxisoft.hotel;
import com.lxisoft.admin.*;
import com.lxisoft.customer.*;
import com.lxisoft.fooditem.*;
import java.util.*;
public class Hotel
{

Admin admin=new Admin();
Customer customer=new Customer();
public ArrayList<FoodItem> foodItems=new ArrayList<FoodItem>();


/*Scanner scan=new Scanner(System.in);*/
public void adminPage()
{

admin.addItem(foodItems);

}

public void foodMenu()
{
admin.viewItem(foodItems);
}

public void remove()
{
	admin.removeItem(foodItems);
}
public void placeOrderAndBillPrinting()
{
	customer.placeOrderAndBillPrinting(foodItems);
}
}