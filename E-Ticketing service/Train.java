import java.util.Scanner;
public class Train
{
Seat seat=new Seat();
Scanner scan=new Scanner(System.in);


       public void trainDetails()
	   {
		    String place;
		    System.out.println("All TRAIN START RUNNING FROM PALAKKAD STOP");
			
			
			System.out.println("enter the place you want to go options \n *) malappuram \n *)kannur");
			place=scan.next();
				if(place.equals("malappuram"))
				{
					System.out.println("the train name is shatabdi express \n train number is 1234 \n time is 12:00");
					System.out.println("place="+place);
					seats.create();
				}
				
				
				else if(place.equals("kannur"))
				{
					System.out.println("the train name is sowparnika express  \n train number is 1087 \n time is 1:00");  
					seats.create();
				}
				
				else 
				{
					System.out.println("the train does not go to your destination");
					 
				}
				
		    
			
			
				
			
		}


}