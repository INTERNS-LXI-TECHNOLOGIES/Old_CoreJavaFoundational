package com.lxisoft.metrov3.test;
import com.lxisoft.metrov3.train.Metro;
import java.util.Scanner;
public class Tdd{
	public static void main (String[] args){
		int cont;
		int login;
		String password;
		Metro metro = new Metro();
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("1.Admin\n2.User");
			login = scan.nextInt();
			if(login==1){
				do{
					System.out.print("password : ");
					password = scan.next();
					if(password.equals("admin")){
						metro.admin();
					}
					else{
						System.out.println("Wrong Password!!!\nTry Again!!");		
					}
				}while(!password.equals("admin"));
			}
			if(login==2){
				metro.reservation();
			}
			System.out.println("Press 1 To Continue | Press 2 To Exit");
			cont = scan.nextInt();
		}while(cont == 1);
	}
}