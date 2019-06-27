import java.util.*;
import java.io.*;
public class Lab
{   String name;
    static BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
    static Scanner in = new Scanner (System.in);

  public void readLab()
  {
    try{
        System.out.println("enter the name of the LAB:");
        name=input.readLine(); 
        }catch(IOException e){} 
  }
  public void displayLab()
  {
    System.out.println("Lab:"+name);
  }


}