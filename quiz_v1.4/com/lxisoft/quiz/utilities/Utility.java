package  com.lxisoft.quiz.utilities;
import com.lxisoft.quiz.service.*;
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
	*This is the readed data from file
	*/
	private String readData;
	
	/**
	*This is the data to be write to the file
	*/
	private String writeData;
	
	/**
	*this is an array of readData
	*/
	
	private String[] readDataArray;
	
	/**
	*This is a setter which set the name of the file
	*
	*@param fileName - the name of the file to be set
	*/
	
	public void setFileName(String fileName)
	{
		this.fileName=fileName;
	}
	
	/**
	*This is a setter which set readDataArray 
	*
	*@param readDataArray
	*/
	public void setReadDataArray(String[] readDataArray)
	{
		this.readDataArray=readDataArray;
	}
	
	/**
	*This is a getter which return readDataArray
	*
	*
	*/
	public String[] getReadDataArray()
	{
		return readDataArray;
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
	public void readFromFile(String fileName)
	{
		Scanner stringInput=new Scanner(System.in);
		int count=0,Mark=0;
		try
		{
			FileReader fr=new FileReader(fileName);
			BufferedReader br=new BufferedReader(fr);
			
			readData=br.readLine();
			while(readData!=null)
			{
				readDataArray=readData.split(",");
				setReadDataArray(readDataArray);
				for(int i=0;i<5;i++)
				{
					System.out.println(readDataArray[i]);
				}
				System.out.println("answer:"+readDataArray[5]);
				System.out.println("Enter your answer:\n");
				String answer=stringInput.nextLine();
				if(answer.equals(readDataArray[5]))
				{
					count++;
					Mark=Mark+2;
				}  
				readData=br.readLine();
			}
			System.out.println();
			System.out.println("****************Quiz  completed**************");
			if(Mark>0)
				System.out.println("Status : Pass");
			else
				System.out.println("Status : Failed");
			System.out.println("The no of questions answered is: "+count);
			System.out.println("Mark Scored :"+Mark);
			if(Mark>=9)
				System.out.println("Grade A");
			else if(Mark<9 && Mark>=7)
				System.out.println("Grade B");
			else if(Mark<7 && Mark>=5)
				System.out.println("Grade C");
			else if(Mark<5 && Mark>0)
			{
				System.out.println("Grade not mentioned.You need improvement.");
			}
			br.close();
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("Array overflow..........");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	
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
		try
		{
			FileWriter fw=new FileWriter(fileName,true);
			BufferedWriter bw=new BufferedWriter(fw);
			if(writeData!=null)
			{
				bw.write(writeData);
				bw.newLine();
			}
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
	
	
	
	
}