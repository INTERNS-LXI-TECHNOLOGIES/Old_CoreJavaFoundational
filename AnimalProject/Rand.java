import java.util.*;

/*

	static int randNumber(int min , int max) -> returns a random number

*/

public class Rand
{
	public static int randNumber(int min , int max)
	{
		Random r = new Random();
		return r.nextInt((max)+min);
	}
}