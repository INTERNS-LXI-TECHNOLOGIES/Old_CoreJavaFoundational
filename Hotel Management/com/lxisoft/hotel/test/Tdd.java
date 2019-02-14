package com.lxisoft.hotel.test;
import com.lxisoft.hotel.hotel.Hotel;
import java.util.Scanner;
public class Tdd{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Hotel hotel = new Hotel();
		int cont;
		do{
		System.out.println("	Select From Below\n"+" Admin\n"+" User");
		String user = scan.next();
		if(user.toUpperCase().equals("ADMIN")){
			System.out.print("Password : ");
			String password = scan.next();
			if(password.equals("admin")){
				hotel.addFood();
			}
			else{
				System.out.println("	Wrong Password");
			}
		}
		else if(user.toUpperCase().equals("USER")){
			System.out.print("Password : ");
			String password = scan.next();
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