public class TDD
{
	public static void main(String[] args)
	{
		Transfermarket t = new Transfermarket();
		
		
		t.createPlayer("Ronaldo","Por","f",92);
		t.createPlayer("Neymar","Brazil","FWD",91);
		t.createPlayer("Martial","France","FWD",88);
		t.createPlayer("Hazard","Belgium","FWD",90);
		t.createPlayer("Van dijk","Holland","DEF",89);
		t.createPlayer("Pogba","France","MID",91);
		t.createPlayer("Kepa","Spain","GK",89);
		t.createPlayer("Ozil","Germany","MID",90);
		
		t.printPlayerDetails();
		
		t.createClub("Juventus","Ancelotti");
		t.createClub("Liverpool","Mane");
		t.createClub("PSG","Icardi");
		t.createClub("Chelsea","Rakitic");
		
		t.printClubDetails();
		
		t.bidDetails();
		
	}
}