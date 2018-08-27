import java.util.*;
public class Credential_View
{
	Credential_Controller con=new Credential_Controller();;
	Credential_Model model;
	Scanner sc;
	Credential_View()throws Exception
	{
		sc=new Scanner(System.in);
		System.out.println("Name of person:\n");
		model.setFname(sc.nextLine());
		con.personalData(model.getFname());
		con.personalData("name",model.getFname());
		System.out.println("Roles played:\n");
		con.personalData("Roles",sc.nextLine());
		System.out.println("Experience in industry:");
		con.personalData("Experience",sc.nextLine());
		System.out.println("Locations played\n");
		con.personalData("Location",sc.nextLine());
		
	}
	public void playSelector(String temp)
	{	sc=new Scanner(System.in);
		System.out.println("Specify the role of "+temp);
		System.out.println("1.Hero \t\t 2.Heroine \t\t 3.Comedian \t\t 4.Villan");
		//con.roleSpecifier(sc.nextInt());
	}
	
	
}