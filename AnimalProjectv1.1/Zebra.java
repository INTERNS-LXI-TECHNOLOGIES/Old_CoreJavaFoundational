/*
 * Class Zebra
 *
 * ->	Zebra(int pid)	[ Creates Zebra with id = pid ]
 *
 * ->	void printDetails()	[ Print Zebra details ]
 *
 */

public class Zebra extends AnimalHerbivore
{
	Zebra(int pid)
	{
		super(pid);
	}

	public void printDetails()
	{
		super.printDetails();
		System.out.println("Zebra\n");
	}
}
