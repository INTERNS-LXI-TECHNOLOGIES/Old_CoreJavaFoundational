package com.lxisoft.animalgame.exceptions;
import java.io.*;
public class DeadException extends Exception
{
	public  DeadException(){
		System.out.println("The animal is already dead\n");
	}
}