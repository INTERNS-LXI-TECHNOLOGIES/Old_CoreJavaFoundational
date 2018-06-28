package com.lxisoft.animalgame.type;
import com.lxisoft.animalgame.animal.*;
import java.io.*;
import java.util.*;
abstract public class Herbivorousanimal extends Animal implements Herbivorous
{
public void grasseat()
{
	Random ran=new Random();
	setHunger(ran.nextInt(10));
	if(getHunger()>5)
	{
		System.out.println("\n"+this.getName()+"\tEating grass");
	}
}
public void luck()
{
	if(getLuck()>5)
	{
		//System.out.println("\n"+this.getname()+"\t Run away due to luck");
	}
}
}