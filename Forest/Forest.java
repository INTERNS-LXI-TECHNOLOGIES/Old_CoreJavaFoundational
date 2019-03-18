class Forest
{
void fighters()
{
	Animal animal=new Animal();
	
	Tiger tiger=new Tiger();
	tiger.name="Tiger";
	tiger.animalStrength=121;
	Rabbit rabbit=new Rabbit();
	rabbit.name="Rabbit";
	rabbit.animalStrength=500;
	Bear bear=new Bear();
	bear.name="Bear";
	bear.animalStrength=0;
	Lion lion=new Lion();
	lion.name="Lion";
	lion.animalStrength=90;
	animal.fight(tiger,rabbit,bear,lion);
}
}
