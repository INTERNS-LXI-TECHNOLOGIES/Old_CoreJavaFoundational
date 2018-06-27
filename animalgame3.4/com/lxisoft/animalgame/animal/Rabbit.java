package com.lxisoft.animalgame.animal;
import com.lxisoft.animalgame.type.*;
import java.io.*;
import java.util.Random;
public class Rabbit extends Herbivorousanimal
{
		public Rabbit(int id)
	
	{
		setname("Rabbit"+String.valueOf(id));
		Random ran=new Random();
		setstrength(0);
		sethunger(ran.nextInt(10));
		setLuck(ran.nextInt(10));
		findloc();
	}
	public void animalsleep()
	{
		if(gethunger()<5)
		{
			System.out.println("Rabbit sleeping");
		}
			
	}
}
