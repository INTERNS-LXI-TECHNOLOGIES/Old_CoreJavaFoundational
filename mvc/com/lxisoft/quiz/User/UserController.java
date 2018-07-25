package com.lxisoft.quiz.User;

import com.lxisoft.quiz.Quiz.*;
import com.lxisoft.quiz.clear.*;
import java.io.*;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.*;
import java.io.IOException;

public class UserController{
	public void user(){
	UserModel um = new UserModel("D:/workspace/mvc/Files/questions.txt");
	UserView uv = new UserView();
	String FILENAME = um.getFilename();
	QuestionsController[] q = new QuestionsController[20];
	String[] s=new String[20];
	int ch,count,mark=0,len,i=0;
	String line1;
		try{
		Scanner sc = new Scanner(System.in);
		FileReader fr1 = new FileReader(FILENAME);
		BufferedReader br1 = new BufferedReader(fr1);
				while((line1=br1.readLine())!=null){
				s = line1.split(";");
				q[i] = new QuestionsController(s);
				i++;
			}
			i=0;

		lx:	
		while(i<10){
			uv.display(q[i]);
			uv.instruct();
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
							uv.caution();
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
							uv.caution();
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
							uv.caution();
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
							cls();
							uv.caution();
							continue lx;
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
							cls();
							uv.caution();
							continue lx;
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
							cls();
							uv.caution();
							continue lx;
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
							cls();
							uv.caution();
							continue lx;
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
							cls();
							uv.caution();
							continue lx;
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
							cls();
							uv.caution();
							continue lx;
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
							cls();
							uv.caution();
							continue lx;
						}
                default : uv.error(); 				
			}
			i++;
			cls();
		}
}catch(IOException e){
			uv.error();
		}
	uv.upperGraph(mark);
	if(mark>=5){
		uv.success();
	}else
	{
		uv.unsuccess();
	}
	uv.lowerGraph();
}
public void signup(String username,String password){
	String FILENAME1 = "D:/workspace/mvc/Files/credentials.txt";
	FileWriter fw = null;
    BufferedWriter bw = null;
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