package com.lxisoft.metrov2.coach;
import com.lxisoft.metrov2.train.Train;
public class Coach
{
	private String sleeperCoach;
	private String acCoach;
	private String generalCoach;

	public void setSleeperCoach(String sleeperCoach)
	{
		this.sleeperCoach=sleeperCoach;
	}

	public void setAcCoach(String acCoach)
	{
		this.acCoach=acCoach;
	}

	public void setGeneralCoach(String generalCoach)
	{
		this.generalCoach=generalCoach;
	}

	public String getSleeperCoach()
	{
		return sleeperCoach;
	}

	public String getAcCoach()
	{
		return acCoach;
	}

	public String getGeneralCoach()
	{
		return generalCoach;
	}
}