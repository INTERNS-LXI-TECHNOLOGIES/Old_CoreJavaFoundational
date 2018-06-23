package com.lxisoft.animalgame.animal;
import com.lxisoft.animalgame.type.*;
import java.io.*;
import java.util.Random;
public class Tiger extends Carnivorousanimal
{
	public Tiger(int id)
	
	{
		setname("Tiger"+String.valueOf(id));
		Random ran=new Random();
		setstrength(ran.nextInt(10));
		sethunger(ran.nextInt(10));
		setreach(ran.nextInt(4));
		//carnivorous=true;
		//roamcheck();
		findloc();
	}
}