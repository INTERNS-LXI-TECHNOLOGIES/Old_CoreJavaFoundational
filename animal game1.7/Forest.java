import java.util.ArrayList;
public class Forest{
//private Animal an=new Animal();
//Animal a[]=new Animal[5];
private ArrayList<Animal> al=new ArrayList<Animal>();
int i,j;
public void Initialisation()
{
	al.add(new Lion());
	al.add(new Fox());
	al.add(new Elephant());
	al.add(new Panther());
	al.add(new Tiger());
}

public ArrayList<Animal> getAl(){
	return al;
}
public void setAl(ArrayList<Animal> a){
	this.al=a;
}
public void Fight()
{
	for(i=0;i<5;i++)
	{
		for(j=0;j<5;j++)
		{
			if(al.get(i).getIsAlive()==true)
			{	
				if(al.get(i).getStrength()>al.get(j).getStrength())
				{
					if(al.get(i) instanceof Carnivorous&&al.get(j) instanceof Carnivorous)
					{
						System.out.println("No fight because of same category");
					}
					else
					{
						al.get(i).sound();
						al.get(i).eat();
						al.get(j).setIsAlive(false);
					}
				}
			}	
		}
	}
	
}
}