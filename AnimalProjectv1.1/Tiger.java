/*
 * Class Tiger
 *
 * ->	Tiger(int pid)	[ Creates Tiger with id = pid ]
 *
 * ->	void printDetails()	[ Print Tiger details ]
 *
 */

public class Tiger extends AnimalCarnivore
{

	Tiger(int pid)
	{
		super(pid);
	}

	public void printDetails()
	{
		super.printDetails();
		System.out.println("Tiger\n");
	}

}
