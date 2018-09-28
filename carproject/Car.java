public class Car
{
	int serialNo;
	
	String comp;
	String brand;
	String model;
	String colour;

	Tyre t1,t2,t3,t4;
	Door d1,d2,d3,d4;
	
	Stearing s;
	
	String mfd;		// manufacturing date
	

	
	Car(int s , String comp , String brand , String model , String colour)
	{
		this.serialNo = s;
		this.comp = comp;
		this.brand = brand;
		this.model = model;
		this.colour = colour;
		
	}

	public void fixDoor(Door fl , Door fr , Door bl , Door br)
	{
		this.d1 = fl;
		this.d2 = fr;
		this.d3 = bl;
		this.d4 = br;
		
	}


	public void fixTyre(Tyre t1 , Tyre t2 , Tyre t3 , Tyre t4)
	{
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.t4 = t4;

	}

	public void fixStearing(Stearing s)
	{
		this.s = s;
	}
	
	public void printDetails()
	{
		System.out.println("\n-------------Car Details---------------\n");
	
		System.out.println(" Serial No " + this.serialNo);
		System.out.println(" Company : " + this.comp);
		System.out.println(" Brand : " + this.brand);
		System.out.println(" Model : " + this.model);
		System.out.println(" Color : " + this.colour);
		
		System.out.println("\n+++++++++Tyre Details++++++++\n");
		
		t1.printDetails();
		t2.printDetails();
		t3.printDetails();
		t4.printDetails();
		
		System.out.println("\n++++++++++Door Details++++++++\n");
		
		d1.printDetails();
		d2.printDetails();
		d3.printDetails();
		d4.printDetails();
		
		System.out.println("\n++++++++++Stearing Details++++++++\n");
		
		s.printDetails();
		
		System.out.println("\n----------------------------------------");
	
	}
}
