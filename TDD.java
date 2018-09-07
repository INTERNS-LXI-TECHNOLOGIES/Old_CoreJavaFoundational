

public class TDD
{
	public static void main(String[] args)
	{
		Car benz = new Car(1 , "ben" , "mercedez" , " s class" , "black");

		benz.fixTyre();
		benz.fixDoor();
		benz.fixStearing(); 
		
		benz.printDetails();
				
	}
}