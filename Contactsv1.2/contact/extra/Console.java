
/**
 * Class Console
 *
 *    ->    static void setErrDisplay(boolean state)  ->  Set Error Display State on/off
 *
 *    ->    static void log(T value1)   ->  Prints value1 to stdout
 *
 *    ->    static void log(T ...value1)   ->  Prints value1 to stdout
 *
 *    ->    static void vardump(T obj)  ->  Prints all the fields of obj
 *
 *    ->    static void exit(int status)  -> Exit the current Program
 *
 *    ->    static void printT(final char str)
 * 
 *    ->    static void sleep(long ms)  -> Sleeps the current thread
 * 
 *    ->    static void cls()   -> Clears the screen
 *  
 *    ->    static void exit(final int status)  -> Exit the current program
 */

 
package contact.extra;

import java.lang.reflect.*;

public class Console
{
    static boolean errState = true;

       public static void setErrDisplay(boolean state)
       {
           Console.errState = state;
       }

       public static void newLine()
       {
               Console.log("\n");
       }

       public static <T> void log(T value1)
       {
           if(Console.errState)
           {
               if(value1 == null)
               {
                   Console.log("null");
               }
               else
               {
           			if(value1.getClass().isArray())
           			{
           				//Console.newLine();
           				Console.log("{");

           				for(int i = 0;i < Array.getLength(value1);i++)
           				{
           					Console.log(Array.get(value1 , i));

           					if((i+1) != Array.getLength(value1))
           					{
           						Console.log(",");
           					}
           				}

           				Console.log("}");
           				//Console.newLine();
           			}
           			else
           			{
           				System.out.print(value1);
           			}
   		        }
            }
       }

       public static <T> void log(T value1 , T ...value2)
       {
   		   Console.log(value1);

           for(T s: value2)
           {
   			         Console.log(s);
   		   }

           Console.newLine();

       }

       public static <T> void vardump(T obj1 , T ...obj2)
       {
           try
           {
               Field[] fields = obj1.getClass().getDeclaredFields();

               Console.newLine();
               Console.log("{");
               Console.newLine();

               for(Field field:fields)
               {
                   field.setAccessible(true);
                   String name = field.getName();
                   Object value = field.get(obj1);
                   Console.log("   \"" , name , "\""  , " : " , value);
               }

               Console.newLine();
               Console.log("}");
               Console.newLine();

               for(T obj : obj2)
               {
                  fields = obj.getClass().getDeclaredFields();

                  Console.newLine();
                  Console.log("{");
                  Console.newLine();

                   for(Field field:fields)
                   {
                       field.setAccessible(true);
                       String name = field.getName();
                       Object value = field.get(obj1);
                       Console.log("   \"" , name ,"\"" ," : " , value);
                   }

                   Console.newLine();
                   Console.log("}");
                   Console.newLine();

               }
           }
           catch(Exception e)
           {
               Console.log(e.getMessage());
           }
       }



        public static void printType(String str)
        {
            for(int i = 0;i < str.length();i++)
            {
                Console.log(str.charAt(i));
                Console.sleep(200);
            }
    
        }

     

        public static void sleep(long ms)
        {
            try{ Thread.currentThread().sleep(ms);}catch(Exception e){}
        }

        public static void cls()
        {
            //TODO : Method to clear the screen
        }

        public static void exit(final int status)
        {
            System.exit(status);
        }
}