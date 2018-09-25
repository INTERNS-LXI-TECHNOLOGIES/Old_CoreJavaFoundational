public class AnimalGame
{
	AnimalGame()
	{
		Forest forest = new Forest(80,98);
		forest.spawnAnimals();
		forest.initGame();
		forest.startGame();
	}
}