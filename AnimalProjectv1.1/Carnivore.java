/*
 * Interface Carnivore
 *
 * ->	int huntPrey(Forest pf)
 *
 * ->	int fight(Forest pf)
 *
 * ->	void printDetails()
 *
 * Class AnimalCarnivore
 *
 * 	->	AnimalCarnivore(int pid)	[Creates a Carnivore with id pid]
 *
 * 	->	int huntPrey(Forest pf)		[ Fights the closest prey ( Herbivore) in Forest pf]
 *
 * 	->	int fight(Forest pf)	[ Fights with Carnivore in Forest pf ] | Returns 1 on success and 0 on failure
 *
 */

public interface Carnivore
{
	public int huntPrey(Forest pf);
	public int fight(Forest pf);
	public void printDetails();
}
