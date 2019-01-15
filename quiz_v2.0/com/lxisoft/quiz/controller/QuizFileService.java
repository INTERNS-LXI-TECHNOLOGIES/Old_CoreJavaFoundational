package com.lxisoft.quiz.controller;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import com.lxisoft.quiz.model.QuizFileModel;
import com.lxisoft.quiz.controller.QuestionPaperService;
public class QuizFileService
{
	QuizFileModel quizFileModel=new QuizFileModel();
	
	ArrayList<String> readDataList=new ArrayList<String>();
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(QuestionPaperService.class.getName());
	
	/**
	*This method is used for create file
	*
	*@param fileName - the name of the file to be create
	*
	*/
	public void createFile(String fileName)
	{
		log.info("QuizFileService class.............createFile............start");
		try
		{
			File newFile=new File(fileName);
			newFile.createNewFile();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		log.info("QuizFileService class.............createFile............end");
	}
	
	/**
	*This method is used to read data from file
	*
	*@param fileName - the name of the file to be read
	*
	*/
	public ArrayList<String> readFromFile(String fileName)
	{
		log.info("QuizFileService class.............readFromFile............start");
		
		
		
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
		log.info("QuizFileService class.............readFromFile............end");
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
		log.info("QuizFileService class.............writeToFile............start");
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
		log.info("QuizFileService class.............writeToFile............end");
		return writeData;
	}
	
	
	
	public boolean isCorrect(String answer,String correctAnswer)
	{
		log.info("QuizFileService class.........calculateResult........start");
		
		log.info("QuizFileService class.........calculateResult.........end");
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