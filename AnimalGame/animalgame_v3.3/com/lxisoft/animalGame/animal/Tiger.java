package com.lxisoft.animalGame.animal;
import com.lxisoft.animalGame.animal.*;
import com.lxisoft.animalGame.supporting_class.*;
import java.io.*;
import java.util.Random;
public class Tiger extends CarniAnimal{
	
	public Tiger(int id)
	{
		
			
	       Random r=new Random();
		   setName("Tiger"+String.valueOf(id));
		   setStrength(r.nextInt(10));
		   setReach(r.nextInt(10));
		   setHunger(r.nextInt(10));
	       
	}
   
}