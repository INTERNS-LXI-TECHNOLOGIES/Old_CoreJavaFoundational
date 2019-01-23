import java.util.Scanner;
public class Platform
{
	int pfNo;
	Train[] trains=new Train[6];
	Scanner scan=new Scanner(System.in);
	/*public void setDetails()
	{
		for(int i=0;i<1;i++)
		{
			trains[i]=new Train();
		trains[i].setDetails();
		}
	}*/
	public void trainDetails()
	{
	for(int i=0;i<6;i++)
		{
		trains[i]=new Train();
		trains[i].coachDetails();
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

		trains[0].time="9.00 am";
		trains[1].time="1.00 pm";
		trains[2].time="3.00 pm";
		trains[3].time="10.00 am";
		trains[4].time="2.00 pm";
		trains[5].time="4.00 pm";
}

}		