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
	setReach(ran.nextInt(1));
	setHunger(ran.nextInt(10));
	setLuck(ran.nextInt(10));
	findloc();
	setArrow(10);
	}
	public void animalsleep()
	{
		if(getStrength()<2)
		{
			System.out.println("\n"+this.getName()+"\tsleeping");
		}			
	}
}