import java.util.Scanner;
public class Student
{
	String name,subject;
	int clas,registerNumber;
	float mark;
Scanner scan=new Scanner(System.in);
   	
int i;
	public void setStudentDetails(int i)
	{
		i++;
		System.out.println ("enter the name of the "+i+" student");
			name=scan.next();
		System.out.println("enter the register numberof the "+i+" student");
			registerNumber=scan.nextInt();
		System.out.println("enter the class of the "+i+" student");
			clas=scan.nextInt();
	}
	
	
	public void setSubAndMark(int sub,int i)
    {
		float total=sub*100;
		float sum=0;
		for(i=0;i<sub;i++)
		 {
		System.out.println("enter the subject of the student");
		    subject=scan.next();
        System.out.println("enter the mark of the student");
             mark=scan.nextFloat();
           sum=mark+sum;
		 }
		 System.out.println ("tottal="+total);
        System.out.println("sum="+sum);
       percentage(total,sum);
	   
	}
	
	public void percentage(float total,float sum)
	{
        //float perc=(float)(((sum/total)+0.0)*100);
		float perc=sum/total*100;
	    
		System.out.println("percentage of the mark="+perc);
	}
	
	public void printStudentDetails()
	{
		float perc;
		int j=1;
		System.out.println("DETAILS OF THE "+j+" STUDENT");
		j++;
		System.out.println("************************");
		System.out.println("Name          registerNumber      s clas       subject               mark          ");
	System.out.println(    ""+name+     "" +registerNumber+ ""+clas+ ""+subject+ ""+mark       );
		
	}
}