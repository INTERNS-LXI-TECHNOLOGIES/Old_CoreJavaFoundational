package com.lxisoft.SnakeNLadder;
import java.io.IOException;
/**
*This class is used to clear the display Screen
*
*@author AJAY .E.S
*
*@version 1.0

*/

public class Cls
	{
		 public static void cls() throws IOException,InterruptedException
			{
				 new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			}
		 public static void clear()
			{
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
