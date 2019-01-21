import java.util.Scanner;
public class Platform   
 {
int pfnumber;
 
Scanner scan=new Scanner(System.in);
Train train=new Train();

   public void	setPlatformDetails()
	{
        System.out.println("enter platform number");
	    pfnumber=scan.nextInt();
        train.setTrainDetails(); 
	}
	
    public void	printDetails()
	{
		 
		 System.out.println("platform number="+pfnumber);
		 train.printDetails();
    }
}