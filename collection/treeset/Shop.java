import java.util.*;
import java.io.*;
public class Shop

{
	private TreeSet <Phone>phon=new TreeSet<Phone>();
	private String stock;
	private String order;

	public void setStock(Phone created,String brandName,String modelName,int price )
	{

		created.setBrandName(brandName);
		created.setModelName(modelName);
			created.setPrice(price);
			phon.add(created);
		for(Phone p:phon)
		{
		System.out.println(created.getBrandName()+" "+created.getModelName()+" "+created.getPrice());		
		}
	    
	   
    }

	public void setDetails()
	{
		this.setStock(new Phone(), "nokia", "7200", 1200);
		this.setStock(new Phone(), "Samsung", "s10+", 11900);
		this.setStock(new Phone(), "Redmi", "Not7", 10000);
		this.setStock(new Phone(), "Redmi", "Not7", 10000);
	}
	public void setOrder()
	{
		

	} 


}
	/*class phone implements Comparator
	{
		public int compare(Phone p1,Phone p2)
		{

		}
	}*/
			