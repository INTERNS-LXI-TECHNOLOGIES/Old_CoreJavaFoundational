public class Forest
{

	Animal an=new Animal();
	Lion l[]=new Lion[4];
	Tiger t[]=new Tiger[4];
	
	Rabbit r[]=new Rabbit[4];
	Deer d[]=new Deer[4];
	
	
public void Initialisation ()
	{
		for(int i=0;i<4;i++)
		{
			l[i]=new Lion();
			t[i]=new Tiger();
		}
	}
public void Init()
{
    Animal an=new Lion();
	l[2].Bark();
}
	
public void Fight()
{
	if(l[1].Strength==t[1].Strength)
	{
		System.out.println(" % There will be no fight,remain with peacefully % ");
	}
	else if(l[2].Strength<t[2].Strength)
	{
		System.out.println("Lion Wins");
	}
	else if(l[1].Strength>t[1].Strength)
	{
		System.out.println("Tiger Wins");
	}
	
}
	
}

