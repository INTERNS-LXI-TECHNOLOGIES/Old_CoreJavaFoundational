package com.lxisoft.tdd;
import com.lxisoft.hotel.Hotel;
import java.util.Scanner;
public class Tdd
{
public static void main (String args[])throws Exception
{
Scanner scan=new Scanner(System.in);
int d;
Hotel hotel=new Hotel();
		do
	      {
			hotel.authendication();
			System.out.println("do you want to continue\nyes=1 \n no=0");
			d=scan.nextInt();
				 
		  }
        while(d==1);		 
	
}
}