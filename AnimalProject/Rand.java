import java.util.*;

/*

	static int randNumber(int min , int max) -> 

*/

public class Rand
{
	public static int randNumber(int min , int max)
	{
		Random r = new Random();
		return r.nextInt((max)+min);
	}
}