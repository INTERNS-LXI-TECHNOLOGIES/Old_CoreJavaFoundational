public class TDD
{
	public static void main(String[] args)
	{
		Match m = new Match();
		Club[] c = new Club[10];
		
		c[0]=new Club();
		c[0].setName("KBL");
		c[0].setManager("James");
		c[0].printDetails();
		
		c[1]=new Club();
		c[1].setName("NEU");
		c[1].setManager("John");
		c[1].printDetails();
		
		c[2]=new Club();
		c[2].setName("MFC");
		c[2].setManager("Ranbir");
		c[2].printDetails();
		
		c[3]=new Club();
		c[3].setName("CFC");
		c[3].setManager("Augesto");
		c[3].printDetails();
		
		c[4]=new Club();
		c[4].setName("BFC");
		c[4].setManager("Chetri");
		c[4].printDetails();
		
		c[5]=new Club();
		c[5].setName("JFC");
		c[5].setManager("Ramos");
		c[5].printDetails();
		
		/*c[6]=new Club();
		c[6].setName("PFC");
		c[6].setManager("hjgg");
		c[6].printDetails();
		
		c[7]=new Club();
		c[7].setName("DD");
		c[7].setManager("hjgg");
		c[7].printDetails();
		
		c[8]=new Club();
		c[8].setName("FCG");
		c[8].setManager("hjgg");
		c[8].printDetails();*/
		
		c[9]=new Club();
		c[9].setName("ATK");
		c[9].setManager("Kopel");
		c[9].printDetails();
		
		
		m.setClub(c);
		m.gamePlays();
		m.matchTable();
		m.winner();
	}
}