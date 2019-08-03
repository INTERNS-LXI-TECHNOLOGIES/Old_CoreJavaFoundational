import java.io.*;
import java.util.*;
public class Address
{
	String address;
	String pincode;
	static BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
    static Scanner in = new Scanner(System.in);

	public void readAddress()
	{   try{
		Contact c = new Contact();
		System.out.println("Enter the House Name:");
        this.address = input.readLine();
        c.setAddress(address);
        System.out.println("Enter the Pin Code :");
        this.pincode = input.readLine();
        c.setPincode(pincode);}catch(IOException e){}
	}
}