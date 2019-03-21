public class Forest
{
public void fighters()
{
	Animal animal=new Animal();
	
	Animal tiger=new Tiger();
	tiger.name="Tiger";
	tiger.animalStrength=70;
	Animal rabbit=new Rabbit();
	rabbit.name="Rabbit";
	rabbit.animalStrength=80;
	Animal bear=new Bear();
	bear.name="Bear";
	bear.animalStrength=90;
	Animal lion=new Lion();
	lion.name="Lion";
	lion.animalStrength=40;
	animal.fight(tiger,rabbit,bear,lion);
}
}
