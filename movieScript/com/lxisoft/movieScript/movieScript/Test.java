package com.lxisoft.movieScript.movieScript;

import com.lxisoft.movieScript.actors.*; 
import java.io.*;
import java.util.*;
 
public class Test{
	 public static void main(String args[]){
		 int num1;
		 Scanner sc = new Scanner(System.in);
		 HeroController hc = new HeroController();
		 System.out.println("Enter the number of heros\n");
		 num1 = sc.nextInt();
		 hc.heroDetails(num1);
		 ms.check();
	}
 }