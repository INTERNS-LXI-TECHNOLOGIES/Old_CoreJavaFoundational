package com.lxisoft.hotel.test;
import com.lxisoft.hotel.hotel.Hotel;
import java.util.Scanner;
import java.io.*;
public class Tdd{
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		Console c = System.console();
		Hotel hotel = new Hotel();
		int cont;
		char[] p;
		do{
		System.out.println("	Select From Below\n"+" Admin\n"+" User");
		String user = scan.next();
		if(user.toUpperCase().equals("ADMIN")){
			System.out.print("Password : ");
			p = c.readPassword();
			String password = String.valueOf(p);
			if(password.equals("admin")){
				System.out.println("1.Add Food\n2.Edit Food\n3.Delete Food");
				int select = scan.nextInt();
				switch(select){
					case 1:
					hotel.addFood();
					break;
					case 2:
					hotel.editFood();
					break;
				}
			}
			else{
				System.out.println("	Wrong Password");
			}
		}
		else if(user.toUpperCase().equals("USER")){
			System.out.print("Password : ");
			p = c.readPassword();
			String password = String.valueOf(p);
			if(password.equals("user")){
				hotel.sellFood();
			}
			else{
				System.out.println("	Wrong Password");
			}
		}
		else{
			System.out.println("	Invalid Entry");
		}
		System.out.println("Press 1 To Continue");
		cont = scan.nextInt();
		}while(cont == 1);
	}
}