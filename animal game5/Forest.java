public class Forest{
Animal an=new Animal();
Animal a[]=new Animal[5];
int i,j;
public void Initialisation()
{
	a[0]=new Lion();
	a[1]=new Fox();
	a[2]=new Elephant();
	a[3]=new Tiger();
	a[4]=new Panther();
}
public void Fight()
{
	for(i=0;i<5;i++)
	{
		for(j=0;j<5;j++)
		{
			if(a[i].getIsAlive()==true)
			{	
				if(a[i].getStrength()>a[j].getStrength())
				{
					if(a[i] instanceof Carnivorous&&a[j] instanceof Carnivorous)
					{
						System.out.println("No fight because of same category");
					}
					else
					{
						a[i].Sound();
						a[i].Eat();
						a[j].setIsAlive(false);
					}
				}
			}	
		}
	}
	
}
}