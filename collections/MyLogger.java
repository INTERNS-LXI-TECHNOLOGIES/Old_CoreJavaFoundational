package com.lxisoft.collections;
import java.io.*;
import java.util.logging.*;
public class MyLogger
{
	public static Logger logger()
	{
		Logger log=Logger.getLogger(MyLogger.class.getName());
		try{
			 FileHandler fileHandler=new FileHandler("logger.log");
			//FileHandler fileHandler=System.setProperty("java.util.logging.config.file","C:\\java\\com\\logging.properties");
			SimpleFormatter simpleFormatter=new SimpleFormatter();
			log.addHandler(fileHandler);
			fileHandler.setFormatter(simpleFormatter);
			log.setUseParentHandlers(false);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return log;
	}
}