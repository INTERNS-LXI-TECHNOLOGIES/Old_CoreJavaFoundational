class Car
{
	String company;

	int bhp;

public void car(String company , int bhp)
{
	this.company = company;
	this.bhp = bhp;

}
public void printDetails()
{
	System.out.println("company:"+this.company);
	System.out.println("power:"+this.bhp);
}
}
