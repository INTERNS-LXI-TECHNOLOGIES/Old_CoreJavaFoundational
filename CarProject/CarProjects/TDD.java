
class TDD
{
	
	public static void main(String[] args)
	{
		Menu m = new Menu();
		
		while(true)
		{
			m.printMenu();
			
			switch(m.opt)
			{
				case 1:m.addCarDetails();break;
				case 2:m.viewCarDetails(1);break;
				case 3:m.viewAllCarDetails();break;
				default:System.exit(0);
			}
			
		}
	
	}
}
