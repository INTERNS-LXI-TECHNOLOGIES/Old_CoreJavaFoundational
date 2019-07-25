package com.lxisoft.contact.model;
import java.util.logging.*;
/**
*This class is used as a model class for Contact
*
*@author AryaVineesh
*
*@version 1.0
*
*Date Modified:24/07/2019
*/
public class Contact
{
	public Contact()
	{
		log.setLevel(Level.WARNING);
	}
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(Contact.class.getName());
	
	/**
	*This is the name of the person
	*/
	private String name;
	
	/**
	*This is the place of the person
	*/
	private String place;
	
	/**
	*This is the phone number of the person
	*/
	private int phoneNumber;
	
	/**
	*This is the email of the person
	*/
	private String email;
	
	/**
	*This method is used to set the name of the person
	*
	*@param name - the name to be set
	*
	*/
	public void setName(String name)
	{
		log.info("Contact class............setName...........Start");
		this.name=name;
		log.info("Contact class............setName...........end");
	}
	
	/**
	*This method will return the name of the person
	*
	*@return name 
	*
	*/
	public String getName()
	{
		log.info("Contact class............getName...........Start/end");
		return name;
	}
	
	/**
	*This method is used to set the place of the person
	*
	*@param place - the place to be set
	*
	*/
	public void setPlace(String place)
	{
		log.info("Contact class............setPlace...........Start");
		this.place=place;
		log.info("Contact class............setPlace...........end");
	}
	
	/**
	*This method will return the place of the person
	*
	*@return place 
	*
	*/
	public String getPlace()
	{
		log.info("Contact class............getPlace...........start/end");
		return place;
	}
	
	/**
	*This method is used to set the phoneNumber of the person
	*
	*@param phoneNumber - the phoneNumber to be set
	*
	*/
	public void setPhoneNumber(int phoneNumber)
	{
		log.info("Contact class............setPhoneNumber...........start");
		this.phoneNumber=phoneNumber;
		log.info("Contact class............setPhoneNumber...........end");
	}
	
	/**
	*This method will return the phoneNumber of the person
	*
	*@return phoneNumber 
	*
	*/
	public int getPhoneNumber()
	{
		log.info("Contact class............getPhoneNumber...........start/end");
		return phoneNumber;
	}
	
	/**
	*This method is used to set the email of the person
	*
	*@param email - the email to be set
	*
	*/
	public void setEmail(String email)
	{
		log.info("Contact class............setEmail...........start");
		this.email=email;
		log.info("Contact class............setEmail...........end");
	}
	
	/**
	*This method will return the email of the person
	*
	*@return email
	*
	*/
	public String getEmail()
	{
		log.info("Contact class............getEmail...........start/end");
		return email;
	}
}