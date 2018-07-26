package com.lxisoft.quizgamev2.userinterface;
import java.io.IOException;
public class Cls
{
	public void cls() throws IOException,InterruptedException
	{
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		
	}
}