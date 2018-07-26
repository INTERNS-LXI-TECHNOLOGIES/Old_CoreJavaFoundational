import java.util.*;
import java.lang.*;
import java.io.*;

public class User{
	private static final String FILENAME="E:/workspace/quizGame/com/lxisoft/quizGame v1/QuestionDb/questions.txt";
	Question []q=new Question[20];
	public static Signup new_user=new Signup();
	public static LogIn pre_user=new LogIn();
	String []s=new String[20];
	String line;
	public int mark=0;
	public void userInterface()throws Exception
	{	
		Scanner opt=new Scanner(System.in);
		do{System.out.println("\t\t\t\t******************Welcome to PlayQuiz Game******************\n");
		System.out.println("\t\t\t\t|1.Log In|\t\t|2.Sign Up|\t\t|3.Exit|\n");
		System.out.print("->");final int MAIN_OPTION=opt.nextInt();
		switch(MAIN_OPTION)
		{
			case 1:
			System.out.println("\t\t\t\t******************LOG IN INTERFACE******************\n");
			pre_user.logEntry();
			break;
			case 2:
			System.out.println("\t\t\t\t******************SIGN UP INTERFACE******************\n");
			new_user.regNew();
			break;
			case 3:
			System.out.println("\t\t\t\t******************THANK YOU FOR USING OUR PROGRAMM******************\n");
			System.exit(0);
			break;
			
			
		}
		}
		while(true);
		
		
		
	}
	
	public void cls()
	{
		Cls clrscr=new Cls();
		try{
			clrscr.cls();
		}
		catch(IOException e)
		{
			
		}
		catch(InterruptedException e)
		{
			
		}
	}
	
	
	
	
	public void check()
	{
	try
	{
	int i=0,j=0;
	Scanner sc=new Scanner(System.in);
	FileReader fr=new FileReader(FILENAME);
	BufferedReader br=new BufferedReader(fr);
	while((line=br.readLine())!=null)
	{
	String s[]=line.split(";");
	q[j]=new Question(s);
	j++;
	}
		lx:	
		while(i<10)
		{
			System.out.println(q[i].question+"\n\n"+"1: "+q[i].opt1+"\n\n"+"2: "+q[i].opt2+"\n\n"+"3: "+q[i].opt3+"\n\n"+"4: "+q[i].opt4);
			System.out.println("Enter your correct option\n\n");
			int ch = sc.nextInt();
			switch(i){
				case 0: if(ch==1){
					    mark+=10;break;
				        }
						else if(ch==2){
						mark+=20;break;
						}
						else if(ch==3)
						{
					    mark+=5;break;
				        }
						else if(ch==4)
						{mark+=15;break;}
		                else{
							cls();
							System.out.println("\n\nPLEASE ENTER A CORRECT OPTION\n\n");
							continue lx;
							
						}
				case 1: if(ch==1){
					    mark+=10;break;
				        }
						else if(ch==2){
						mark+=15;break;
						}
						else if(ch==3){
					    mark+=20;break;
				        }
						else if(ch==4){
						mark+=5;break;
						}
						else
						{
							cls();
							System.out.println("\n\nPLEASE ENTER A CORRECT OPTION\n\n");
							continue lx;
						}
				case 2: if(ch==1){
					    mark+=5;break;
				        }
						else if(ch==2){
						mark+=10;break;
						}
						else if(ch==3){
					    mark+=20;break;
				        }
						else if(ch==4){
						mark+=15;break;
						}
						else 
						{
							cls();
							System.out.println("\n\nPLEASE ENTER A CORRECT OPTION\n\n");
							continue lx;
							
						}
				case 3: if(ch==1){
					    mark+=5;break;
				        }
						else if(ch==2){
						mark+=10;break;
						}
						else if(ch==3){
					    mark+=15;break;
				        }
						else if(ch==4){
						mark+=20;break;
						}
						else
						{
							break;
						}
				case 4: if(ch==1){
					    mark+=5;break;
				        }
						else if(ch==2){
						mark+=10;break;
						}
						else if(ch==3){
					    mark+=15;break;
				        }
						else if(ch==4){
						mark+=20;break;
						}
						else 
						{
							break ;
						}
				case 5: if(ch==1){
					    mark+=10;break;
				        }
						else if(ch==2){
						mark+=15;break;
						}
						else if(ch==3){
					    mark+=5;break;
				        }
						else if(ch==4){
						mark+=20;break;
						}
						else{
							break;
						}
				case 6: if(ch==1){
					    mark+=20;break;
				        }
						else if(ch==2){
						mark+=15;break;
						}
						else if(ch==3){
					    mark+=10;break;
				        }
						else if(ch==4){
						mark+=5;break;
						}
						else
						{
							break ;
						}
				case 7: if(ch==1){
					    mark+=5;break;
				        }
						else if(ch==2){
						mark+=15;break;
						}
						else if(ch==3){
					    mark+=20;break;
				        }
						else if(ch==4){
						mark+=10;break;
						}
					    else 
						{
							break;
						}
				case 8: if(ch==1){
					    mark+=15;break;
				        }
						else if(ch==2){
						mark+=20;break;
						}
						else if(ch==3){
					    mark+=5;break;
				        }
						else if(ch==4){
						mark+=10;break;
						}
						else 
						{
							break;
						}
				case 9: if(ch==1){
					    mark+=20;break;
				        }
						else if(ch==2){
						mark+=15;break;
						}
						else if(ch==3){
					    mark+=10;break;
				        }
						else if(ch==4){
						mark+=5;break;
						}
						else
						{
							break;
						}
                default : System.out.println("Error"); 				
			}
			i++;
			cls();
		}
}
catch(IOException e){
			System.out.println("Error");	
		}
	System.out.println("****************************************");	
	System.out.println("\n"+"\n"+"\n");
	System.out.println("YOUR SCORE IS         "+mark+" out of 200");
	if(mark>=100){
		System.out.println("YOU HAVE SUCCESSFULLY CLEARED THE TEST");
	}
	else
	{
		System.out.println("YOU HAVE FAILED......BETTER LUCK NEXT TIME");
	}
	System.out.println("\n"+"\n"+"\n");
	System.out.println("****************************************");	
}
	
	
	
	
	
	
}