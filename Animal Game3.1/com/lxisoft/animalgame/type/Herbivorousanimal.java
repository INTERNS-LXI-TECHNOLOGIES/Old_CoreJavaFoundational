package com.lxisoft.animalgame.type;
import com.lxisoft.animalgame.animal.*;
import java.io.*;
import java.util.*;
public class Herbivorousanimal extends Animal implements Herbivorous
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
}