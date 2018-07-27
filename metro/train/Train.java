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

									/**
									*From ALUVA
									*/
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

									System.out.println("Booking Successful");
									System.out.println("Do you want to print the ticket ?(Y/N)");
									String yesno1=details.next();
									
									if(yesno1.equals("y" )|| yesno1.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: ALUVA"+"\t\t\t\t\tTo: EDAPPALLY \n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: AC"+"\t\t\t\t\tSeat: "+aluedpAcSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+aluedpAcFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}
									
									
									break;
									case 2: System.out.println("\nYou have selected Sleeper coach");
									System.out.println("Enter the Seat No:");
									int aluedpSleeperSeat=details.nextInt();
									int aluedpSleeperFare=100;

									System.out.println("Booking Successful");
									System.out.println("Do you want to print the ticket ?(Y/N)");
									String yesno2=details.next();
									
									if(yesno2.equals("y" )|| yesno2.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: ALUVA"+"\t\t\t\t\tTo: EDAPPALLY\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: Sleeper"+"\t\t\t\t\tSeat: "+aluedpSleeperSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+aluedpSleeperFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}

									break;
									case 3: System.out.println("\nYou have selected General coach");
									System.out.println("Enter the Seat No:");
									int aluedpGeneralSeat=details.nextInt();
									int aluedpGeneralFare=50;

									System.out.println("Booking Successful");
									System.out.println("Do you want to print the ticket ?(Y/N)");
									String yesno3=details.next();
									
									if(yesno3.equals("y" )|| yesno3.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: ALUVA"+"\t\t\t\t\tTo: EDAPPALLY\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: General"+"\t\t\t\t\tSeat: "+aluedpGeneralSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+aluedpGeneralFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}
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

											System.out.println("Booking Successful");
									System.out.println("Do you want to print the ticket ?(Y/N)");
									String yesno4=details.next();
									
									if(yesno4.equals("y" )|| yesno4.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: ALUVA"+"\t\t\t\t\tTo: KALOOR\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: AC"+"\t\t\t\t\tSeat: "+alukalAcSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+alukalAcFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}

									break;
									case 2: System.out.println("\nYou have selected Sleeper coach");
											System.out.println("Enter the Seat No:");
											int alukalSleeperSeat=details.nextInt();
											int alukalSleeperFare=125;

											System.out.println("Booking Successful");
									System.out.println("Do you want to print the ticket ?(Y/N)");
									String yesno5=details.next();
									
									if(yesno5.equals("y" )|| yesno5.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: ALUVA"+"\t\t\t\t\tTo: KALOOR \n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: Sleeper"+"\t\t\t\t\tSeat: "+alukalSleeperSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+alukalSleeperFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}
									break;
									case 3: System.out.println("\nYou have selected General coach");
											System.out.println("Enter the Seat No:");
											int alukalGeneralSeat=details.nextInt();
											int alukalGeneralFare=75;

											System.out.println("Booking Successful");
									System.out.println("Do you want to print the ticket ?(Y/N)");
									String yesno6=details.next();
									
									if(yesno6.equals("y" )|| yesno6.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: ALUVA"+"\t\t\t\t\tTo: KALOOR\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: General"+"\t\t\t\t\tSeat: "+alukalGeneralSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+alukalGeneralFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}
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

											System.out.println("Booking Successful");
									System.out.println("Do you want to print the ticket ?(Y/N)");
									String yesno7=details.next();
									
									if(yesno7.equals("y" )|| yesno7.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: ALUVA"+"\t\t\t\t\tTo: VYTILA\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: Ac"+"\t\t\t\t\tSeat: "+aluvytAcSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+aluvytAcFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}
									break;
									case 2: System.out.println("\nYou have selected Sleeper coach");
											System.out.println("Enter the Seat No:");
											int aluvytSleeperSeat=details.nextInt();
											int aluvytSleeperFare=150;

											System.out.println("Booking Successful");
									System.out.println("Do you want to print the ticket ?(Y/N)");
									String yesno8=details.next();
									
									if(yesno8.equals("y" )|| yesno8.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: ALUVA"+"\t\t\t\t\tTo: VYTILA\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: Sleeper"+"\t\t\t\t\tSeat: "+aluvytSleeperSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+aluvytSleeperFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}
									break;
									case 3: System.out.println("\nYou have selected General coach");
											System.out.println("Enter the Seat No:");
										    int aluvytGeneralSeat=details.nextInt();
											int aluvytGeneralFare=100;

											System.out.println("Booking Successful");
									System.out.println("Do you want to print the ticket ?(Y/N)");
									String yesno9=details.next();
									
									if(yesno9.equals("y" )|| yesno9.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: ALUVA"+"\t\t\t\t\tTo: VYTILA\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: General"+"\t\t\t\t\tSeat: "+aluvytGeneralSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+aluvytGeneralFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}
									break;
									
				    			}
						break;
					}	
					break;
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

									System.out.println("Booking Successful");
									System.out.println("Do you want to print the ticket ?(Y/N)");
									String yesno10=details.next();
									
									if(yesno10.equals("y" )|| yesno10.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: EDAPPALLY"+"\t\t\t\t\tTo: ALUVA\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: AC"+"\t\t\t\t\tSeat: "+edpaluAcSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+edpaluAcFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}

									break;
									case 2: System.out.println("\nYou have selected Sleeper coach");
									System.out.println("Enter the Seat No:");
									int edpaluSleeperSeat=details.nextInt();
									int edpaluSleeperFare=100;

									System.out.println("Booking Successful");
									System.out.println("Do you want to print the ticket ?(Y/N)");
									String yesno11=details.next();
									
									if(yesno11.equals("y" )|| yesno11.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: EDAPPALLY"+"\t\t\t\t\tTo: ALUVA\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: Sleeper"+"\t\t\t\t\tSeat: "+edpaluSleeperSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+edpaluSleeperFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}

									break;
									case 3: System.out.println("\nYou have selected General coach");
									System.out.println("Enter the Seat No:");
									int edpaluGeneralSeat=details.nextInt();
									int edpaluGeneralFare=50;

									System.out.println("Booking Successful");
									System.out.println("Do you want to print the ticket ?(Y/N)");
									String yesno12=details.next();
									
									if(yesno12.equals("y" )|| yesno12.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: EDAPPALLY"+"\t\t\t\t\tTo: ALUVA\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: General"+"\t\t\t\t\tSeat: "+edpaluGeneralSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+edpaluGeneralFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}
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

											System.out.println("Booking Successful");
									System.out.println("Do you want to print the ticket ?(Y/N)");
									String yesno13=details.next();
									
									if(yesno13.equals("y" )|| yesno13.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: EDAPPALLY"+"\t\t\t\t\tTo: KALOOR\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: AC"+"\t\t\t\t\tSeat: "+edpkalAcSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+edpkalAcFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}

									break;
									case 2: System.out.println("\nYou have selected Sleeper coach");
											System.out.println("Enter the Seat No:");
											int edpkalSleeperSeat=details.nextInt();
											int edpkalSleeperFare=125;

											System.out.println("Booking Successful");
									System.out.println("Do you want to print the ticket ?(Y/N)");
									String yesno14=details.next();
									
									if(yesno14.equals("y" )|| yesno14.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: EDAPPALLY"+"\t\t\t\t\tTo: KALOOR\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: Sleeper"+"\t\t\t\t\tSeat: "+edpkalSleeperSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+edpkalSleeperFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}
									break;
									case 3: System.out.println("\nYou have selected General coach");
											System.out.println("Enter the Seat No:");
											int edpkalGeneralSeat=details.nextInt();
											int edpkalGeneralFare=75;

											System.out.println("Booking Successful");
									System.out.println("Do you want to print the ticket ?(Y/N)");
									String yesno15=details.next();
									
									if(yesno15.equals("y" )|| yesno15.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: EDAPPALLY"+"\t\t\t\t\tTo: KALOOR\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: General"+"\t\t\t\t\tSeat: "+edpkalGeneralSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+edpkalGeneralFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}
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

											System.out.println("Booking Successful");
									System.out.println("Do you want to print the ticket ?(Y/N)");
									String yesno16=details.next();
									
									if(yesno16.equals("y" )|| yesno16.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: EDAPPALLY"+"\t\t\t\t\tTo: VYTILA\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: AC"+"\t\t\t\t\tSeat: "+edpvytAcSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+edpvytAcFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}
									break;
									case 2: System.out.println("\nYou have selected Sleeper coach");
											System.out.println("Enter the Seat No:");
											int edpvytSleeperSeat=details.nextInt();
											int edpvytSleeperFare=150;

											System.out.println("Booking Successful");
									System.out.println("Do you want to print the ticket ?(Y/N)");
									String yesno17=details.next();
									
									if(yesno17.equals("y" )|| yesno17.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: EDAPPALLY"+"\t\t\t\t\tTo: VYTILA\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: Sleeper"+"\t\t\t\t\tSeat: "+edpvytSleeperSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+edpvytSleeperFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}
									break;
									case 3: System.out.println("\nYou have selected General coach");
											System.out.println("Enter the Seat No:");
										    int edpvytGeneralSeat=details.nextInt();
											int edpvytGeneralFare=100;

											System.out.println("Booking Successful");
									System.out.println("Do you want to print the ticket ?(Y/N)");
									String yesno18=details.next();
									
									if(yesno18.equals("y" )|| yesno18.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: EDAPPALLY"+"\t\t\t\t\tTo: VYTILA\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: General"+"\t\t\t\t\tSeat: "+edpvytGeneralSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+edpvytGeneralFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}
									break;
									
				    			}
						break;
					}
					break;
										//From KALOOR
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

									System.out.println("Booking Successful");
									System.out.println("Do you want to print the ticket ?(Y/N)");
									String yesno19=details.next();
									
									if(yesno19.equals("y" )|| yesno19.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: KALOOR"+"\t\t\t\t\tTo: ALUVA\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: AC"+"\t\t\t\t\tSeat: "+kalaluAcSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+kalaluAcFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}

									break;
									case 2: System.out.println("\nYou have selected Sleeper coach");
									System.out.println("Enter the Seat No:");
									int kalaluSleeperSeat=details.nextInt();
									int kalaluSleeperFare=100;

									System.out.println("Booking Successful");
									System.out.println("Do you want to print the ticket ?(Y/N)");
									String yesno20=details.next();
									
									if(yesno20.equals("y" )|| yesno20.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: KALOOR"+"\t\t\t\t\tTo: ALUVA\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: Sleeper"+"\t\t\t\t\tSeat: "+kalaluSleeperSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+kalaluSleeperFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}

									break;
									case 3: System.out.println("\nYou have selected General coach");
									System.out.println("Enter the Seat No:");
									int kalaluGeneralSeat=details.nextInt();
									int kalaluGeneralFare=50;

									System.out.println("Booking Successful");
									System.out.println("Do you want to print the ticket ?(Y/N)");
									String yesno21=details.next();
									
									if(yesno21.equals("y" )|| yesno21.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: KALOOR"+"\t\t\t\t\tTo: ALUVA\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: General"+"\t\t\t\t\tSeat: "+kalaluGeneralSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+kalaluGeneralFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}
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

											System.out.println("Booking Successful");
									System.out.println("Do you want to print the ticket ?(Y/N)");
									String yesno22=details.next();
									
									if(yesno22.equals("y" )|| yesno22.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: KALOOR"+"\t\t\t\t\tTo: EDAPPALLY\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: AC"+"\t\t\t\t\tSeat: "+kaledpAcSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+kaledpAcFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}

									break;
									case 2: System.out.println("\nYou have selected Sleeper coach");
											System.out.println("Enter the Seat No:");
											int kaledpSleeperSeat=details.nextInt();
											int kaledpSleeperFare=125;

											System.out.println("Booking Successful");
											System.out.println("Do you want to print the ticket ?(Y/N)");
											String yesno23=details.next();
									
									if(yesno23.equals("y" )|| yesno23.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: KALOOR"+"\t\t\t\t\tTo: EDAPPALLY\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: Sleeper"+"\t\t\t\t\tSeat: "+kaledpSleeperSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+kaledpSleeperFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}
									break;
									case 3: System.out.println("\nYou have selected General coach");
											System.out.println("Enter the Seat No:");
											int kaledpGeneralSeat=details.nextInt();
											int kaledpGeneralFare=75;

											System.out.println("Booking Successful");
											System.out.println("Do you want to print the ticket ?(Y/N)");
											String yesno24=details.next();
									
									if(yesno24.equals("y" )|| yesno24.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: KALOOR"+"\t\t\t\t\tTo: EDAPPALLY\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: General"+"\t\t\t\t\tSeat: "+kaledpGeneralSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+kaledpGeneralFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}
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

											System.out.println("Booking Successful");
											System.out.println("Do you want to print the ticket ?(Y/N)");
											String yesno25=details.next();
									
									if(yesno25.equals("y" )|| yesno25.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: KALOOR"+"\t\t\t\t\tTo: VYTILA\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: AC"+"\t\t\t\t\tSeat: "+kalvytAcSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+kalvytAcFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}
									break;
									case 2: System.out.println("\nYou have selected Sleeper coach");
											System.out.println("Enter the Seat No:");
											int kalvytSleeperSeat=details.nextInt();
											int kalvytSleeperFare=150;

											System.out.println("Booking Successful");
											System.out.println("Do you want to print the ticket ?(Y/N)");
											String yesno26=details.next();
									
									if(yesno26.equals("y" )|| yesno26.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: KALOOR"+"\t\t\t\t\tTo: VYTILA\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: Sleeper"+"\t\t\t\t\tSeat: "+kalvytSleeperSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+kalvytSleeperFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}
									break;
									case 3: System.out.println("\nYou have selected General coach");
											System.out.println("Enter the Seat No:");
										    int kalvytGeneralSeat=details.nextInt();
											int kalvytGeneralFare=100;

											System.out.println("Booking Successful");
											System.out.println("Do you want to print the ticket ?(Y/N)");
											String yesno27=details.next();
									
									if(yesno27.equals("y" )|| yesno27.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: KALOOR"+"\t\t\t\t\tTo: VYTILA\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: General"+"\t\t\t\t\tSeat: "+kalvytGeneralSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+kalvytGeneralFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}
									break;
									
				    			}
						break;
					}
					break;
											//From VYTILA
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

									System.out.println("Booking Successful");
											System.out.println("Do you want to print the ticket ?(Y/N)");
											String yesno28=details.next();
									
									if(yesno28.equals("y" )|| yesno28.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: VYTILA"+"\t\t\t\t\tTo: ALUVA\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: AC"+"\t\t\t\t\tSeat: "+vytaluAcSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+vytaluAcFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}

									break;
									case 2: System.out.println("\nYou have selected Sleeper coach");
									System.out.println("Enter the Seat No:");
									int vytaluSleeperSeat=details.nextInt();
									int vytaluSleeperFare=100;

									System.out.println("Booking Successful");
											System.out.println("Do you want to print the ticket ?(Y/N)");
											String yesno29=details.next();
									
									if(yesno29.equals("y" )|| yesno29.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: VYTILA"+"\t\t\t\t\tTo: ALUVA\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: Sleeper"+"\t\t\t\t\tSeat: "+vytaluSleeperSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+vytaluSleeperFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}

									break;
									case 3: System.out.println("\nYou have selected General coach");
									System.out.println("Enter the Seat No:");
									int vytaluGeneralSeat=details.nextInt();
									int vytaluGeneralFare=50;

									System.out.println("Booking Successful");
									System.out.println("Do you want to print the ticket ?(Y/N)");
									String yesno30=details.next();
									
									if(yesno30.equals("y" )|| yesno30.equals("Y"))	
									{
										
										System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
										System.out.println("\t\t\t\t\t********************************************************\n");
										System.out.println("\t\t\t\t\tFrom: VYTILA"+"\t\t\t\t\tTo: ALUVA\n");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tCoach: General"+"\t\t\t\t\tSeat: "+vytaluGeneralSeat);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\t\t\t\t\tFare: "+vytaluGeneralFare);
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
										System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
										System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
									}
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

											System.out.println("Booking Successful");
											System.out.println("Do you want to print the ticket ?(Y/N)");
											String yesno31=details.next();
									
											if(yesno31.equals("y" )|| yesno31.equals("Y"))	
											{
										
												System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
												System.out.println("\t\t\t\t\t********************************************************\n");
												System.out.println("\t\t\t\t\tFrom: VYTILA"+"\t\t\t\t\tTo: EDAPPALLY\n");
												System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
												System.out.println("\t\t\t\t\tCoach: AC"+"\t\t\t\t\tSeat: "+vytedpAcSeat);
												System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
												System.out.println("\t\t\t\t\tFare: "+vytedpAcFare);
												System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
												System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
												System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
											}

									break;
									case 2: System.out.println("\nYou have selected Sleeper coach");
											System.out.println("Enter the Seat No:");
											int vytedpSleeperSeat=details.nextInt();
											int vytedpSleeperFare=125;

											System.out.println("Booking Successful");
											System.out.println("Do you want to print the ticket ?(Y/N)");
											String yesno32=details.next();
									
											if(yesno32.equals("y" )|| yesno32.equals("Y"))	
											{
										
												System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
												System.out.println("\t\t\t\t\t********************************************************\n");
												System.out.println("\t\t\t\t\tFrom: VYTILA"+"\t\t\t\t\tTo: EDAPPALLY\n");
												System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
												System.out.println("\t\t\t\t\tCoach: Sleeper"+"\t\t\t\t\tSeat: "+vytedpSleeperSeat);
												System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
												System.out.println("\t\t\t\t\tFare: "+vytedpSleeperFare);
												System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
												System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
												System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
											}

									break;
									case 3: System.out.println("\nYou have selected General coach");
											System.out.println("Enter the Seat No:");
											int vytedpGeneralSeat=details.nextInt();
											int vytedpGeneralFare=75;

											System.out.println("Booking Successful");
											System.out.println("Do you want to print the ticket ?(Y/N)");
											String yesno33=details.next();
									
											if(yesno33.equals("y" )|| yesno33.equals("Y"))	
											{
										
												System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
												System.out.println("\t\t\t\t\t********************************************************\n");
												System.out.println("\t\t\t\t\tFrom: VYTILA"+"\t\t\t\t\tTo: EDAPPALLY\n");
												System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
												System.out.println("\t\t\t\t\tCoach: General"+"\t\t\t\t\tSeat: "+vytedpGeneralSeat);
												System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
												System.out.println("\t\t\t\t\tFare: "+vytedpGeneralFare);
												System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
												System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
												System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
											}

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

											System.out.println("Booking Successful");
											System.out.println("Do you want to print the ticket ?(Y/N)");
											String yesno34=details.next();
									
											if(yesno34.equals("y" )|| yesno34.equals("Y"))	
											{
										
												System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
												System.out.println("\t\t\t\t\t********************************************************\n");
												System.out.println("\t\t\t\t\tFrom: VYTILA"+"\t\t\t\t\tTo: KALOOR\n");
												System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
												System.out.println("\t\t\t\t\tCoach: AC"+"\t\t\t\t\tSeat: "+vytkalAcSeat);
												System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
												System.out.println("\t\t\t\t\tFare: "+vytkalAcFare);
												System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
												System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
												System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
											}

									break;
									case 2: System.out.println("\nYou have selected Sleeper coach");
											System.out.println("Enter the Seat No:");
											int vytkalSleeperSeat=details.nextInt();
											int vytkalSleeperFare=150;

											System.out.println("Booking Successful");
											System.out.println("Do you want to print the ticket ?(Y/N)");
											String yesno35=details.next();
									
											if(yesno35.equals("y" )|| yesno35.equals("Y"))	
											{
										
												System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
												System.out.println("\t\t\t\t\t********************************************************\n");
												System.out.println("\t\t\t\t\tFrom: VYTILA"+"\t\t\t\t\tTo: EDAPPALLY\n");
												System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
												System.out.println("\t\t\t\t\tCoach: Sleeper"+"\t\t\t\t\tSeat: "+vytkalSleeperSeat);
												System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
												System.out.println("\t\t\t\t\tFare: "+vytkalSleeperFare);
												System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
												System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
												System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
											}

									break;
									case 3: System.out.println("\nYou have selected General coach");
											System.out.println("Enter the Seat No:");
										    int vytkalGeneralSeat=details.nextInt();
											int vytkalGeneralFare=100;

											System.out.println("Booking Successful");
											System.out.println("Do you want to print the ticket ?(Y/N)");
											String yesno36=details.next();
									
											if(yesno36.equals("y" )|| yesno36.equals("Y"))	
											{
										
												System.out.println("\n\t\t\t\t\t\t\t\tTICKET");
												System.out.println("\t\t\t\t\t********************************************************\n");
												System.out.println("\t\t\t\t\tFrom: VYTILA"+"\t\t\t\t\tTo: EDAPPALLY\n");
												System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
												System.out.println("\t\t\t\t\tCoach: General"+"\t\t\t\t\tSeat: "+vytkalGeneralSeat);
												System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
												System.out.println("\t\t\t\t\tFare: "+vytkalGeneralFare);
												System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
												System.out.println("\n\t\t\t\t\t\t\tHappy Journey");
												System.out.println("\t\t\t\t\t--------------------------------------------------------\n");
											}

									break;
									
				    			}
						break;
					}
					break;
			


			default: System.out.println("\nInvalid choice");
		}

	
		}
		
	}