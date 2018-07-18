public class TDD
{
	public static void main(String args[])
	{
	   Campus c=new Campus();
	   c.d1=new Department();
	   c.d2=new Department();
	    c.d1.b1=new Batch();
	    c.d2.b2=new Batch();
	    c.d1.b1.f=new Faculty();
	    c.d2.b2.f=new Faculty();
	    c.d1.b1.f.name="manoj";
	    c.d2.b2.f.name="appu";
	    c.d1.b1.s=new Student[20];
	    c.d1.b1.s[0]=new Student();
	    c.d1.b1.s[0].name="aysha";
	    
	     
	     
	    

	     c.print();
	   c.d1.show1();
	   c.d2.show2();
	 
	 c.d1.b1.f.say();
	 c.d2.b2.f.say();
    	 c.d1.b1.s[0].say1();
	 
	  
	
	   
	  
	}
	

}
         
		
	
