import java.util.*;
public class Worker
{
	public static void main(String[] args) {
		int i,j,count=0;
		int [][] a=new int [25][25];
		
		Random rand =new Random();
		for (i=0;i<=20;i++)
	{
		for (j=0;j<=20;j++){
			a[i][j]=0;
		}
	}

while(count<10){
  
		int x=rand.nextInt(20);
		int y=rand.nextInt(20);
		if(a[x][y]!=0)
		{
         count++;
         a[x][y]=rand.nextInt(20);
		}
		else
		{

		}
	}
	
	
		for (i=0;i<=30;i++)
	{
		for (j=0;j<=20;j++){
			System.out.print(a[i][j]);
		}
			System.out.println();
	}
	}
	}	
