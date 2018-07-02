package com.lxisoft.animalgame.animal;
import com.lxisoft.animalgame.type.*;
import java.io.*;
import java.util.Random;
public class Tiger extends Carnivorousanimal
{
	public Tiger(int id)
	{
		setName("Tiger"+String.valueOf(id));
		Random ran=new Random();
		setStrength(ran.nextInt(10));
		setHunger(ran.nextInt(10));
		setReach(ran.nextInt(4));
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