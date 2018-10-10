
/**
 * Class Console
 *    -> static void log(final String str)
 *    -> static void exit(int status)
 */

public final class Console
{
    Console(){}

    public static void log(final String str)
    {
         System.err.println(str);
    }

    public static void exit(int status)
    {
        System.exit(status);
    }
}
