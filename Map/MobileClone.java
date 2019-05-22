import java.util.*;
public class MobileClone implements Cloneable
{
	String brand,model;
	public MobileClone(String brand,String model)
	{
		this.brand=brand;
		this.model=model;
	}
	public static void main(String[] args) 
	{
		try
		{

			MobileClone mobile1=new MobileClone("Htc","Desire");
			MobileClone mobile2=(MobileClone)mobile1.clone();

			System.out.println(mobile1.brand+","+mobile1.model);
			System.out.println(mobile2.brand+","+mobile2.model); 	
		}
		catch( CloneNotSupportedException e)
		{}
	}

}