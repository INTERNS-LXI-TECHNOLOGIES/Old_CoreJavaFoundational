package com.lxisoft.animalgame.clearscreen;
import java.io.IOException;
public class Cls
	{
		 public static void cls() throws IOException,InterruptedException
			{
				 new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			}
		 public static void clear()
			{
				 //Cls clrscr=new Cls();
				 try
					{
						 cls();
					}
				 catch (IOException e)
					{
			
					}
				 catch (InterruptedException e)
					{
			
					}
			}
	}