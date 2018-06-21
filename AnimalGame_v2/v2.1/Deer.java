public class Deer extends Animal implements Herbivores
{
		
	Deer(int s, int h, int r ,int x, int y, char t){
		
		Fname = "DEER";
		name = 'R';
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
