/*
 * Class Lion
 *
 * ->	Lion(int pid)	[ Creates Lion with id = pid ]
 *
 * ->	void printDetails()	[ Print Lion details ]
 *
 */

public class Lion extends AnimalCarnivore
{
	Lion(int pid)
	{
		super(pid);
	}

	public void printDetails()
	{
		super.printDetails();
		System.out.println("Lion\n");
	}
}
