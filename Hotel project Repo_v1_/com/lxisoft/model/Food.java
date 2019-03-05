package com.lxisoft.model;

public class Food{
	
	int price;
    String Name;
    int quantity;

    public void setName(String name) {
        Name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getName() {
        return Name;
    }public int getPrice() {
        return price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
      
   
  
	

}