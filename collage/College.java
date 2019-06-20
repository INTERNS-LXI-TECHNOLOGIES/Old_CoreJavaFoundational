public class College
{
	String name;
	String address;
	Department d = new Department();
    public College(String name,String address)
    {
        this.name = name;
        this.address = address;
    }
    public College(){
        
    }

    public void displayDetails()
    {
    	System.out.println("COLLAGE:"+name+"\n"+"ADDRESS:"+address);
    	//d.displayDetails();
        d.readDptmnt();
    	//t.readTeacher();
    	//s.readStudent();
    	//t.readTeacher();
    }
    
}