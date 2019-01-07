package  com.lxisoft.quiz.utilities;
import java.io.*;
import java.util.*;
/**
*This class is used for performing file operations
*
*@author Arya Vineesh
*
*@version 1.4
*/
public class Utility
{
	/**
	*This is the name of the file
	*/
	private String fileName;
	
	/**
	*This is the readed data
	*/
	private String readData;
	
	private String writeData;
	
	/**
	*this is an array of readData
	*/
	
	private String[] readDataArray;
	
	/**
	*This is a setter set the name of the file
	*
	*@param fileName - the name of the file to be set
	*/
	
	public void setFileName(String fileName)
	{
		this.fileName=fileName;
	}
	
	/**
	*This is a getter which return name of the file
	*
	*@return fileName
	*/
	
	public String getFileName()
	{
		return fileName;
	}
	
	/**
	*This is setter used to set the readed data 
	*
	*@param readData
	*/
	
	public void setReadData(String readData)
	{
		this.readData=readData;
	}
	
	/**
	*This is a getter which returns the readed data
	*
	*@return readData
	*/
	
	public String getReadData()
	{
		return readData;
	}
	
	/**
	*This method is used for create file
	*
	*@param file - the file to be create
	*/
	public String createFile(String fileName)
	{
		
		try
		{
			
			File newFile=new File(fileName);
			newFile.createNewFile();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return fileName;
	}
	
	/**
	*This method is used to read data from file
	*
	*@param file - the file to be read
	*
	*/
	public String readFromFile(String fileName)
	{
		
		try
		{
			FileReader fr=new FileReader(fileName);
			BufferedReader br=new BufferedReader(fr);
			
			readData=br.readLine();
			System.out.println();
			System.out.println("aaarya>>>>>>>>>>"+readData);
			System.out.println();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	return readData;
	}
	
	/**
	*This method is used to write to the file
	*
	*@param file - the file to which write data
	*
	*/
	
	public String writeToFile(String fileName,String writeData)
	{
		
		this.writeData=writeData;
		System.out.println();
		System.out.println("write data......................>>>>"+writeData);
		System.out.println();
		try
		{
			FileWriter fw=new FileWriter(fileName,true);
			BufferedWriter bw=new BufferedWriter(fw);
			if(writeData!=null)
			{
			System.out.println("inside if loop>>>>>>>");
			bw.write(writeData);
			// bw.newLine();
			
			}
			 
			bw.append(",");
			bw.flush();
			bw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
			System.out.println("something went wrong in try block");
		}
		return writeData;
	}
	
	/**
	*This method is used to print the contents of the file
	*
	*
	*
	*/
	
	public String[] printFile(String data)
	{
		while(data!=null)
		{
			String readDataArray[]=data.split(",");
			for(int i=0;i<5;i++)
			{
				System.out.println(readDataArray[i]);
			}
			
		}
		return readDataArray;
	}
	
	
}