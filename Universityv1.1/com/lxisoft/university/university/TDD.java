package com.lxisoft.university.university;
import java.io.*;
import java.util.*;

public class TDD{
	public static void main(String args[]){
	University uni = new University();
	int choice;
	System.out.println("********UNIVERSITY********");
	System.out.println("\n");
	do{
	System.out.println("****PLEASE ENTER THE CHOICE****");
	System.out.print("1: COLLEGE REGISTRATION \t\t"+"2: CONTACT DETAILS \t\t"+"3: ABOUT \t\t"+"4: LIST OF COLLEGES \t\t"+"5: EXAMINATIOM NOTIFICATION \t\t"+"6:EXIT FROM THE UNIVERSITY SITE\t\t");
	Scanner sc = new Scanner(System.in);
	choice=sc.nextInt();
	uni.selected(choice);}while(true);

}
}