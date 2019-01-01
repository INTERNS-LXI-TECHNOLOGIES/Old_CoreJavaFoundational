import java.util.Scanner;
public class Tdd
{
public static void main(String args[])
{
		int i,c;
		Scanner scan=new Scanner(System.in);
		
		
     
        System.out.println("how many class do you want to entry");
        c=scan.nextInt();
		
	Clas[] clases=new Clas[c];
		
        for(i=0;i<c;i++)
		{
			clases[i]=new Clas();
			
			clases[i].setClasDetails(i);
		 }			 
			 
}
}