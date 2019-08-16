//package com.lxisoft.intern.files.Data;

public class Data
{   
	private String name;
	private String number;
  private String id;
  private String address;
  private String pincode;
  ArrayList <Contact> contactslist = new ArrayList <Contact>();
	

   public void setName(String n)
   {
    this.name = n;
   } 
   public String getName()
   {
     return this.name;
   }  
   public void setNumber(String no)
   {
    this.number = no;
   }
   public String getNumber()
   {
     return this.number;
   }
     public void setId(String id)
   {
    this.id = id;
   }
   public String getId()
   {
     return this.id;
   }
      public void setAddress(String ad)
   {
    this.address = ad;
   }
   public String getAddress()
   {
     return this.address;
   }
      public void setPincode(String pin)
   {
    this.pincode = pincode;
   }
   public String getPincode()
   {
     return this.pincode;
   }
    public void display()
     {
        System.out.println("address: "+contactslist);
     }
   
   


}