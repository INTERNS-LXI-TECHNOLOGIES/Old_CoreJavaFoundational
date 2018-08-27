package com.lxisoft.movieScript.userinterface;
public class UserInterface_view
{
	UserInterface_controller con;
	public UserInterface_view()throws Exception
	{
		con=new UserInterface_controller();
		System.out.println("\t\t\t\t\t\t\t*********Movie Screen Play***********");
		System.out.print("|1.Enter Credentials|");
		System.out.print("\t\t|2. Script Dialogues|");
		System.out.print("\t\t|3.   View Script   |");
		System.out.println("\nEnter '0' to exit");
		System.out.println("\n||>>Enter option<<||");
		con.mainViewSelector();	
	}
	
}