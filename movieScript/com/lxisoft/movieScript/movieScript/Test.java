package com.lxisoft.movieScript.movieScript;

import com.lxisoft.movieScript.actors.*; 
import java.io.*;
import java.util.*;
 
public class Test{
	 public static void main(String args[]){
		 int num1,num2,num3;
		 Scanner sc = new Scanner(System.in);
		 HeroController hc1 = new HeroController();
		 HeroinController hc2 = new HeroinController(); 
		 ComedianController c = new ComedianController();
		 MovieScript ms = new MovieScript();
		 System.out.println("Enter the number of heros\n");
		 num1 = sc.nextInt();
		 hc1.heroDetails(num1);
		 System.out.println("Enter the number of Heroins\n");
		 num2 = sc.nextInt();
		 hc2.heroinDetails(num2);
		 System.out.println("Enter the number of Comedians\n");
		 num3 = sc.nextInt();
		 c.comedianDetails(num3);
		 ms.check(num1,num2,num3);
	}
 }