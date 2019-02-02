 public class Forest{
Animal an=new Animal();
Animal lion=new Lion();
Animal fox=new Fox();
Animal rabbit=new Rabbit();
Animal elephant=new Elephant();
Animal deer=new Deer();
  

public Forest(){
	
}
public void Fight()
{
	
	if(fox.x>=rabbit.positionx || fox.y>=rabbit.positiony)
	{
		if(fox.strength>=rabbit.strength)
		{
			System.out.println("fox eats rabbit");
		}
		else
		{
			System.out.println("rabbit ran away");
		}
	}
	
	if(fox.x>=deer.positionx || fox.y>=deer.positiony)
	{
		if(fox.strength>=deer.strength)
		{
			System.out.println("fox eats deer");
		}
		else
		{
			System.out.println("deer ran away");
		}
	}
	
	if(lion.x>=fox.positionx || lion.y>=fox.positiony)
	{
		if(lion.strength>=fox.strength)
		{
			System.out.println("lion eats fox");
		}
		else
		{
			System.out.println("fox ran away");
		}
	}
	
	if(lion.x>=deer.positionx || lion.y>=deer. positiony)
	{
		if(lion.strength>=deer.strength)
		{
			System.out.println("lion eats deer");
		}
		else
		{
			System.out.println("deer ran away");
		}
	}
	if(lion.x>=rabbit.positionx || lion.y>=rabbit.positiony)
	{
		if(lion.strength>=rabbit.strength)
		{
			System.out.println("lion eats rabbit");
		}
		else
		{
			System.out.println("rabbit ran away");
		}
	}
	if(lion.x>=elephant.positionx || lion.y>=elephant.positiony)
	{
		if(lion.strength>=elephant.strength)
		{
			System.out.println("lion eats elephant");
		}
		else
		{
			System.out.println("elephant wins");
		}
	}
	
}
}
  