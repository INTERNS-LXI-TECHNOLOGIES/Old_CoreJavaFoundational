import java.util.*;
public class Credential_View
{
	Credential_Controller con;
	Credential_Model model;
	Scanner sc;
	Credential_View()throws Exception
	{
		sc=new Scanner(System.in);
		con=new Credential_Controller();
		System.out.println("Name of Actor:");
		con.actorData(sc.nextLine());
		playSelector("actor");
		System.out.println("Name of Actress:");
		con.actressData(sc.nextLine());
		playSelector("actress");
		
		
		
	}
	public playSelector(String temp)
	{
		System.out.println("Specify the role of "+temp);
		System.out.println("1.Hero \t\t 2.Heroine \t\t 3.Comedian \t\t 4.Villan");
	
	}
	
	
}