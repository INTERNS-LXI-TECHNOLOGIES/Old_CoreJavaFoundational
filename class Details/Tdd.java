import java.util.Scanner;
public class Tdd
{
public static void main(String args[])
{
		Scanner scan=new Scanner(System.in);
		int n;
        
		int i,c;
		System.out.println("how many class do you want to entry");
		n=scan.nextInt();
		ClassRoom[] classRooms=new ClassRoom[n];
		
		for(i=0;i<n;i++)
		{
			
		 classRooms[i]=new ClassRoom();
		classRooms[i].setClassDetails();
		}
		for(i=0;i<n;i++)
		{
			classRooms[i].printClassDetails();
			
		}
}		

}