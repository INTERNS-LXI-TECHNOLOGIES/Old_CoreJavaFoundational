import java.util.Scanner;
public class Tdd
{

		
public static void main(String args[])
{
	
 Scanner scan=new Scanner(System.in);
	

	
	
			System.out.println("                           ");
			System.out.println("WELCOME TO E-TICKET SERVICE");
			System.out.println("                           ");	
			
	 Train[] train  = new Train[2];
	 
	     
		   
		
		      
	 
		   train[0] = new Train();
			train[0].name = "shatabdi express";
			train[0].no=1234;
			
		    train[1] = new Train();
			train[1].name = "sowparnika express";
			train[1].no=9876;
			int d;
			
	do{
		    String place;
		    System.out.println("All TRAIN START RUNNING FROM PALAKKAD STATION");
			
			
			System.out.println("enter the place you want to go options \n *) malappuram \n *)kannur");
			place=scan.next();
			
				if(place.equals("malappuram"))
				{
					System.out.println("the train name is ="+train[0].name+"\n train number is ="+train[0].no+" \n time is 12:00 \n distance = 205km");
					System.out.println("place="+place);
					train[0].create();
				}
				
				else if(place.equals("kannur"))
				{
					System.out.println("the train name is ="+train[1].name+"  \n train number is ="+train[1].no+" \n time is 1:00 \n distance = 500km");  
					train[1].create();
				}
				
				else 
				{
					System.out.println("the train does not go to your destination");
					 
				}
				
				System.out.println("do you want to continue then press the key 1 or 0");
			    d=scan.nextInt();
			
	}while(d==1);
				
		  } 

}