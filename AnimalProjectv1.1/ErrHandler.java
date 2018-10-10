public class ErrHandler
{
	static boolean ErrorState = false;
	
	static void displayError(boolean b)
	{
		ErrorState = b;
	}
	
	static void print(String str)
	{
		if(ErrorState == true)
		{
			System.err.println(str);
		}
	}
}
