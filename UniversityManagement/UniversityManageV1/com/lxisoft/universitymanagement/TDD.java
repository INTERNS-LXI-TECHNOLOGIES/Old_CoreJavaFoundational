package com.lxisoft.universitymanagement;
import com.lxisoft.universitymanagement.university.University;
public class TDD
{
	public static void main(String args[])
	{
		University university=new University();
		while(true)
		{
			university.printMainMenu();
		}
	}
}