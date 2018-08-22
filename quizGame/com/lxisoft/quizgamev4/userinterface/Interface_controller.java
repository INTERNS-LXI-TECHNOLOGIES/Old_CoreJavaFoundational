package com.lxisoft.quizgamev2.userinterface;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Interface_controller{
	private static final String FILENAME="E:/workspace/quizGame/com/lxisoft/quizgamev2/QuestionDb/questions.txt";
	private Interface_model datas=new Interface_model();
	private Interface_view viewer=new Interface_view();
	public Question_controller []q=new Question_controller[10];
	
	public int mark;
	///////////////////////////////////////////////////clear function//////////////////////////////////////////////////////
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
	
	
	///////////////////////////////////////////////////play checker function//////////////////////////////////////////////////////
	
	
	public void check()
	{
	try
	{
	int i=0,j=0;
	datas.setFilename("E:/workspace/quizGame/com/lxisoft/quizgamev2/QuestionDb/questions.txt");
	Scanner sc=new Scanner(System.in);
	FileReader fr=new FileReader(datas.getFilename());
	BufferedReader br=new BufferedReader(fr);
	String line;
	while((line=br.readLine())!=null)
	{
	datas.setWord(line.split(";"));
	q[j]=new Question_controller(datas.getWord());
	j++;
	}
	lx:	
		while(i<10)
		{
			System.out.println(q[i].que+"\n\n"+"1: "+q[i].op1+"\n\n"+"2: "+q[i].op2+"\n\n"+"3: "+q[i].op3+"\n\n"+"4: "+q[i].op4);
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
catch(IOException e)
		{
			System.out.println("Error");	
		}
	datas.setMark(mark);
	viewer.printer(datas.getMark());

	}
	
}
	
	
	