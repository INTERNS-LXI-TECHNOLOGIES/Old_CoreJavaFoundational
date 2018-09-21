package com.lxisoft.varsha.forest.animals;

class RabbitVar extends AnimalVar implements HerbivorousVar
{

	int energyLevel=(int)(Math.random()*50)+50;
	setEnergyLevel(energyLevel);
	setAnimalName("Rabbit");
	
}