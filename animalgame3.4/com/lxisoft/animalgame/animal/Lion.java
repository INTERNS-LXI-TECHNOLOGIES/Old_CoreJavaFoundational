package com.lxisoft.animalgame.animal;
import com.lxisoft.animalgame.type.*;
import java.io.*;
import java.util.Random;
	public class Lion extends Carnivorousanimal
{
	public Lion(int id)
	
	{
		setName("Lion"+String.valueOf(id));
		Random ran=new Random();
		setHunger(ran.nextInt(10));
		setStrength(ran.nextInt(10));
		setReach(ran.nextInt(2));
		findloc();
	}
	public void animalsleep()
	{
		if(getHunger()<3)
		{
			System.out.println("\n"+this.getName()+"\tsleeping");
		}
			
	}
		
	
}
