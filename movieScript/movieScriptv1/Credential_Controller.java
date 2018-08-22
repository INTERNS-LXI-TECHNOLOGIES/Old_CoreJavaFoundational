import java.util.*;
import java.io.*;
public class Credential_Controller
{
	Properties p;
	public void actorData(String actor)throws Exception
	{	p=new Properties();
		p.setProperty("Actor",actor);
		p.store(new FileWriter("Actor/"+actor+".properties"),"Inserted Data");
	}
	public void actressData(String actress)throws Exception
	{	p=new Properties();
		p.setProperty("Actress",actress);
		p.store(new FileWriter("Actress/"+actress+".properties"),"Inserted Data");
		
	}
	

	
	
	
	
	
	
	
}