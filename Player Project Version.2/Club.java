public class Club
{
private String club_name;
private String manager_name;

public void setManagerName(String manager_name)
{
	this.manager_name=manager_name;
}
public void setClubName(String club_name)
{
	this.club_name=club_name;
}
public String getManagerName()
{
	return manager_name;
}
public String getClubName()
{
	return club_name;
}
public void printClubDetails()
{
	System.out.println("Club:"+this.club_name);
	System.out.println("Manager:"+this.manager_name);
}



}