import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Sample
{
	public static void main(String args[])
	{
		try
		{
		    File file=new File("./quizzz/com/lxisoft/quiz/file/doc.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String st,username,password;
			Scanner input=new Scanner(System.in);
			System.out.println(">>>>>>>>>>>>>>>>>>>>LOGIN <<<<<<<<<<<<<<<<<<<<<<<");
			System.out.println("\nUsername:");
			username=input.nextLine();
			System.out.println("\nPassword:");
			password=input.nextLine();
			while((st = br.readLine())!=null)
			{
				String s[]=st.split(";");
				
				if((username.equals(s[0]))&&(password.equals(s[1])))
				{
					System.out.println("Login Successsfully");
				}
				/*
				{
					System.out.println("Try Again...\nMissmatch in Userneme or Password....");
				}*/					
			}
		}
		catch(IOException e)
		{
			System.out.println("Error");
		}
	}
}



try
		{
			File file=new File("./com/lxisoft/quiz/file/doc.txt");
			Scanner input=new Scanner(System.in);
			System.out.println(">>>>>>>>>>>>>>>>>>>>LOGIN <<<<<<<<<<<<<<<<<<<<<<<");
			System.out.println("\nUsername:");
			username=input.nextLine();
			System.out.println("\nPassword:");
			password=input.nextLine(); 
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String st;
			//String username1="",password1="";
			//char ch;
			int i=0;
			while((st=br.readLine())!=null)
			{
				
			   /* i=0;
				while((ch=line.charAt(i))!=';')
				{
					username1+=ch;
					i++;
				}
				i++;
				while((ch=line.charAt(i))!=';')
				{
					password1+=ch;
					i++;
				}*/
				String s[]=st.split(";");
				if((username.equals(s[0]))&&(password.equals(s[1])))
				{
					System.out.println("login successfully");
					Question.questionOption();
				}
				//username1="";password1="";			
			}
			
		}
		catch(IOException e)
		{
			System.out.println("IOException");
		}
		
	}
}
