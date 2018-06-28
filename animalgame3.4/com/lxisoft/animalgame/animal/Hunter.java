package com.lxisoft.animalgame.animal;
import com.lxisoft.animalgame.animal.*;
import com.lxisoft.animalgame.type.*;
import com.lxisoft.animalgame.forest.*;
import java.io.*;
import java.util.*;
public class Hunter extends Omnivorousanimal
{
	public  Hunter(int id)
	{
	Random ran=new Random();
	setName("Hunter"+String.valueOf(id));
	setStrength(ran.nextInt(10));
	setReach(ran.nextInt(3));
	setHunger(ran.nextInt(10));
	findloc();
	setArrow(5);
	}
	public void animalsleep()
	{
		if(getStrength()<5)
		{
			System.out.println(this.getName()+"\tsleeping");
		}
			
	}
	
}