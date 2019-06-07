package com.lxisoft.hotel;
import com.lxisoft.hotel.Customer;
import java.util.ArrayList;
public class Cashier
{
	private Bill bill=new Bill();
    public void setBill(Bill bill)
			{
				this.bill=bill;
			}
	public Bill getBill()
			{
				return bill;
			}
     
  public void callingBill(ArrayList<Food> orderedFood)
   {
				bill.printBill(orderedFood);
   }
}