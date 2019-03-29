package com.lxisoft.mvc;
import com.lxisoft.hotel.*;
import com.lxisoft.mvc.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class HotelController
{
	Scanner scan=new Scanner (System.in);
	public void calling()throws Exception
	{
	Admin admin=null;
	Cashier cashier=null;
	Customer customers=null;
	ArrayList<Food> foods=null;
    HotelModel hm=new HotelModel();
	HotelView hv=new HotelView();
	int d=0;
	do
	      {
			hv.authendication(admin,cashier,customers, foods);
			System.out.println("do you want to continue\nyes=1 \n no=0");
		 d=scan.nextInt();
		  }
        while(d==1);		 
	}
}