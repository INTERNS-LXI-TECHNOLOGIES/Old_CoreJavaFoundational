import java.util.Scanner;
public class Platform
{
	int pfNo;
	
	String times[]=new String[5];
	Train[] trains=new Train[6];
	Scanner scan=new Scanner(System.in);
public void setDetails()
	{	
	for(int i=0;i<6;i++)
		{
		trains[i]=new Train();
		trains[i].setDetails();
		}
	
		trains[0].trainNo=112;
		trains[1].trainNo=122;
		trains[2].trainNo=231;
		trains[3].trainNo=345;
		trains[4].trainNo=456;
		trains[5].trainNo=567;
		trains[0].name="Amritha Express";
		trains[1].name="Trivandrum Express";
		trains[2].name="Ernamkulam Passenger";
		trains[3].name="Palakkad Express";
		trains[4].name="Thrissur Passenger";
		trains[5].name="Bangalore Express";

		times[0]="9.00 am";
		times[1]="1.00 pm";
		times[2]="3.00 pm";
		times[3]="10.00 am";
		times[4]="2.00 pm";
}

}		