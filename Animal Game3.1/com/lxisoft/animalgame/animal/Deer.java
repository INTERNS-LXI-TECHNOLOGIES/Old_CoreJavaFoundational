package com.lxisoft.animalgame.animal;
import com.lxisoft.animalgame.type.*;
import java.io.*;
import java.util.Random;
public class Deer extends  Herbivorousanimal
{
		public Deer(int id)
	
	{
		setname("Deer"+String.valueOf(id));
		Random ran=new Random();
		setstrength(0);
		sethunger(ran.nextInt(10));
		//reach=ran.nextInt(4);
		//carnivorous=false;
		findloc();
	}
}