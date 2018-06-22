package com.lxisoft.animalgame.animal;
import com.lxisoft.animalgame.type.*;
import java.io.*;
import java.util.Random;
	public class Lion extends Carnivorousanimal
{
	public Lion(int id)
	
	{
		setname("Lion"+String.valueOf(id));
		Random ran=new Random();
		sethunger(ran.nextInt(10));
		setstrength(ran.nextInt(10));
		setreach(ran.nextInt(2));
		//roamcheck();
		//carnivorous=true;
		findloc();
	}
		
	
}
