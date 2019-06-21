package com.lxisoft.movie.control;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import com.lxisoft.movie.model.ScriptFileModel;
/**
*This class is the control class for ScriptFile
*
*@author Arya Vineesh
*
*@version 1.0
*
*Date Modified:21/06/2019
*/
public class ScriptFileControl
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(ScriptFileControl.class.getName());
	
	public ScriptFileControl()
	{
		log.setLevel(Level.WARNING);
	}
	
	/**
	*This method is used for create file
	*
	*@param fileName - the name of the file to be create
	*/
	public void createFile(String fileName)
	{
		log.info("ScriptFileControl class.............createFile............start");
		try
		{
			File newFile=new File(fileName);
			newFile.createNewFile();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		log.info("ScriptFileControl class.............createFile............end");
	}
	
	/**
	*This method is used to read data from file
	*
	*@param fileName - the name of the file to be read
	*
	*/
	public ArrayList<String> readFromFile(String fileName)
	{
		log.info("ScriptFileControl class.............readFromFile............start");
		
		
		ArrayList<String> readDataList=new ArrayList<String>();
		ScriptFileModel scriptFileModel=new ScriptFileModel();
		try
		{
			FileReader fr=new FileReader(fileName);
			BufferedReader br=new BufferedReader(fr);
			
			scriptFileModel.setReadData(br.readLine());
			
			String data=scriptFileModel.getReadData();
			
			// System.out.println("dataa from file\n"+data);
			
			while(data!=null)
			{
				
				
				String array[]=data.split(":");
				for(String value:array)
					readDataList.add(value);
				data=br.readLine();
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
		log.info("ScriptFileControl class.............readFromFile............end");
	return readDataList;
	}
}