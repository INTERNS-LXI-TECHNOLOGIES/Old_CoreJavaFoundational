import java.util.*;
import java.io.*;
public class Credential_Controller
{	Credential_Model model=new Credential_Model();
	Properties p;
	public void personalData(String key,String value)throws Exception
	{	
		p=new Properties();
		p.setProperty(key.toUpperCase(),value);
		p.store(new FileWriter("personalData/"+model.getFname()+"details.properties"),"Inserted Data");
	}
	public void personalData(String fname)throws Exception
	{	model.setFname(fname);
		p=new Properties();		
		p.store(new FileWriter("personalData/"+fname+"details.properties"),"File created");
	}

	
	

	
	
	
	
	
	
	
}