package com.lxisoft.hotel.readytoeat;
import java.io.*;
import java.util.*;
/**
* This is hotel class for Hotel management program
* which binds management,customer and food
* 
* @author  Amal
* @version 1.0
* @since   2019-03-23
* @lastupdated on 2019-06-27 
*/

public class Hotel{
	String hotelName="Ashokbhavan";
	String hotelAdrs="palakkad";
	String hotelNumbr="0491254462";
	int authOpt;
	String managerPassWord="password";
	String managerPassWordEntered;
	management MgmtAcces=new management();
	public static void clearScreen()
	 {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
		};
	public void printHotelDetails()
	{
		System.out.println("--------WELCOME----------");
		System.out.println("Hotel Name :"+hotelName);
		System.out.println("Hotel Address :"+hotelAdrs);
		System.out.println("Hotel No:"+hotelNumbr);
	}
	public void Authorization(){
		Scanner slct=new Scanner(System.in);
		System.out.println("______Please select the option______");
		System.out.println("1.Management \n 2.Customer");
		authOpt=slct.nextInt();
		
		switch(authOpt)
		{
			case 1:
			{
				int mgmtselct;
				Scanner selectmgmt=new Scanner(System.in);
				clearScreen();
				System.out.println("=========Management Mode==========");
				System.out.println("1.Update/insert food to Menu \n 2.print Menu\n 3.Go back");
				mgmtselct=selectmgmt.nextInt();
				
				switch(mgmtselct)
				{
					case 1:
					{
						clearScreen();
						Scanner passSanner=new Scanner(System.in);
						System.out.println("AUthentication needed!!! please enter password");
						managerPassWordEntered=passSanner.nextLine();
				      if(managerPassWord.equalsIgnoreCase(managerPassWordEntered))
					  {
						  clearScreen();
						  System.out.println("ACCESS GRANTED!!");
						  MgmtAcces.insertFood();
					  }
					  else
					  {
						  
						  System.out.println("ACCESS DENIED");
						  
						  Authorization();
					  }
					}
					case 2:
					{
						MgmtAcces.displayFood();
					}
					case 3:
					{
						clearScreen();
						printHotelDetails();
						Authorization();
					}
					default :
					{
						System.out.println("CHECK OPTION PLEASE!!!!!");
						Authorization();
					}
				}
				
			}
			case 2:
			{
				//customermode();
			} 
			default:
			{
				System.out.println("ALERT.....!!!!! wrong option please select correct one");
				Authorization();
			}
		}
	}

}