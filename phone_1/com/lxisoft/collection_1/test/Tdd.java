package com.lxisoft.test;
import com.lxisoft.phone.Phone;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Tdd{

	public static void main(String[] args){
		LinkedHashSet<Phone> phone = new LinkedHashSet<Phone>();
	
		Phone phone1=(new Phone("iPhoneX","apple",25000));
		Phone phone2=(new Phone("PhoneX","apple",25000));
		phone.add(phone1);
		phone.add(phone2);
		System.out.println(phone.toString());
		System.out.println(phone.hashCode());
	
}

	
}