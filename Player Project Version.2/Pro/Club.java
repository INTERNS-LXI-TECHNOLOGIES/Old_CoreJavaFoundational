public class Club
{
	private String club_name;
	private String man_name;
	
	
	public void setClubName(String club_name)
	{
		this.club_name=club_name;
	}
	public void setManagerName(String man_name)
	{
		this.man_name=man_name;
	}
	public String getClubName()
	{
		return club_name;
	}
	public String getManagerName()
	{
		return man_name;
	}
	public void printClubDetails()
	{
		System.out.println("CLUB:"+this.club_name);
		System.out.println("MANAGER:"+this.man_name);
		
	}
	
}