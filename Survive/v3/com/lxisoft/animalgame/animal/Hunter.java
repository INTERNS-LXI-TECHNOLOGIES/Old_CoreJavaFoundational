package com.lxisoft.animalgame.animal;
import com.lxisoft.animalgame.animal.*;
import com.lxisoft.animalgame.animaltype.*;
import com.lxisoft.animalgame.forest.*;
import java.io.*;
import java.util.*;
public class Hunter extends  OminivorousAnimal
{
	
	public Hunter(int id)
	{
		//System.out.println("Hunter entering in the forest");
		Random ran=new Random();
		//setStrength(ran.nextInt(10));
		setName("Hunter"+String.valueOf(id));
		setArrow(5);
		setReach(ran.nextInt(3));
		findloc();
	}
	public void sleep()
	{
		
	}

}