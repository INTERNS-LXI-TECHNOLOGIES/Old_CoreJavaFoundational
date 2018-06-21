public class Zebra extends Animal implements Herbivores
{
		
	Zebra(int s, int h, int r ,int x, int y, char t){
			
		Fname = "ZEBRA";
		name = 'Z';
		setStrength(s);
		setHunger(h);
		setRoaming(r);
		setLocation(x,y);
		setType(t);
		eatGrass()
		{
			return true;
		}
	
	}

}