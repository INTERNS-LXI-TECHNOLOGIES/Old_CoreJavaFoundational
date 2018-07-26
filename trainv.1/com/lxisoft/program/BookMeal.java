package com.lxisoft.program;
import java.util.*;

public class BookMeal
{
	char choice,choic;
	int foodOptions,foodSelect;
	int noOfPeople;
	int priceOfIdli,priceOfDosa,priceOfChappati,priceOfCBiriyani,priceOfRice;
	int amount;
	int totalAmountOfBreakfast,totalAmountOfLunch,totalAmountOfDinner;
	public void printDetails()
	{
		Scanner in=new Scanner(System.in);
		Scanner rd=new Scanner(System.in);
		priceOfRice=30;
		priceOfCBiriyani=100;
		priceOfChappati=40;
		priceOfDosa=40;
		priceOfIdli=30;
		System.out.println("************************************\nBOOK MEALS\n************************************");
			System.out.println("Enter the number of people you want to purchase food");
			noOfPeople=in.nextInt();
		do{
			System.out.println("BOOK FOOD FOR PERSON:");
			System.out.println("1.BREAKFAST");
			System.out.println("2.LUNCH");
			System.out.println("3.DINNER\nSelect one\n");
			foodOptions=in.nextInt();
			switch(foodOptions)
			{
				case 1:
				do
				{
					if(noOfPeople==0)
						break;
					System.out.println("AVAILABLE FOOD FOR BREAKFAST ARE:\n1.IDLI\n2.DOSA\n3.CHAPATHI\nSelect one\n");				
					foodSelect=in.nextInt();
					switch(foodSelect)
					{
						case 1:
							amount+=priceOfIdli;
							break;
						case 2:
							amount+=priceOfDosa;
							break;
						case 3:
							amount+=priceOfChappati;
							break;
						default:
							System.out.println("Invalid choice");
					}
					System.out.println("Do you want to buy another item for breakfast");
					
					choice=rd.next().charAt(0);
				}while(choice=='y' || choice=='Y');
				totalAmountOfBreakfast+=amount;
				totalAmountOfBreakfast*=noOfPeople;
				System.out.println("Total price="+totalAmountOfBreakfast);

				break;
				case 2:
					do
				{
					if(noOfPeople==0)
						break;
					System.out.println("AVAILABLE FOOD FOR LUNCH ARE:\n1.Chicken Biriyani\n2.Rice\n3.CHAPATHI\nSelect one\n");				
					foodSelect=in.nextInt();
					switch(foodSelect)
					{
						case 1:
							amount+=priceOfCBiriyani;
							break;
						case 2:
							amount+=priceOfRice;
							break;
						case 3:
							amount+=priceOfChappati;
							break;
						default:
							System.out.println("Invalid choice");
					}
					System.out.println("Do you want to buy another item for lunch");
					
					choice=rd.next().charAt(0);
				}while(choice=='y' || choice=='Y');
				totalAmountOfLunch+=amount;
				totalAmountOfLunch*=noOfPeople;
				System.out.println("Total price="+totalAmountOfLunch);

					break;
				case 3:
					do
				{
					if(noOfPeople==0)
						break;
					System.out.println("AVAILABLE FOOD FOR DINNER ARE:\n1.Chicken Biriyani\n2.Rice\n3.CHAPATHI\nSelect one\n");				
					foodSelect=in.nextInt();
					switch(foodSelect)
					{
						case 1:
							amount+=priceOfCBiriyani;
							break;
						case 2:
							amount+=priceOfRice;
							break;
						case 3:
							amount+=priceOfChappati;
							break;
						default:
							System.out.println("Invalid choice");
					}
					System.out.println("Do you want to buy another item for Dinner");
					
					choice=rd.next().charAt(0);
				}while(choice=='y' || choice=='Y');
				totalAmountOfDinner+=amount;
				totalAmountOfDinner*=noOfPeople;
				System.out.println("total price="+totalAmountOfDinner);

					break;
				default:
					System.out.println("Invalid choice");
		
			}
			System.out.println("Do you want to book once more");
			choic=rd.next().charAt(0);
	}while(choic=='y' || choic =='Y');
	System.out.println("Please pay the amount");
	System.out.println("Thanks for the payment.Your order is confired");
	}
}