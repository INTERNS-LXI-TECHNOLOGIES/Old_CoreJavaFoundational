package com.lxisoft.contact;
import com.lxisoft.contact.view.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)throws Exception
	{
		ContactView contactV=new ContactView();
		contactV.contactAppOperations(contactV);
	}
}
