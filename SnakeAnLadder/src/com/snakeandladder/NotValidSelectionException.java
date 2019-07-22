package com.snakeandladder;

public class NotValidSelectionException extends Exception {

	public NotValidSelectionException(String wrongSelection) 
	{
		super(wrongSelection);
	}

	
}
