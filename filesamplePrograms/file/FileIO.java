import java.io.*;
import java.util.*;

public class FileIO 
{

public static void main(String args[])
 {        
    try 
	{
        File input = new File("./input.txt");
        File output = new File("./output.txt");
        Scanner sc = new Scanner(input);
		
		//FileReader fr= new FileReader("./input.txt");
		
        PrintWriter printer = new PrintWriter(output);
        while(sc.hasNextLine()) 
		{
            String s = sc.nextLine();
            printer.write(s);
        }
    }
    catch(FileNotFoundException e)
	{
        System.err.println("File not found. Please scan in new file.");
    }
//reading from one file Writing on another

//System.out.println(new File("input").getAbsolutePath()); 
//for the specific path
}

}