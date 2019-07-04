import java.io.*;
import java.util.*;
public class Manager
{
     String name;
     static BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
     static Scanner in = new Scanner(System.in);
  public void readManager()
  {
    System.out.println("enter the name of the manager:");
    name=in.nextLine();
     System.out.println("Manager name:"+name);
  }
}