package com.lxisoft.shop;
import com.lxisoft.phone.Phone;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Shop{
	
	Scanner scan = new Scanner(System.in); 
	String brand=null;
	String model=null;
public void setPhone(){
	TreeSet<Phone> phones = new TreeSet<Phone>();
	
		Phone phone1=new Phone("iPhoneX","apple",25000);
		Phone phone2=new Phone("motorola","Lenovo",10000);
		Phone phone3=new Phone("galaxyS5","Samsung",15000);
		phones.add(phone1);
		phones.add(phone2);
		phones.add(phone3);
		System.out.println(phones.toString());
		for(Phone p:phones){
			System.out.println(p.brand+" "+p.model+" "+p.price);
		}
	ArrayList<Amazon> ph = new ArrayList<Amazon>();
		ph.add(new Amazon("asdff","adffd",12334));
		ph.add(new Amazon("qwerty","rtyu",123490));
	ArrayList<Flipcart> phn = new ArrayList<Filpcart>();
		ph.add(new Flipcart("as","afd",124));
		ph.add(new Flipcart("qwty","rtu",12490));

		System.out.println("Enter a brand:");
		brand=scan.next();
		System.out.println(phones.size());
		Iterator <Phone>itr=phones.iterator();  
	while(itr.hasNext()){  
		System.out.println(brand.equals(itr.next()));  
		  
		// for(int i=0;i<phones.size();i++){

		// 	if(brand.equals(phones.getBrand())){

		// 	System.out.println("done");
		// 	}
		// 	else
		// 	{
		// 	System.out.println("not done");	
		// 	}
		// }
	}
}
}