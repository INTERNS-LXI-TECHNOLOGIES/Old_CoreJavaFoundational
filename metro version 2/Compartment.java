import java.util.Scanner;
public class Compartment
{
String name; 
int number;
String clas;

Scanner scan=new Scanner (System.in);
Seat seat=new Seat();

			public void setCompartmentDetails()
			{
		        int x;
             
				do
				{
					   System.out.println("------------------\nchoose your option\n-----------------\n *)1=first Ac Sleeper \n *)2=Second AC Sleeper \n *)3=First Class Non-AC \n *)4=Three-tire AC Sleeper");
					   x=scan.nextInt();
									
						switch(x)
						{
							case 1:clas="First AC Sleeper";seat.setSeatDetails();break;
								
							case 2:clas="Second AC Sleeper";seat.setSeatDetails();break;
								
							case 3:clas="First class Non-AC";seat.setSeatDetails();break;
							
							case 4:clas="Three-tier AC Sleeper";seat.setSeatDetails();break;
							
							default:clas="invalid";
							System.out.println("please enter agane");
							//System.out.println("do you want to continue then press the key5 or you want not continue then press the key 0");				
							//y=scan.nextInt();
                         }
						
						
				}
				while(x>4);
				
				
			}
			
			public void printDetails()
			{
				System.out.println("class name="+clas);
			}
			
}