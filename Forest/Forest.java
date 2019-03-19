public class Forest
{
public void fighters()
{
	Animal animal=new Animal();
	
	Tiger tiger=new Tiger();
	tiger.name="Tiger";
	tiger.animalStrength=70;
	Rabbit rabbit=new Rabbit();
	rabbit.name="Rabbit";
	rabbit.animalStrength=80;
	Bear bear=new Bear();
	bear.name="Bear";
	bear.animalStrength=90;
	Lion lion=new Lion();
	lion.name="Lion";
	lion.animalStrength=40;
	animal.fight(tiger,rabbit,bear,lion);
}
}
