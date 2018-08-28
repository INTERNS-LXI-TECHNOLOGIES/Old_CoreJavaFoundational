package com.lxisoft.movieScript.actors;

import java.io.*;
import com.lxisoft.movieScript.movieScript.*;

public class VillainController{
	public void villainDetails(int num4){
		String villainCharacter,villainName;
		 MovieScript ms = new MovieScript();
		 for(int i=0;i<num4;i++)
		 {
		   System.out.println("----------Please enter the Villain details----------\n\n");
		   System.out.println("ENTER THE NAME OF THE VILLAIN\n");
		   villainName = System.console().readLine();
		   System.out.println("ASSIGN THE CHARATER \n");
		   villainCharacter = System.console().readLine();
		   Villain villain = new Villain(villainName,villainCharacter);
		   ms.addVillain(villain);
		 }
	}
}