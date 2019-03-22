public class Rabbit extends Animal implements Herbivores
{
public void setEat(String eat)
{
	this.eat=eat;
}	
public void setHungerLevel(int hungerLevel)
{
	this.hungerLevel=hungerLevel;
}
public String getEat()
{
	return this.eat;
}
public int getHungerLevel()
{
	return this.hungerLevel;
}
}