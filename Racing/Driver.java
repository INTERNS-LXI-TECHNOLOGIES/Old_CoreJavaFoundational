class Driver
{
  String name;
  int num;


Driver(String name,int num)
{
	this.name = name;
	this.num = num;
}
public void printDetails()
{
	System.out.println("Name:" + this.name);
	System.out.println("Number:" + this.num);
}
}
