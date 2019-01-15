package com.lxisoft.quiz.model;
import java.io.*;
import java.util.*;
import java.util.logging.*;
public class QuizFileModel
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
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(QuizFileModel.class.getName());
	
	/**
	*This is a setter which set the name of the file
	*
	*@param fileName - the name of the file to be set
	*/
	
	public void setFileName(String fileName)
	{
		log.info("QuizFileModel class..............setFileName.............starts");
		this.fileName=fileName;
		log.info("QuizFileModel class..............setFileName.............end");
	}
	
	/**
	*This is a setter which set readDataArray 
	*
	*@param readDataArray - an array which contain readData
	*/
	public void setReadDataArray(String[] readDataArray)
	{
		this.readDataArray=readDataArray;
	}
	
	/**
	*This is a getter which return readDataArray
	*
	*@return readDataArray
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
		log.info("QuizFileModel class..............getFileName.............starts/end");
		return fileName;
	}
	
	/**
	*This is setter used to set the readed data 
	*
	*@param readData - the data that read from file
	*/
	
	public void setReadData(String readData)
	{
		log.info("QuizFileModel class..............setReadData.............starts");
		this.readData=readData;
		log.info("QuizFileModel class..............setReadData.............end");
	}
	
	/**
	*This is a getter which returns the readed data
	*
	*@return readData
	*/
	
	public String getReadData()
	{
		log.info("QuizFileModel class..............getReadData.............starts/end");
		return readData;
	}
	
	/**
	*This is a setter used to set the data to be write to the file
	*
	*@param writeData - the date to be write to the file
	*/
	
	public void setWriteData(String writeData)
	{
		log.info("QuizFileModel class..............setWriteData.............starts");
		this.writeData=writeData;
		log.info("QuizFileModel class..............setWriteData.............end");
	}
	
	/**
	*This is a getter which return writeData
	*
	*@return writeData 
	*/
	
	public String getWriteData()
	{
		log.info("QuizFileModel class..............getWriteData.............starts/end");
		return writeData;
		
	}
	
}