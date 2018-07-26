package com.lxisoft.program;
import java.util.*;
public class RateEnquiry
{
	int trainNo;
	int currentLocation;
	int destinationLocation;
	int typeOfTicket;
	int acTicketPrice,generalTicketPrice,sleeperTicketPrice;
	int amount;
	public void printDetails()
	{
		acTicketPrice=20;
		generalTicketPrice=5;
		sleeperTicketPrice=10;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Metro Rail number(1,2,3,4,5,6)");
		trainNo=in.nextInt();
		//PRICE OF METRO TICKET ARE SAME FOR ALL TRAINS
		if(trainNo==1 || trainNo==2 || trainNo==3 || trainNo==4 ||trainNo==5|| trainNo==6)
		{
				System.out.println("Enter the current location\n1.ALUVA\n2.KALOOR\n3.KADAVANTHRA\n4.ERNAKULAM");
				currentLocation=in.nextInt();
				switch(currentLocation)
				{
					case 1:
						System.out.println("Enter the destination location\n1.KALOOR\n2.KADAVANTHRA\n3.ERNAKULAM");
						destinationLocation=in.nextInt();
						System.out.println("Enter the which ticket type you want to select\n1.AC\n2.Sleeper\n3.General");
						typeOfTicket=in.nextInt();
						if(destinationLocation==1)
						{
							if(typeOfTicket==1)
							{
								amount=acTicketPrice*1;
							}
							else if(typeOfTicket==2)
							{
								amount=sleeperTicketPrice*1;
							}
							else if(typeOfTicket==3)
							{
								amount=generalTicketPrice*1;
							}
							else{
								System.out.println("Invalid ticket type");
							}
						}
						else if(destinationLocation==2)
						{
							if(typeOfTicket==1)
							{
								amount=acTicketPrice*2;
							}
							else if(typeOfTicket==2)
							{
								amount=sleeperTicketPrice*2;
							}
							else if(typeOfTicket==3)
							{
								amount=generalTicketPrice*2;
							}
							else{
								System.out.println("Invalid ticket type");
							}
						}
						else if(destinationLocation==3)
						{
							if(typeOfTicket==1)
							{
								amount=acTicketPrice*3;
							}
							else if(typeOfTicket==2)
							{
								amount=sleeperTicketPrice*3;
							}
							else if(typeOfTicket==3)
							{
								amount=generalTicketPrice*3;
							}
							else{
								System.out.println("Invalid ticket type");
							}
						}
						else
						{
							System.out.println("Invalid Destination location");
						}

						System.out.println("FARE =rs."+amount);
						break;
					case 2:
						System.out.println("Enter the destination location\n1.ALUVA\n2.KADAVANTHRA\n3.ERNAKULAM");
						destinationLocation=in.nextInt();
						System.out.println("Enter the which ticket type you want to select\n1.AC\n2.Sleeper\n3.General");
						typeOfTicket=in.nextInt();
						if(destinationLocation==1)
						{
							if(typeOfTicket==1)
							{
								amount=acTicketPrice*1;
							}
							else if(typeOfTicket==2)
							{
								amount=sleeperTicketPrice*1;
							}
							else if(typeOfTicket==3)
							{
								amount=generalTicketPrice*1;
							}
							else{
								System.out.println("Invalid ticket type");
							}
						}
						else if(destinationLocation==2)
						{
							if(typeOfTicket==1)
							{
								amount=acTicketPrice*1;
							}
							else if(typeOfTicket==1)
							{
								amount=sleeperTicketPrice*2;
							}
							else if(typeOfTicket==3)
							{
								amount=generalTicketPrice*1;
							}
							else{
								System.out.println("Invalid ticket type");
							}
						}
						else if(destinationLocation==3)
						{
							if(typeOfTicket==1)
							{
								amount=acTicketPrice*2;
							}
							else if(typeOfTicket==2)
							{
								amount=sleeperTicketPrice*2;
							}
							else if(typeOfTicket==3)
							{
								amount=generalTicketPrice*2;
							}
							else{
								System.out.println("Invalid ticket type");
							}
						}
						else
						{
							System.out.println("Invalid Destination location");
						}

						System.out.println("FARE =rs."+amount);
						break;
					case 3:
					System.out.println("Enter the destination location\n1.ALUVA\n2.KALOOR\n3.ERNAKULAM");
						destinationLocation=in.nextInt();
						System.out.println("Enter the which ticket type you want to select\n1.AC\n2.Sleeper\n3.General");
						typeOfTicket=in.nextInt();
						if(destinationLocation==1)
						{
							if(typeOfTicket==1)
							{
								amount=acTicketPrice*2;
							}
							else if(typeOfTicket==2)
							{
								amount=sleeperTicketPrice*2;
							}
							else if(typeOfTicket==3)
							{
								amount=generalTicketPrice*2;
							}
							else{
								System.out.println("Invalid ticket type");
							}
						}
						else if(destinationLocation==2)
						{
							if(typeOfTicket==1)
							{
								amount=acTicketPrice*1;
							}
							else if(typeOfTicket==2)
							{
								amount=sleeperTicketPrice*1;
							}
							else if(typeOfTicket==3)
							{
								amount=generalTicketPrice*1;
							}
							else{
								System.out.println("Invalid ticket type");
							}
						}
						else if(destinationLocation==3)
						{
							if(typeOfTicket==1)
							{
								amount=acTicketPrice*1;
							}
							else if(typeOfTicket==2)
							{
								amount=sleeperTicketPrice*1;
							}
							else if(typeOfTicket==3)
							{
								amount=generalTicketPrice*1;
							}
							else{
								System.out.println("Invalid ticket type");
							}
						}
						else
						{
							System.out.println("Invalid Destination location");
						}

						System.out.println("FARE =rs."+amount);
						break;
					case 4:
						System.out.println("Enter the destination location\n1.ALUVA\n2.KALOOR\n3.KADAVANTHRA");
						destinationLocation=in.nextInt();
						System.out.println("Enter the which ticket type you want to select\n1.AC\n2.Sleeper\n3.General");
						typeOfTicket=in.nextInt();
						if(destinationLocation==1)
						{
							if(typeOfTicket==1)
							{
								amount=acTicketPrice*3;
							}
							else if(typeOfTicket==2)
							{
								amount=sleeperTicketPrice*3;
							}
							else if(typeOfTicket==3)
							{
								amount=generalTicketPrice*3;
							}
							else{
								System.out.println("Invalid ticket type");
							}
						}
						else if(destinationLocation==2)
						{
							if(typeOfTicket==1)
							{
								amount=acTicketPrice*2;
							}
							else if(typeOfTicket==2)
							{
								amount=sleeperTicketPrice*2;
							}
							else if(typeOfTicket==3)
							{
								amount=generalTicketPrice*2;
							}
							else{
								System.out.println("Invalid ticket type");
							}
						}
						else if(destinationLocation==3)
						{
							if(typeOfTicket==1)
							{
								amount=acTicketPrice*1;
							}
							else if(typeOfTicket==2)
							{
								amount=sleeperTicketPrice*1;
							}
							else if(typeOfTicket==3)
							{
								amount=generalTicketPrice*1;
							}
							else{
								System.out.println("Invalid ticket type");
							}
						}
						else
						{
							System.out.println("Invalid Destination location");
						}

						System.out.println("FARE =rs."+amount);
						break;
					default:
						System.out.println("Enter a valid current location(1,2,3,4)");
				}
		}
		else{
			System.out.println("Enter a valid train number");
		}		

	}
}