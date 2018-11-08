public class TDD
{
public static void main(String[] args)
	{
		Playerpool p = new Playerpool();
		
		p.createPlayer("Ronaldo","Portugal","FWD",92);
		p.createPlayer("Neymar","Brazil","FWD",91);
		p.createPlayer("Mbappe","France","FWD",90);
		p.createPlayer("Martial","France","FWD",88);
		p.createPlayer("Hazard","Belgium","FWD",90);
		p.createPlayer("Pogba","France","MID",91);
		p.createPlayer("Ozil","Germany","MID",90);
		p.createPlayer("Keita","Guinia","MID",89);
		p.createPlayer("Van dijk","Holland","DEF",89);
		p.createPlayer("Willian","Brazil","DEF",88);
		p.createPlayer("Kepa","Spain","GK",89);
		
		p.printPlayerDetails();
		
		p.createClub("Juventus","Zidane");
		p.createClub("Chelsea","Rakitic");
		p.createClub("PSG","Icardi");
		p.createClub("Liverpool","Mane");
		
		p.printClubDetails();
		
		p.bidDetails();
	}
	
}