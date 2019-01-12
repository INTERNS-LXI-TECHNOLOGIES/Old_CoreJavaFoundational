public class Forest
{
    Animal an=new Animal();
	Animal a[]=new Animal[4];
	
public void Initialisation ()
	{
			Animal[0]=new Lion();
			Animal[1]=new Tiger();
			Animal[2]=new Panther();
			Animal[3]=new Elephant();
	}
	
public void Fight()
{
	Animal won=new Animal();
	won.setStrength(-1);
	int num=0;
	for(int i=0;i<4;i++)
	{
		if(a[i].getStrength()>won.getStrength())
		{
			won=a[i];
			num=i;
		}
	}
	
	System.out.println("The Winner is "+a[num]);
	
}
}



