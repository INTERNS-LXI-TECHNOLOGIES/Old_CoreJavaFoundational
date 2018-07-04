package com.lxisoft.animalgame.type;
import com.lxisoft.animalgame.animal.*;
import java.io.*;
import java.util.*;
abstract public class Herbivorousanimal extends Animal implements Herbivorous
{
	//grass eat condition
public void grasseat()
{
	Random ran=new Random();
	setHunger(ran.nextInt(10));
	if(getHunger()>5)
	{
		System.out.println("\n"+this.getName()+"\tEating grass\n");
	}
}
//luck condition
public void luck()
{
	if(getLuck()>5)
	{
	
	}
}
}