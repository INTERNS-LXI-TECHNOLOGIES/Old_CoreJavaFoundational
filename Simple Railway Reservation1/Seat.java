import java.util.Scanner;
public class Seat
{

int seatNo;
String berth;

Scanner scan=new Scanner(System.in);

public void setSeatNoAndBerthType()
	{
		System.out.print("Seat No:");
		seatNo=scan.nextInt();
		if(seatNo>0 && seatNo<73)
		{
			if(seatNo % 8==1 || seatNo % 8==4)
			{
				berth="LB";
			}
			else if(seatNo % 8==2 || seatNo % 8==5)
			{
				berth="MB";
			}
			else if(seatNo % 8==3 || seatNo % 8==6)
			{
				berth="UB";
			}
			else if(seatNo % 8==7)
			{
				berth="SL";
			}
			else
			{
				berth="SU";
			}
		}
	}
	
public void printSeatNoAndBerthType()
{
		System.out.println("Seat No:"+seatNo);
		System.out.println("Berth:"+berth);
}

}