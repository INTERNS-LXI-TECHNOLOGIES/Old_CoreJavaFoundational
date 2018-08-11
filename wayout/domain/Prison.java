package com.lxisoft.wayout.domain;
import java.util.logging.Logger;
//import java.util.logging.Level;
/**
*Setting and getting of  variables prisoner and hall in class Prison.
*@author Aparna.
*@author Manoj.
*/

public class Prison
{ 
	Logger log= Logger.getLogger(Prison.class.getName());
	
/**
*Declaration of variables prisoner of type Prisoner and hall of type Hall.
*/
    private Prisoner prisoner;
	private Hall hall;
/**
*Setting prisoner.
*@param prisoner (Passing parameter prisoner).
*/
    public void setPrisoner(Prisoner prisoner)
    {
		log.info("Entered into class Prison"+log.getName());
    this.prisoner=prisoner;
	}
/**
*Getting prisoner.
*@return prisoner (Returning the value prisoner).
*/
	
	public Prisoner getPrisoner()
	{

		return this.prisoner;
	}
/**
*Setting hall.
*@param hall (Passing parameter hall).
*/
	public void setHall(Hall hall)
	{
	this.hall=hall;
	}
/**
*Getting hall.
*@return hall (Returning the value hall).
*/
	public Hall getHall()
	{

	return this.hall;
	}

}
