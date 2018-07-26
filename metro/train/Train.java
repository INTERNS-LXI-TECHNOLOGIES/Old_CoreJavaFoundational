package com.lxisoft.metro.train;
import java.util.*;
public class Train 
{
	public void trainDetails()
	{
		Scanner details=new Scanner(System.in);
		System.out.println("Enter the Train name: ");
		String trainname=details.nextLine();
		System.out.println("STATIONS");
		System.out.println("1)ALUVA");
		System.out.println("2)EDAPPALLY");
		System.out.println("3)KALOOR");
		System.out.println("4)VYTILA");
		System.out.println("\nEnter your Starting Location: ");
		int start=details.nextInt();
		switch(start)
		{
									//From ALUVA
			case 1: System.out.println("Your starting Location is ALUVA ");
					System.out.println("2)EDAPPALLY");
					System.out.println("3)KALOOR");
					System.out.println("4)VYTILA");
					System.out.println("Enter your Destinantion: ");
					int destination1=details.nextInt();
					switch(destination1)
					{
						case 2: System.out.println("\nYour selected destinantion is EDAPPALLY ");
								System.out.println("Available coaches: 1)AC\n2)Sleeper\n3)General");
								System.out.println("Enter your choice: ");
								int choice12=details.nextInt();
								switch(choice12)
								{
									case 1: System.out.println("\nYou have selected AC coach");
				    				System.out.println("Enter the Seat No:");
				    				int aluedpAcSeat=details.nextInt();
									int aluedpAcFare=150;

									break;
									case 2: System.out.println("\nYou have selected Sleeper coach");
									System.out.println("Enter the Seat No:");
									int aluedpSleeperSeat=details.nextInt();
									int aluedpSleeperFare=100;

									break;
									case 3: System.out.println("\nYou have selected General coach");
									System.out.println("Enter the Seat No:");
									int aluedpGeneralSeat=details.nextInt();
									int aluedpGeneralFare=50;
									break;
									
				    			}
						break;
						case 3: System.out.println("\nYour selected destinantion is KALOOR ");
								System.out.println("Available coaches: 1)AC\n2)Sleeper\n3)General");
								System.out.println("Enter your choice: ");
								int choice13=details.nextInt();
								switch(choice13)
								{
									case 1: System.out.println("\nYou have selected AC coach");
				    						System.out.println("Enter the Seat No:");
											int alukalAcSeat=details.nextInt();
											int alukalAcFare=175;

									break;
									case 2: System.out.println("\nYou have selected Sleeper coach");
											System.out.println("Enter the Seat No:");
											int alukalSleeperSeat=details.nextInt();
											int alukalSleeperFare=125;
									break;
									case 3: System.out.println("\nYou have selected General coach");
											System.out.println("Enter the Seat No:");
											int alukalGeneralSeat=details.nextInt();
											int alukalGeneralFare=75;
									break;						
									
				  				}
						break;
						case 4: System.out.println("\nYour selected destinantion is VYTILA ");
							    System.out.println("Available coaches: 1)AC\n2)Sleeper\n3)General");
							    System.out.println("Enter your choice: ");
							    int choice14=details.nextInt();
								switch(choice14)
								{
									case 1: System.out.println("\nYou have selected AC coach");
				    						System.out.println("Enter the Seat No:");
				    						int aluvytAcSeat=details.nextInt();
											int aluvytAcFare=200;
									break;
									case 2: System.out.println("\nYou have selected Sleeper coach");
											System.out.println("Enter the Seat No:");
											int aluvytSleeperSeat=details.nextInt();
											int aluvytSleeperFare=150;
									break;
									case 3: System.out.println("\nYou have selected General coach");
											System.out.println("Enter the Seat No:");
										    int aluvytGeneralSeat=details.nextInt();
											int aluvytGeneralFare=100;
									break;
									
				    			}
						break;
					}	
										//From EDAPALLY
					case 2: System.out.println("Your starting Location is EDAPPALLY ");
					System.out.println("1)ALUVA");
					System.out.println("3)KALOOR");
					System.out.println("4)VYTILA");
					System.out.println("Enter your Destinantion: ");
					int destination2=details.nextInt();
					switch(destination2)
					{
						case 1: System.out.println("\nYour selected destinantion is ALUVA ");
								System.out.println("Available coaches: 1)AC\n2)Sleeper\n3)General");
								System.out.println("Enter your choice: ");
								int choice21=details.nextInt();
								switch(choice21)
								{
									case 1: System.out.println("\nYou have selected AC coach");
				    				System.out.println("Enter the Seat No:");
				    				int edpaluAcSeat=details.nextInt();
									int edpaluAcFare=150;

									break;
									case 2: System.out.println("\nYou have selected Sleeper coach");
									System.out.println("Enter the Seat No:");
									int edpaluSleeperSeat=details.nextInt();
									int edpaluSleeperFare=100;

									break;
									case 3: System.out.println("\nYou have selected General coach");
									System.out.println("Enter the Seat No:");
									int edpaluGeneralSeat=details.nextInt();
									int edpaluGeneralFare=50;
									break;
									
				    			}
						break;
						case 3: System.out.println("\nYour selected destinantion is KALOOR ");
								System.out.println("Available coaches: 1)AC\n2)Sleeper\n3)General");
								System.out.println("Enter your choice: ");
								int choice23=details.nextInt();
								switch(choice23)
								{
									case 1: System.out.println("\nYou have selected AC coach");
				    						System.out.println("Enter the Seat No:");
											int edpkalAcSeat=details.nextInt();
											int edpkalAcFare=175;

									break;
									case 2: System.out.println("\nYou have selected Sleeper coach");
											System.out.println("Enter the Seat No:");
											int edpkalSleeperSeat=details.nextInt();
											int edpkalSleeperFare=125;
									break;
									case 3: System.out.println("\nYou have selected General coach");
											System.out.println("Enter the Seat No:");
											int edpkalGeneralSeat=details.nextInt();
											int edpkalGeneralFare=75;
									break;						
									
				  				}
						break;
						case 4: System.out.println("\nYour selected destinantion is VYTILA ");
							    System.out.println("Available coaches: 1)AC\n2)Sleeper\n3)General");
							    System.out.println("Enter your choice: ");
							    int choice24=details.nextInt();
								switch(choice24)
								{
									case 1: System.out.println("\nYou have selected AC coach");
				    						System.out.println("Enter the Seat No:");
				    						int edpvytAcSeat=details.nextInt();
											int edpvytAcFare=200;
									break;
									case 2: System.out.println("\nYou have selected Sleeper coach");
											System.out.println("Enter the Seat No:");
											int edpvytSleeperSeat=details.nextInt();
											int edpvytSleeperFare=150;
									break;
									case 3: System.out.println("\nYou have selected General coach");
											System.out.println("Enter the Seat No:");
										    int edpvytGeneralSeat=details.nextInt();
											int edpvytGeneralFare=100;
									break;
									
				    			}
						break;
					}
					case 3: System.out.println("Your starting Location is KALOOR ");
					System.out.println("1)ALUVA");
					System.out.println("2)EDAPPALLY");
					System.out.println("4)VYTILA");
					System.out.println("Enter your Destination: ");
					int destination3=details.nextInt();
					switch(destination3)
					{
						case 1: System.out.println("\nYour selected destination is ALUVA ");
								System.out.println("Available coaches: 1)AC\n2)Sleeper\n3)General");
								System.out.println("Enter your choice: ");
								int choice31=details.nextInt();
								switch(choice31)
								{
									case 1: System.out.println("\nYou have selected AC coach");
				    				System.out.println("Enter the Seat No:");
				    				int kalaluAcSeat=details.nextInt();
									int kalaluAcFare=150;

									break;
									case 2: System.out.println("\nYou have selected Sleeper coach");
									System.out.println("Enter the Seat No:");
									int kalaluSleeperSeat=details.nextInt();
									int kalaluSleeperFare=100;

									break;
									case 3: System.out.println("\nYou have selected General coach");
									System.out.println("Enter the Seat No:");
									int kalaluGeneralSeat=details.nextInt();
									int kalaluGeneralFare=50;
									break;
									
				    			}
						break;
						case 2: System.out.println("\nYour selected destinantion is EDAPPALLY ");
								System.out.println("Available coaches: 1)AC\n2)Sleeper\n3)General");
								System.out.println("Enter your choice: ");
								int choice32=details.nextInt();
								switch(choice32)
								{
									case 1: System.out.println("\nYou have selected AC coach");
				    						System.out.println("Enter the Seat No:");
											int kaledpAcSeat=details.nextInt();
											int kaledpAcFare=175;

									break;
									case 2: System.out.println("\nYou have selected Sleeper coach");
											System.out.println("Enter the Seat No:");
											int kaledpSleeperSeat=details.nextInt();
											int kaledpSleeperFare=125;
									break;
									case 3: System.out.println("\nYou have selected General coach");
											System.out.println("Enter the Seat No:");
											int kaledpGeneralSeat=details.nextInt();
											int kaledpGeneralFare=75;
									break;						
									
				  				}
						break;
						case 4: System.out.println("\nYour selected destinantion is VYTILA ");
							    System.out.println("Available coaches: 1)AC\n2)Sleeper\n3)General");
							    System.out.println("Enter your choice: ");
							    int choice34=details.nextInt();
								switch(choice34)
								{
									case 1: System.out.println("\nYou have selected AC coach");
				    						System.out.println("Enter the Seat No:");
				    						int kalvytAcSeat=details.nextInt();
											int kalvytAcFare=200;
									break;
									case 2: System.out.println("\nYou have selected Sleeper coach");
											System.out.println("Enter the Seat No:");
											int kalvytSleeperSeat=details.nextInt();
											int kalvytSleeperFare=150;
									break;
									case 3: System.out.println("\nYou have selected General coach");
											System.out.println("Enter the Seat No:");
										    int kalvytGeneralSeat=details.nextInt();
											int kalvytGeneralFare=100;
									break;
									
				    			}
						break;
					}
					case 4: System.out.println("Your starting Location is VYTILA ");
					System.out.println("1)ALUVA");
					System.out.println("2)EDAPPALLY");
					System.out.println("3)KALOOR");
					System.out.println("Enter your Destinantion: ");
					int destination4=details.nextInt();
					switch(destination4)
					{
						case 1: System.out.println("\nYour selected destinantion is ALUVA ");
								System.out.println("Available coaches: 1)AC\n2)Sleeper\n3)General");
								System.out.println("Enter your choice: ");
								int choice41=details.nextInt();
								switch(choice41)
								{
									case 1: System.out.println("\nYou have selected AC coach");
				    				System.out.println("Enter the Seat No:");
				    				int vytaluAcSeat=details.nextInt();
									int vytaluAcFare=150;

									break;
									case 2: System.out.println("\nYou have selected Sleeper coach");
									System.out.println("Enter the Seat No:");
									int vytaluSleeperSeat=details.nextInt();
									int vytaluSleeperFare=100;

									break;
									case 3: System.out.println("\nYou have selected General coach");
									System.out.println("Enter the Seat No:");
									int vytaluGeneralSeat=details.nextInt();
									int vytaluGeneralFare=50;
									break;
									
				    			}
						break;
						case 2: System.out.println("\nYour selected destinantion is EDAPPALLY ");
								System.out.println("Available coaches: 1)AC\n2)Sleeper\n3)General");
								System.out.println("Enter your choice: ");
								int choice42=details.nextInt();
								switch(choice42)
								{
									case 1: System.out.println("\nYou have selected AC coach");
				    						System.out.println("Enter the Seat No:");
											int vytedpAcSeat=details.nextInt();
											int vytedpAcFare=175;

									break;
									case 2: System.out.println("\nYou have selected Sleeper coach");
											System.out.println("Enter the Seat No:");
											int vytedpSleeperSeat=details.nextInt();
											int vytedpSleeperFare=125;
									break;
									case 3: System.out.println("\nYou have selected General coach");
											System.out.println("Enter the Seat No:");
											int vytedpGeneralSeat=details.nextInt();
											int vytedpGeneralFare=75;
									break;						
									
				  				}
						break;
						case 3: System.out.println("\nYour selected destinantion is KALOOR ");
							    System.out.println("Available coaches: 1)AC\n2)Sleeper\n3)General");
							    System.out.println("Enter your choice: ");
							    int choice43=details.nextInt();
								switch(choice43)
								{
									case 1: System.out.println("\nYou have selected AC coach");
				    						System.out.println("Enter the Seat No:");
				    						int vytkalAcSeat=details.nextInt();
											int vytkalAcFare=200;
									break;
									case 2: System.out.println("\nYou have selected Sleeper coach");
											System.out.println("Enter the Seat No:");
											int vytkalSleeperSeat=details.nextInt();
											int vytkalSleeperFare=150;
									break;
									case 3: System.out.println("\nYou have selected General coach");
											System.out.println("Enter the Seat No:");
										    int vytkalGeneralSeat=details.nextInt();
											int vytkalGeneralFare=100;
									break;
									
				    			}
						break;
					}
			


			default: System.out.println("\nInvalid choice");
		}
	
	}
	
}