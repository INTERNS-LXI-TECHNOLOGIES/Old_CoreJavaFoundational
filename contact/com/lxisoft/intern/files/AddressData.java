//package com.lxisoft.intern.files.AddressData;
import java.io.*;
import java.util.*;
public class AddressData
{   
    static BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
	 static Scanner in = new Scanner(System.in);
	String address;
	String pincode;
	public void readAddress()
	{
		Data d = new Data();
		try{
      System.out.println("Enter the address:");
      this.address = input.readLine();
      d.setAddress(address);
      System.out.println("Enter the pincode:");
      this.pincode = input.readLine();}catch(IOException e) {}
      d.setPincode(pincode);
       
      
	}
}

