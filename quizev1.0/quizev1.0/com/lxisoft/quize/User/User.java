package com.lxisoft.quize.User;
import com.lxisoft.quize.Quize.*;
import com.lxisoft.quize.clear.*;
import java.io.*;
import java.util.*;
import java.io.IOException;

public class User{
	private static final String FILENAME2 = "./quizev1.0/Files/questions.txt";
	private static final String FILENAME1 = "./quizev1.0/Files/credentials.txt";
	FileWriter fw = null;
    BufferedWriter bw = null;
	Questions[] q = new Questions[20];
	String[] s=new String[20];
	int ch,count,mark=0,len,i=0;
	String line1;
	public void check(){
		try{
		Scanner sc = new Scanner(System.in);
		FileReader fr1 = new FileReader(FILENAME2);
		BufferedReader br1 = new BufferedReader(fr1);
			   // System.out.println("////");
				while((line1=br1.readLine())!=null){
				String s[] = line1.split(";");
				//System.out.println(s[0]);
				q[i] = new Questions(s);
				i++;
			}
			int i=0;

		lx:	
		while(i<10){
			System.out.println(q[i].que+"\n\n"+"1: "+q[i].option1+"\n\n"+"2: "+q[i].option2+"\n\n"+"3: "+q[i].option3+"\n\n"+"4: "+q[i].option4);
			System.out.println("Enter your correct option\n\n");
			ch = sc.nextInt();
			switch(i){
				case 0: if(ch==1){
					    mark+=10;break;
				        }
						else if(ch==2){
						mark+=20;break;
						}
						else if(ch==3){
					    mark+=5;break;
				        }
						else if(ch==4){
						mark+=15;break;
						}
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
}catch(IOException e){
			System.out.println("Error");	
		}
	System.out.println("****************************************");	
	System.out.println("\n"+"\n"+"\n");
	System.out.println("YOUR SCORE IS         "+mark+" out of 200");
	if(mark>=5){
		System.out.println("YOU HAVE SUCCESSFULLY CLEARED THE TEST");
	}else
	{
		System.out.println("YOU HAVE FAILED......BETTER LUCK NEXT TIME");
	}
	System.out.println("\n"+"\n"+"\n");
	System.out.println("****************************************");	
}
public void signup(String username,String password){
	try{
	fw = new FileWriter(FILENAME1,true);
    bw = new BufferedWriter(fw);
	bw.write(username);
	bw.write("|");
	bw.write(password);
	bw.newLine();
	}catch(IOException e){
			System.out.println("Error");	
		}finally{
			try{
				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();
			
			}catch(IOException e){
				e.printStackTrace();
		}
		}
}

public void cls()
	{
		Cls clrscr=new Cls();
		try
		{
			clrscr.cls();
		}
		catch (IOException e)
		{
			
		}
		catch (InterruptedException e)
		{
			
		}
	}
}