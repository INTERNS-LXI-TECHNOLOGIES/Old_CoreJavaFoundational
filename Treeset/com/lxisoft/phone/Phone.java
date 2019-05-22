package com.lxisoft.phone;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Phone implements Comparable<Phone>{

	public String brand;
	public String model;
	public int price;
public Phone(String model,String brand,int price){
	
	this.brand=brand;
	this.model=model;
	this.price=price;
}
public void setBrand(String brand){
	this.brand=brand;
}
 public String getBrand(){
 	return brand;
}
public boolean equals(Object p) {

    return (this.brand).equals(((Phone)p).brand);
}
public int compareTo(Phone phone) {  
    
    return brand.compareTo(phone.brand);
} 
public String toString(){

    return brand + ", " +model+", " +price;
}
}