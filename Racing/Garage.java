class Garage
{
int space;
static int no = 0;

Car[] cars;

Garage(int space)
{
	this.space = space;
	this.cars = new Car[space];
}
public void printDetails()
{
	System.out.println("Space:" +this.space);
}
public void addCar(Car a)
{
	cars[no] = a;
	no++;
}
}
