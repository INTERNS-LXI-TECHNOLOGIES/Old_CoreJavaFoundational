public class Tiger extends Animal implements Carnivores
{
		
	Tiger(int s, int h, int r ,int x, int y, char t){
			
		Fname = "TIGER";
		name = 'T';
		setStrength(s);
		setHunger(h);
		setRoaming(r);
		setLocation(x,y);
		setType(t);
		eatMeat()
		{
			return true;
		}
	}
}

