public class Registration
{
	
	public void regNew(String regName,int reg_choice)
	{
		int id=reg_choice;
		
		if (id==1)
		{
		System.out.println("Enter the following details of "+regName+"\n\n");
		System.out.println("[AFFILIATION] : ");
		System.out.println("[COLLEGE ID] : ");
		System.out.println("[PASSWORD] : ");
		System.out.println("[CONFIRM PASSWORD] : ");
		}
		else if(id==2)
		{
		System.out.println("Enter the following details of "+regName+"\n\n");
		System.out.println("[FIRSTNAME] : ");
		System.out.println("[LASTNAME] : ");
		System.out.println("[USERNAME] : ");
		System.out.println("[EMAIL ID] : ");
		System.out.println("[PASSWORD] : ");
		System.out.println("[CONFIRM PASSWORD] : ");		
		}
		else if(id==3)
		{
		System.out.println("Enter the following details of "+regName+"\n\n");	
		System.out.println("[FIRSTNAME] : ");
		System.out.println("[LASTNAME] : ");
		System.out.println("[USERNAME] : ");
		System.out.println("[EMAIL ID] : ");
		System.out.println("[PASSWORD] : ");
		System.out.println("[CONFIRM PASSWORD] : ");
		}
		else if(id==4)
		{
		System.out.println("Enter the following details of "+regName+"\n\n");
		System.out.println("[REGISTRAR NAME] : ");
		System.out.println("[USERNAME] : ");
		System.out.println("[LIB ID] : ");
		System.out.println("[PASSWORD] : ");
		System.out.println("[CONFIRM PASSWORD] : ");
		}
		else
		System.out.println("wrong selection");		
	}
}