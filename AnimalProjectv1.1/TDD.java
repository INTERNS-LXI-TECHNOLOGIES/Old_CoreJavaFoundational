/*
 * Class TDD [ Main class ]
 *
 */

public class TDD
{
	public static void main(String[] args)
	{
		ErrHandler.ErrorState = true;

		AnimalGame game = new AnimalGame(10,10,10);
		game.createAnimals(5,5);
		game.printDetails();
		game.startGame();
	}
}
