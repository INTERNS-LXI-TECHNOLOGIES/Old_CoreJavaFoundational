package com.lxisoft.deepthi.model;
import java.util.List;
//package com.yourname.modulename ;


// @TODO Add proper java doc comments

public class ProductDee implements PartDee 
{

  //private string name = null ;
  private String description;

  private boolean display=true;

  private int id;

  private double maximumStockLevel=10;

  private String name;

  private double reOrderLevel=5;

  private String reference;

  private String searchKey;
  
  private double price;

  //private List<ProductDee> parts = new ArrayList<ProductDee>();
   public ProductDee(int id,String name,String description,double price)
   {
	   this.name=name;
	   this.id=id;
	   this.price=price;
	   this.description=description;
	   reference=description+" "+name+" "+id;
	   searchKey=description+" "+name+" "+id;
	   
   }

  
  public String getName()
  {
    return name;
  }
  
  public int getId()
  {
	  return id;
  }
  
  public String getDescription()
  {
	  return description;
  }
  
  public double getPrice()
  {
	  return price;
  }
  
  public boolean isProductAvailableinStock()
  {
    return display;
  }
  public String toString()
  {
    return name;
  }

}