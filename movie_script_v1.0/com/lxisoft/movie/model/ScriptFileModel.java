package com.lxisoft.movie.model;
import java.io.*;
import java.util.*;
import java.util.logging.*;
/**
*This class is the model class for ScriptFile
*
*@author AryaVineesh
*
*@version 1.0
*
*Date Modified:22/06/2019
*/
public class ScriptFileModel
{
	public ScriptFileModel()
	{
		log.setLevel(Level.WARNING);
	}
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
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(ScriptFileModel.class.getName());
	
	/**
	*This is a setter which set the name of the file
	*
	*@param fileName - the name of the file to be set
	*/
	
	public void setFileName(String fileName)
	{
		log.info("ScriptFileModel class..............setFileName.............starts");
		this.fileName=fileName;
		log.info("ScriptFileModel class..............setFileName.............end");
	}
	
	
	/**
	*This is a getter which return name of the file
	*
	*@return fileName
	*/
	
	public String getFileName()
	{
		log.info("ScriptFileModel class..............getFileName.............starts/end");
		return fileName;
	}
	
	/**
	*This is setter used to set the readed data 
	*
	*@param readData - the data that read from file
	*/
	
	public void setReadData(String readData)
	{
		log.info("ScriptFileModel class..............setReadData.............starts");
		this.readData=readData;
		log.info("ScriptFileModel class..............setReadData.............end");
	}
	
	/**
	*This is a getter which returns the readed data
	*
	*@return readData
	*/
	
	public String getReadData()
	{
		log.info("ScriptFileModel class..............getReadData.............starts/end");
		return readData;
	}
	
	/**
	*This is a setter used to set the data to be write to the file
	*
	*@param writeData - the date to be write to the file
	*/
	
	public void setWriteData(String writeData)
	{
		log.info("ScriptFileModel class..............setWriteData.............starts");
		this.writeData=writeData;
		log.info("ScriptFileModel class..............setWriteData.............end");
	}
	
	/**
	*This is a getter which return writeData
	*
	*@return writeData 
	*/
	
	public String getWriteData()
	{
		log.info("ScriptFileModel class..............getWriteData.............starts/end");
		return writeData;
		
	}
}