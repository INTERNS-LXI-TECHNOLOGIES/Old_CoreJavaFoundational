package com.lxisoft.program;
import java.util.*;

public class Platform
{
	int trainNumber;
	int choice;


	public void printDetails()
	{
		Scanner in=new Scanner(System.in);
		Scanner rd=new Scanner(System.in);
		System.out.println("Enter the metro rail number(1,2,3,4,5,6):");
		trainNumber=in.nextInt();
		switch(trainNumber)
		{
			case 1:
				System.out.println("DO YOU WANT TO GO TOWARDS\n1.ERNAKULAM\n2.ALUVA");
				choice=in.nextInt();
				if(choice==1)
					System.out.println("THE TRAIN WILL ARRIVE AT PLATFORM 1");
				else if(choice==2)
					System.out.println("THE TRAIN WILL ARRIVE AT PLATFORM 2");
				else
					System.out.println("YOU HAVE SELECTED INVALID CHOICE");
				break;
			case 2:
				System.out.println("DO YOU WANT TO GO TOWARDS\n1.ERNAKULAM\n2.ALUVA");
				choice=in.nextInt();
				if(choice==1)
					System.out.println("THE TRAIN WILL ARRIVE AT PLATFORM 1");
				else if(choice==2)
					System.out.println("THE TRAIN WILL ARRIVE AT PLATFORM 2");
				else
					System.out.println("YOU HAVE SELECTED INVALID CHOICE");
				break;
			case 3:
				System.out.println("DO YOU WANT TO GO TOWARDS\n1.ERNAKULAM\n2.ALUVA");
				choice=in.nextInt();
				if(choice==1)
					System.out.println("THE TRAIN WILL ARRIVE AT PLATFORM 1");
				else if(choice==2)
					System.out.println("THE TRAIN WILL ARRIVE AT PLATFORM 2");
				else
					System.out.println("YOU HAVE SELECTED INVALID CHOICE");
				break;
			case 4:
				System.out.println("DO YOU WANT TO GO TOWARDS\n1.ERNAKULAM\n2.ALUVA");
				choice=in.nextInt();
				if(choice==1)
					System.out.println("THE TRAIN WILL ARRIVE AT PLATFORM 2");
				else if(choice==2)
					System.out.println("THE TRAIN WILL ARRIVE AT PLATFORM 1");
				else
					System.out.println("YOU HAVE SELECTED INVALID CHOICE");
				break;
			case 5:
				System.out.println("DO YOU WANT TO GO TOWARDS\n1.ERNAKULAM\n2.ALUVA");
				choice=in.nextInt();
				if(choice==1)
					System.out.println("THE TRAIN WILL ARRIVE AT PLATFORM 2");
				else if(choice==2)
					System.out.println("THE TRAIN WILL ARRIVE AT PLATFORM 1");
				else
					System.out.println("YOU HAVE SELECTED INVALID CHOICE");
				break;
			case 6:
				System.out.println("DO YOU WANT TO GO TOWARDS\n1.ERNAKULAM\n2.ALUVA");
				choice=in.nextInt();
				if(choice==1)
					System.out.println("THE TRAIN WILL ARRIVE AT PLATFORM 2");
				else if(choice==2)
					System.out.println("THE TRAIN WILL ARRIVE AT PLATFORM 1");
				else
					System.out.println("YOU HAVE SELECTED INVALID CHOICE");
				break;
			default:
				System.out.println("Please enter a valid choice ");
		}

	}

}