package com.lxisoft.hotel.logger;
import java.util.logging.*;
import java.io.*;
public class Log{
	public Log(){
		try{
			logConfig();
		}catch(Exception e){
			
		}
	}
	public static final Logger log = Logger.getLogger(Log.class.getName());
	public static final LogManager logManager = LogManager.getLogManager();
	public void logConfig() throws Exception{
		logManager.readConfiguration(new FileInputStream("logConfig.properties"));
		Handler fh = new FileHandler("Log.log");
		log.addHandler(fh);
	}
}