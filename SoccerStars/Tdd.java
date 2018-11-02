public class Tdd
{
	public static void main(String args[])
	{
		Player[] p = new Player[50];

		p[0] = new Player();
		
		p[0].setName("Ronaldo");
		p[0].setAge(33);
		p[0].setPosition("Forward");
		p[0].setNation("Portugal");
		p[0].setRating(90);
		p[0].printDetails();
		
		
		p[1] = new Player();
		
		p[1].setName("Giroud");
		p[1].setAge(30);
		p[1].setPosition("Forward");
		p[1].setNation("France");
		p[1].setRating(79);
		p[1].printDetails();
		
		p[2] = new Player();
		
		p[2].setName("Neymar");
		p[2].setAge(24);
		p[2].setPosition("Forward");
		p[2].setNation("Brazil");
		p[2].setRating(89);
		p[2].printDetails();
		
		p[3] = new Player();
		
		p[3].setName("James Rodrigues");
		p[3].setAge(24);
		p[3].setPosition("Midfielder");
		p[3].setNation("Columbia");
		p[3].setRating(88);
		p[3].printDetails();
		
		p[4] = new Player();
		
		p[4].setName("Sergio Ramos");
		p[4].setAge(30);
		p[4].setPosition("Defender");
		p[4].setNation("Spain");
		p[4].setRating(89);
		p[4].printDetails();
		
		p[5] = new Player();
		
		p[5].setName("De Gea");
		p[5].setAge(26);
		p[5].setPosition("GK");
		p[5].setNation("Spain");
		p[5].setRating(88);
		p[5].printDetails();
		
		p[6] = new Player();
		
		p[6].setName("Marcelo");
		p[6].setAge(28);
		p[6].setPosition("Defender");
		p[6].setNation("Brazil");
		p[6].setRating(88);
		p[6].printDetails();
		
		p[7] = new Player();
		
		p[7].setName("Joao Cancelo");
		p[7].setAge(25);
		p[7].setPosition("Defender");
		p[7].setNation("Portugal");
		p[7].setRating(86);
		p[7].printDetails();
		
		p[8] = new Player();
		
		p[8].setName("Bonucci");
		p[8].setAge(30);
		p[8].setPosition("Defender");
		p[8].setNation("Italy");
		p[8].setRating(86);
		p[8].printDetails();
		
		p[9] = new Player();
		
		p[9].setName("Ozil");
		p[9].setAge(28);
		p[9].setPosition("Midfielder");
		p[9].setNation("Germany");
		p[9].setRating(87);
		p[9].printDetails();
		
		p[10] = new Player();
		
		p[10].setName("Mbappe");
		p[10].setAge(20);
		p[10].setPosition("Forward");
		p[10].setNation("France");
		p[10].setRating(87);
		p[10].printDetails();
		
		p[11] = new Player();
		
		p[11].setName("Pogba");
		p[11].setAge(27);
		p[11].setPosition("Midfielder");
		p[11].setNation("France");
		p[11].setRating(87);
		p[11].printDetails();
		
		p[12] = new Player();
		
		p[12].setName("Neto");
		p[12].setAge(26);
		p[12].setPosition("GK");
		p[12].setNation("Spain");
		p[12].setRating(82);
		p[12].printDetails();
		
		p[13] = new Player();
		
		p[13].setName("Aube");
		p[13].setAge(24);
		p[13].setPosition("Forward");
		p[13].setNation("Bosnia");
		p[13].setRating(84);
		p[13].printDetails();
		
		p[14] = new Player();
		
		p[14].setName("Alaba");
		p[14].setAge(27);
		p[14].setPosition("Defender");
		p[14].setNation("Algeria");
		p[14].setRating(85);
		p[14].printDetails();
		
		p[15] = new Player();
		
		p[15].setName("Koulibaly");
		p[15].setAge(29);
		p[15].setPosition("Defender");
		p[15].setNation("Senegal");
		p[15].setRating(84);
		p[15].printDetails();
		
		p[16] = new Player();
		
		p[16].setName("Keita");
		p[16].setAge(27);
		p[16].setPosition("Midfielder");
		p[16].setNation("Ivory Coast");
		p[16].setRating(85);
		p[16].printDetails();
		
		p[17] = new Player();
		
		p[17].setName("Nainggolan");
		p[17].setAge(30);
		p[17].setPosition("Midfielder");
		p[17].setNation("Belgium");
		p[17].setRating(84);
		p[17].printDetails();
		
		p[18] = new Player();
		
		p[18].setName("Douglas Costa");
		p[18].setAge(27);
		p[18].setPosition("Forward");
		p[18].setNation("Brazil");
		p[18].setRating(82);
		p[18].printDetails();
		
		p[19] = new Player();
		
		p[19].setName("Kylie Walker");
		p[19].setAge(27);
		p[19].setPosition("Defender");
		p[19].setNation("England");
		p[19].setRating(82);
		p[19].printDetails();
		
		p[20] = new Player();
		
		p[20].setName("Marquinos");
		p[20].setAge(27);
		p[20].setPosition("Defender");
		p[20].setNation("Brazil");
		p[20].setRating(84);
		p[20].printDetails();
		
	
		
		Club c =new Club();
		c.setName("Soccer Stars");
		c.setCountry("France");
		
		Transfer t = new Transfer();
		t.setClub(c);
		t.setPlayerMarket(p);
		t.checkPlayer();
		c.clubPlayers();
	}
	
}