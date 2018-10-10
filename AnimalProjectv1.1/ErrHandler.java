
/*
 * Class ErrHandler
 *
 * 	-> static void displayError(boolean b)	[ Set if error should be printed ]
 *
 *  -> static void print(String str)		[ Prints str ]
 */

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
