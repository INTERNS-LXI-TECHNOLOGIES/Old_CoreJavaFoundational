public class Lion extends Animal implements Carnivores
{
		
	Lion(int s, int h, int r ,int x, int y, char t){
			
		Fname = "LION";
		name = 'L';
		setStrength(s);
		setHunger(h);
		setRoaming(r);
		setLocation(x,y);
		setType(t);
		public boolean eatMeat()
		{
			return true;
		}
	}
}

