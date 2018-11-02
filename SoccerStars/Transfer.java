public class Transfer
{
private Club club;
private Player[] p;

public void setClub(Club club)
{
	this.club=club;
}
public Club getClub()
{
	return club;
}
public void checkPlayer()
{
	for(int i=0;i < p.length;i++)
	{
		if(p[i] != null)
		{
			switch(p[i].getPosition())
			{
				case "Forward":
				if(p[i].getRating()>=85)
				{
					club.addPlayer(p[i]);
				}
				break;
			
				case "Defender":
				if(p[i].getRating()>=85)
				{
					club.addPlayer(p[i]);
				}
				break;
				case "Midfielder":
				if(p[i].getRating()>=85)
				{
					club.addPlayer(p[i]);
				}
				break;
				case "GK":
				if(p[i].getRating()>=85)
				{
					club.addPlayer(p[i]);
				}
				break;
			}
		}
	}
	
}

public void setPlayerMarket(Player[] pp)
{
	this.p = pp;
}

	
}