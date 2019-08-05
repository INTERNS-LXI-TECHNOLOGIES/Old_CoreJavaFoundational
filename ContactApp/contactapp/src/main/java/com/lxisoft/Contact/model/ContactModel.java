package com.lxisoft.Contact.model;
import java.util.*;
public class ContactModel{

	private String name;
	private ArrayList<String> phoneNumber;
	private String mailId;

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setPhoneNumber(ArrayList<String> phoneNumber){
		this.phoneNumber=phoneNumber;
	}
	public ArrayList<String> getPhoneNumber(){
		return this.phoneNumber;
	}
	public void setMailId(String mailId){
		this.mailId=mailId;
	}
	public String getMailId(){
		return this.mailId;
	}
	public String toString(){  
		return name+" "+phoneNumber+" "+mailId;
	}

}