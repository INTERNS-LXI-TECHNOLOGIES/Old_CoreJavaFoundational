public class Animal
{
	private String animalCategory,animalName;
	private int hungerLevel,energyLevel;

	public void setAnimalName(String animalName)
	{
		this.animalName=animalName;
	} 

	public String getAnimalName()
	{
		return animalName;
	}

	public void setAnimalCategory(String animalCategory)
	{
		this.animalCategory=animalCategory;
	}

	public String getAnimalCategory()
	{
		return animalCategory;
	}

	public void setHungerLevel(int hungerLevel)
	{
		this.hungerLevel=hungerLevel;
	}

	public int getHungerLevel()
	{
		return hungerLevel;
	}

	public void setEnergyLevel(int energyLevel)
	{
		this.energyLevel=energyLevel;
	}

	public int getEnergyLevel()
	{
		return energyLevel;
	}
}