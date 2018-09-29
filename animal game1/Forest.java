 public class Forest{
/*Animal an=new Animal();
Animal lion1=new Lion();
Animal fox1=new Fox();
Animal lion2=new Lion();
Animal fox2=new Fox();*/
Animal an=new Animal();
Lion l[]=new Lion[4];
public void Initialisation(){

for(int i=0;i<4;i++)
{
	l[i]=new Lion();
}}
/*public void Fight()
{
	 if(lion1.strength==fox.strength)
	 {
		 System.out.println("there will be no fight");
	 }
	 else if(lion.strength<fox.strength)
	 {
		 System.out.println("fox wins");
	 }
	 else if(lion.strength>fox.strength)
	 {
		 System.out.println("lion wins");
	 }
}*/

public void Fight()
{
	Lion won=new Lion();
	won.setStrength(-1);
	int num=0;
	for(int i=0;i<4;i++)
	{
		if(l[i].getStrength()>won.getStrength())
		{
			won=l[i];
			num=i;
		}
	}
	System.out.println("the won animal is won"+num);
}
}