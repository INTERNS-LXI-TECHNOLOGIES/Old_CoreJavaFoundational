package contact.extras;

import java.lang.reflect.Array;

public class Console
{
    public static <T> void log(T obj)
    {
        if(obj.getClass().isArray())
        {
            for(int li = 0;li < Array.getLength(obj);li++)
            {
                System.out.println(Array.get(obj, li));
            }
        }
        else
        {
           System.out.print(obj); 
        }
    }

    public static <T> void log(Object obj1,T ...obj2)
    {
        Console.log(obj1);
        Console.log(obj2);
    }
}