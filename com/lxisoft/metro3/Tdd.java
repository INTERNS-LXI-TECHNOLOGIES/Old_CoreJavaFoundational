package com.lxisoft.metro3;
import java.util.Scanner;
public class Tdd{
public static void main (String[] args){
	int cont;
	int login;
	String password;
	Metro metro = new Metro();
	//Ticket ticket = new Ticket();
	Scanner scan = new Scanner(System.in);
	do{
	System.out.println("1.Admin\n2.User");
	login = scan.nextInt();
	if(login==1){
		do{
		System.out.print("password : ");
		password = scan.next();
		if(password.equals("admin")){
		metro.setPlatformDetails();
		}
	else{
		System.out.println("Wrong Password!!!\nTry Again!!");		
	}
	}while(!password.equals("admin"));
	}
	if(login==2){
		metro.reservation();
	}
	System.out.println("Press 1 To Continue | Press 2 To Continue");
	cont = scan.nextInt();
	}while(cont == 1);
	/*do{
		metro.reservation();
		ticket.displayTicket();
	System.out.println("\nPress 1 To Book Again 0 To Exit");
	cont = scan.nextInt();
	}
	while (cont == 1);*/
}
}