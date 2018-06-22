package com.lxisoft.animalgame.exception;
public class BiggerThanGridException extends Exception
{
	public BiggerThanGridException()
	{
		System.out.println("PLEASE ENTER THE TOTAL NO.OF ANIMALS WITHIN 100");
	}
}