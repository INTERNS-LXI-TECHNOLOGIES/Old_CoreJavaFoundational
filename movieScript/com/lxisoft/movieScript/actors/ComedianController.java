package com.lxisoft.movieScript.actors;

import java.io.*;
import com.lxisoft.movieScript.movieScript.*;

public class ComedianController{
	public void comedianDetails(int num3){
	     String ComedianCharacter,ComedianName;
		 MovieScript ms = new MovieScript();
		 for(int i=0;i<num3;i++)
		 {
		   System.out.println("----------Please enter the Comedian details----------\n\n");
		   System.out.println("ENTER THE NAME OF THE COMEDIAN\n");
		   ComedianName = System.console().readLine();
		   System.out.println("ASSIGN THE CHARATER \n");
		   ComedianCharacter = System.console().readLine();
		   Comedian comedian = new Comedian(ComedianName,ComedianCharacter);
		   ms.addComedian(comedian);
		 }
	}
}