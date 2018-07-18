package com.lxisoft.quize.Quize;

import java.io.*;
import java.util.*;

public class TDD{
	public static void main(String args[]){
		String username,password;
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t\t\t----------QUIZE COMPETITION----------");
		System.out.println("\n\n");
		System.out.println("\t\t\t\t----------PLEASE LOGIN---------------");
		System.out.println("\n\n");
		System.out.println("ENTER THE USERNAME");
		username=sc.nextLine();
		System.out.println("ENTER THE PASSWORD");
		password=sc.nextLine();
		Login l=new Login(username,password);
	}
}