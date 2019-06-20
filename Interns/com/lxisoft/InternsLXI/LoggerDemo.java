package com.lxisoft.InternsLXI;
import java.util.*;
import java.util.logging.*;
import java.io.*;
public class LoggerDemo{

	private static Logger logger;

  // static {
  //     System.setProperty("java.util.logging.config.file","logging.properties");
  //     //must initialize loggers after setting above property
  //     logger = Logger.getLogger(LoggerDemo.class.getName());
 	// }
	public static Logger log(){
      		Logger logger=Logger.getLogger(LoggerDemo.class.getName());
		try{
			FileHandler fh = new FileHandler("logger.log");
			Properties prop = new Properties();

			SimpleFormatter simpleFormatter = new SimpleFormatter();
			logger.addHandler(fh);
			logger.setUseParentHandlers(false);
			fh.setFormatter(simpleFormatter);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	return logger;
	}
} 