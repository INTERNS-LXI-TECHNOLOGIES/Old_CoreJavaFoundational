package com.lxisoft.files;
import java.util.Scanner;
public class Dice
{
public int num;
Scanner scan=new Scanner(System.in);
	/*public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}*/
	public int diceThrow()
	{
		for(int i=0;i<10;i++)
		{
		 num=(int)(Math.random()*6)+1;
		}
		 return scan.nextInt();
	}
}