package com.lxisoft.hotel.model;
import java.io.*;
public class Food implements Comparable<Food>{
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
	public String toString(){
		return name+","+price+","+nos;
	}
	public int compareTo(Food a){
		return this.name.compareTo(a.name);
	}
}