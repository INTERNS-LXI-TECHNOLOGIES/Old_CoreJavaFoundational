package com.lxisoft.animalgame.type;
import com.lxisoft.animalgame.animal.*;
import java.io.*;
import java.util.*;
abstract public class Herbivorousanimal extends Animal implements Herbivorous
{
public void grasseat()
{
	Random ran=new Random();
	sethunger(ran.nextInt(10));
	if(gethunger()>5)
	{
		System.out.println("\n"+this.getname()+"\t Eating grass");
	}
}
public void luck()
{
	
	if(getLuck()>5)
	{
		System.out.println("\n"+this.getname()+"\t Run away due to luck");
	}
}
}