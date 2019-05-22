import java.util.*;
public class Phone{

	public String brand;
	public String model;
	public int price;

public Phone(String model,String brand,int price){

	this.brand=brand;
	this.model=model;
	this.price=price;

}
public boolean equals(Object p) {

    return (this.brand).equals(((Phone)p).brand);
}
public int hashCode(){

	return brand.hashCode();
}
   
public String toString()
{
    return brand + ", " +model+", " +price;
}

}