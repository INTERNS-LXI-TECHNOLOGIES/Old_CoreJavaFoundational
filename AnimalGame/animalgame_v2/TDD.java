import java.io.*;
class TDD{
	public static void main(String args[])
	{
		
		System.out.println("**************************Animal GAME**************************************\n");
		Forest f=new Forest(6,5,4);
		
		System.out.println("**************************SURVIVAL Result**************************************\n");
		
		f.outputGrid();
		f.animalSurvived();
		
	}
	
	
	}