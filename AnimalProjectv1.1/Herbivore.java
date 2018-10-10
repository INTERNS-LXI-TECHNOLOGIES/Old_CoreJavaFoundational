/*
 * Interface Herbivore
 *
 * 	-> int closestHerd(Forest f)
 *
 * Class AHerbivore
 *
 * 	-> AnimalHerbivore(int pid)	 [ Creates an AHerbivore with id pid]
 *
 * 	-> int closestHerd(Forest pf)  [ Finds the closest Animal of same type in forest pf]	| Returns 1 on success and 0 on failure
 *
 */

public interface Herbivore
{
	public int closestHerd(Forest pf);
}
