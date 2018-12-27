import java.util.Scanner;
public class Student
{
	Scanner scan=new Scanner(System.in);
	
	String sub;
	float mark,num,k;
int i;

	public void enterSubjectAndMark()
		{
			System.out.println("how many subjects should be enterd in to the mark");
			num=scan.nextInt();
			k=num*100;
			
			float sum=0;
				for(i=1;i<=num;i++)
					
					{
						 System.out.println("enter the "+i+" subject");
						 sub=scan.next();
						 System.out.println("enter the "+i+" mark");
						 mark=scan.nextFloat();
						 sum=mark+sum;
					}
					
				 System.out.println("sum of the mark="+sum);
				 percentage(k,sum);
		}
			      
	

	public void percentage(float k,float sum)
	{
	   System.out.println("sum="+sum);
	   System.out.println("k="+k);
	        
		float  perc =(float)(((sum/k)+0.0)*100);
		System.out.println("percentage="+perc);
			
	}
		

}