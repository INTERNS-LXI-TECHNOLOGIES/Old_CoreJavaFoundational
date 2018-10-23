/**
 * Class Rand
 *
 * -	static int randNumber(int min , int max) -> returns a random number
 *
 */

package animal.extras;

import java.util.*;

public class Rand
{
	public static int randNumber(int min , int max)
	{
		Random r = new Random();
		return r.nextInt((max)+min);
	}
}
