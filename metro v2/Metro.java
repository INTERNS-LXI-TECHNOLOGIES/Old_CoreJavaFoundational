import java.util.Scanner;
public class Metro
{
	
String destin,name;
int noOfTick;
String times[]=new String[5];
	Platform[] platforms=new Platform[6];
	Coach coachs=new Coach();
	Scanner scan=new Scanner(System.in);
	public void setDetails()
	{
		
		
		
		for(int i=0;i<6;i++)
		{
			platforms[i]=new Platform();
		}
		platforms[0].pfNo=1;
		platforms[1].pfNo=2;
		platforms[2].pfNo=3;
		platforms[3].pfNo=4;
		platforms[4].pfNo=5;
		platforms[5].pfNo=6;
		
	}

	
	public void checkDetails()
		{
		System.out.println("Train going places are\n1.Trivandrum \n2.Ernamkulam\n3.Kottayam\n4.Palakkad\n5.Kozhikode\n");
		System.out.print("Destination:");
		destin=scan.nextLine();
		
		for(int i = 0;i<6;i++){
		platforms[i].setDetails();
		}
			if(destin.equals("Trivandrum")||destin.equals("trivandrum")||destin.equals("TRIVANDRUM"))
			{
			System.out.println("1."+platforms[0].trains[0].name+" "+platforms[0].trains[0].trainNo+" at "+platforms[0].times[0]+" on platform number "+platforms[0].pfNo+"\n2."+platforms[1].trains[1].name+" "+platforms[1].trains[1].trainNo+" at "+platforms[1].times[1]+" on platform number "+platforms[1].pfNo+"\n");
			int choice=scan.nextInt();
			switch(choice)
			{
			case 1:
			platforms[0].trains[0].selectCoach();
			break;
			case 2:
			platforms[1].trains[1].selectCoach();
			break;
			default:System.out.println("Trains not available");
			}
			}
			else if(destin.equals("Ernamkulam")||destin.equals("ernamkulam")||destin.equals("ERNAMKULAM"))
			{
			System.out.println("1."+platforms[0].trains[0].name+" "+platforms[0].trains[0].trainNo+" at "+platforms[0].times[0]+" on platform number "+platforms[0].pfNo+"\n2."+platforms[1].trains[1].name+" "+platforms[1].trains[1].trainNo+" at "+platforms[1].times[1]+" on platform number "+platforms[1].pfNo+"\n3."+platforms[2].trains[2].name+" "+platforms[2].trains[2].trainNo+" at "+platforms[2].times[3]+" on platform number "+platforms[2].pfNo+"\n");
			int choice=scan.nextInt();
			switch(choice)
			{
			case 1:
			platforms[0].trains[0].selectCoach();
			break;
			case 2:
			platforms[1].trains[1].selectCoach();
			break;
			case 3:
			platforms[2].trains[2].selectCoach();
			break;
			default:System.out.println("Trains not available");
			}
			}
			else if(destin.equals("Kottayam")||destin.equals("kottayam")||destin.equals("KOTTAYAM"))
			{
			System.out.println("1."+platforms[0].trains[0].name+" "+platforms[0].trains[0].trainNo+" at "+platforms[0].times[0]+" on platform number "+platforms[0].pfNo+"\n2."+platforms[1].trains[1].name+" "+platforms[1].trains[1].trainNo+" at "+platforms[1].times[1]+" on platform number "+platforms[1].pfNo+"\n");
			int choice=scan.nextInt();
			switch(choice)
			{
			case 1:
			platforms[0].trains[0].selectCoach();
			break;
			case 2:
			platforms[1].trains[1].selectCoach();
			break;
			default:System.out.println("Trains not available");
			}
			}
			else if(destin.equals("Palakkad")||destin.equals("palakkad")||destin.equals("PALAKKAD"))
			{
			System.out.println("1."+platforms[3].trains[3].name+""+platforms[3].trains[3].trainNo+" at "+platforms[3].times[3]+" on platform number "+platforms[3].pfNo+"\n2."+platforms[4].trains[4].name+""+platforms[4].trains[4].trainNo+" at "+platforms[4].times[4]+" on platform number "+platforms[4].pfNo+"\n");
			int choice=scan.nextInt();
			switch(choice)
			{
			case 1:
			platforms[3].trains[3].selectCoach();
			break;
			case 2:
			platforms[4].trains[4].selectCoach();
			break;
			default:System.out.println("Trains not available");
			}
			}
			else if(destin.equals("Kozhikode")||destin.equals("kozhikode")||destin.equals("KOZHIKODE"))
			{
			System.out.println("1."+platforms[5].trains[5].name+" "+platforms[5].trains[5].trainNo+" at "+platforms[5].times[4]+" on platform number "+platforms[5].pfNo+"\n2."+platforms[0].trains[0].name+" "+platforms[0].trains[4].trainNo+" at "+platforms[0].times[0]+" on platform number "+platforms[0].pfNo+"\n");
			int choice=scan.nextInt();
			switch(choice)
			{
			case 1:
			platforms[5].trains[5].selectCoach();
			break;
			case 2:
			platforms[0].trains[0].selectCoach();
			break;
			default:System.out.println("Trains not available");
			}
			}
			
			
		}
		
		
}
	



