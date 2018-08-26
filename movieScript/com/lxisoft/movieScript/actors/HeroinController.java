package com.lxisoft.movieScript.actors;

import java.io.*;
import com.lxisoft.movieScript.movieScript.*;

public class HeroinController{
	public void heroinDetails(int num2){
	     String heroinCharacter,heroinName;
		 MovieScript ms = new MovieScript();
		 for(int i=0;i<num2;i++)
		 {
		   System.out.println("----------Please enter the Heroin details----------\n\n");
		   System.out.println("ENTER THE NAME OF THE HEROIN\n");
		   heroinName = System.console().readLine();
		   System.out.println("ASSIGN THE CHARATER \n");
		   heroinCharacter = System.console().readLine();
		   Heroin heroin = new Heroin(heroinName,heroinCharacter);
		   ms.addHeroin(heroin);
		 }
	}
	
}