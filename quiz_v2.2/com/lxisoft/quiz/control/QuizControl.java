package com.lxisoft.quiz.control;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import com.lxisoft.quiz.model.QuizModel;
/**
*This class is the control class for quiz
*
*@author Arya Vineesh
*
*@version 2.2
*/
public class QuizControl
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(QuizControl.class.getName());
	
	/**
	*This method is used for create file
	*
	*@param fileName - the name of the file to be create
	*
	*/
	public void createFile(String fileName)
	{
		log.info("QuizControl class.............createFile............start");
		try
		{
			File newFile=new File(fileName);
			newFile.createNewFile();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		log.info("QuizControl class.............createFile............end");
	}
	
	/**
	*This method is used to read data from file
	*
	*@param fileName - the name of the file to be read
	*
	*/
	public ArrayList<String> readFromFile(String fileName)
	{
		log.info("QuizControl class.............readFromFile............start");
		
		
		ArrayList<String> readDataList=new ArrayList<String>();
		QuizModel quizFileModel=new QuizModel();
		try
		{
			FileReader fr=new FileReader(fileName);
			BufferedReader br=new BufferedReader(fr);
			
			quizFileModel.setReadData(br.readLine());
			
			String data=quizFileModel.getReadData();
			while(data!=null)
			{
				
				
				String array[]=data.split(",");
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
		log.info("QuizControl class.............readFromFile............end");
	return readDataList;
	}
	
	/**
	*This method is used to write to the file , which accepts two parameters - a fileName and writeData
	*this method also return writeData
	*@param fileName - the name of the file to which write data
	*@param writeData - the data to be write to the file
	*@return writeData 
	*/
	
	public String writeToFile(String fileName,String writeData)
	{
		log.info("QuizControl class.............writeToFile............start");
		System.out.println("data........"+writeData);
		try
		{
			FileWriter fw=new FileWriter(fileName,true);
			BufferedWriter bw=new BufferedWriter(fw);
			if((writeData)!=null)
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
		log.info("QuizControl class.............writeToFile............end");
		return writeData;
	}
	
	
	/**
	*This method is used for checking whether the answer is correct or wrong
	*@param answer - the answer choosen by the user
	*@param correctAnswer - the correct answer for the question
	*/
	public boolean isCorrect(String answer,String correctAnswer)
	{
		log.info("QuizControl class.........isCorrect........start/end");
		if(answer.equals(correctAnswer))
		{
			return true;
		}  
		else
		{
			return false;
		}
	}
}