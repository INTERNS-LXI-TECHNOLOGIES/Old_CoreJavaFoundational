package com.lxisoft.hotel.hotel;
import java.io.*;
public class Food implements Serializable{
	private String name;
	private int price;
	private int nos;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
	public void setNos(int nos){
		this.nos = nos;
	}
	public int getNos(){
		return nos;
	}
}