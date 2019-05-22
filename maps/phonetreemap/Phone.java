import java.util.*;
public class Phone{

	String brand;
	String model;
	int price;

public Phone(String brand,String model,int price){

	this.brand=brand;
	this.model=model;
	this.price=price;

}
public String toString(){

	return brand+" "+model+" "+price;
}
}