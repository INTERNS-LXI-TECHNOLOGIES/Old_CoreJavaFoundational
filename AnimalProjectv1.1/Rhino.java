/*
 * Class Rhino
 *
 * ->	Rhino(int pid)	[ Creates Rhino with id = pid ]
 *
 * ->	void printDetails()	[ Print Rhino details ]
 *
 */

public class Rhino extends AnimalHerbivore
{
	Rhino(int pid)
	{
		super(pid);
	}

	public void printDetails()
	{
		super.printDetails();
		System.out.println("Rhino\n");
	}
}
