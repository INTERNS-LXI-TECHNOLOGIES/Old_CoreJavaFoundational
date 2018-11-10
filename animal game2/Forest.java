 public class Forest{
Animal an=new Animal();
Animal lion=new Lion();
Animal fox=new Fox();
Animal rabbit=new Rabbit();
Animal elephant=new Elephant();
Animal deer=new Deer();

public void Fight()
{
	if(fox.strength>=deer.strength)
	{
		System.out.println("fox eats deer");
	}
	if(fox.strength>=rabbit.strength)
	{
		System.out.println("fox eats rabbit");
	}

	if(lion.strength==elephant.strength)
	{
		System.out.println("there will be no fight");
	}
	if(lion.strength>=fox.strength)
	{
		System.out.println("lion eats fox");
	}
	if(lion.strength==deer.strength)
	{
		System.out.println("lion eats deer");
	}
	if(lion.strength==rabbit.strength)
	{
		System.out.println("lion eats rabbit");
	}

	if(lion.strength<elephant.strength)
	{
		System.out.println("elephant wins");
	}
	if(lion.strength>elephant.strength)
	{
		System.out.println("lion eats elephant");
	}
}
}
