package com.lxisoft.inheritance.student;
import java.util.*;
import com.lxisoft.inheritance.student.Csestudent;
import com.lxisoft.inheritance.student.Mechstudent;
import com.lxisoft.inheritance.student.Faculity;
public class Department
{
	int depSelection;
	
	int studCount;
	Student[] s;
	int facCount;
	Faculity[] f;
	public void selectionMode()
		{
		 //modeselect;
		Scanner into=new Scanner(System.in);
		System.out.println("ENTER THE MODE"+"\n 1>>>FACUILITY"+"\n 2>>>STUDENT");
		int modeselect=into.nextInt();
			switch(modeselect)
			{
				case 1:
				{
					
					facuilityMode();
					
				}
				break;
				case 2:
				{
				studentMode();
				
				}
				break;
				default: System.out.println("ENTER CORRECT MODE!!!");
						
			}
	}
			            public void studentMode()
						{
							//Student[] s;
							Scanner init=new Scanner(System.in);
							System.out.println("ENTER THE NUMBER OF STUDENTS");
							studCount=init.nextInt();
							studentEntry();
						}

							public void studentEntry()
								{	
									Scanner init=new Scanner(System.in);
									//System.out.println("ENTER THE NUMBER OF STUDENTS");
									//studCount=init.nextInt();
									 s= new Student[studCount];
									System.out.println("|----------------------------------------------------------------|");
									System.out.println("|---------------WELCOME TO STUDENT REGISTER PORTEL---------------|");
									System.out.println("|----------------------------------------------------------------|");
									input();
								}
							public void input()
								{   
									Scanner infix=new Scanner(System.in);
									System.out.println("CHOOSE THE OPTION"+"\n1>>>>COMPUTERSCIENCE<<<<"+"\n2>>>>MECHANICAL<<<<"+"\n3>>>>INSERT MORE<<<<");
									//System.out.println("Test123");
									depSelection=infix.nextInt();
										switch(depSelection)
										{
											case 1:
												for(int i=0;i<studCount;i++)
												{
													String csnameInput;
													int[] mark=new int[10];
													Scanner in=new Scanner(System.in);
													Scanner inpu=new Scanner (System.in);
													int csadmnInput;
													System.out.println("STUDENT NUMBER::"+(i+1));
													System.out.println("PLEASE ENTER THE NAME::");
													csnameInput=in.nextLine();
													s[i] = new Csestudent();
													s[i].setName(csnameInput);
													System.out.println("ENTER THE ADMISSION NUMBER::");
				  									csadmnInput=in.nextInt();
													s[i].setAdmn(csadmnInput);
													System.out.println("Enter the Mark of Slot A");
													mark[1]=inpu.nextInt();
													s[i].setMarkA(mark[1]);
													System.out.println("Enter the Mark of Slot B");
													mark[2]=inpu.nextInt();
													s[i].setMarkB(mark[2]);
													System.out.println("Enter the Mark of Slot C");
													mark[3]=inpu.nextInt();
													s[i].setMarkC(mark[3]);
													System.out.println("Enter the Mark of Slot D ");
													mark[4]=inpu.nextInt();
													s[i].setMarkD(mark[4]);
													System.out.println("Enter the Mark of Slot E");
													mark[5]=inpu.nextInt();
													s[i].setMarkE(mark[5]);
													System.out.println("Enter the Mark of Slot F ");
													mark[6]=inpu.nextInt();
													s[i].setMarkF(mark[6]);
												}
											break;
											case 2:
												for(int i=0;i<studCount;i++)
												{
													String menameInput;
													int[] mark=new int[10];
													Scanner in=new Scanner(System.in);
													Scanner inpu=new Scanner (System.in);
													int meadmnInput;
													System.out.println("STUDENT NUMBER"+(i+1));
													System.out.println("PLEASE ENTER THE NAME::");
													menameInput=in.nextLine();
													s[i] = new Mechstudent();
													s[i].setName(menameInput);
													System.out.println("ENTER THE ADMISSION NUMBER::");
													meadmnInput=in.nextInt();
													s[i].setAdmn(meadmnInput);
													System.out.println("Enter the Mark of Slot A");
													mark[1]=inpu.nextInt();
													s[i].setMarkA(mark[1]);
													System.out.println("Enter the Mark of Slot B");
													mark[2]=inpu.nextInt();
													s[i].setMarkB(mark[2]);
													System.out.println("Enter the Mark of Slot C");
													mark[3]=inpu.nextInt();
													s[i].setMarkC(mark[3]);
													System.out.println("Enter the Mark of Slot D ");
													mark[4]=inpu.nextInt();
													s[i].setMarkD(mark[4]);
													System.out.println("Enter the Mark of Slot E");
													mark[5]=inpu.nextInt();
													s[i].setMarkE(mark[5]);
													System.out.println("Enter the Mark of Slot F ");
													mark[6]=inpu.nextInt();
													s[i].setMarkF(mark[6]);													
												}
											break;
											case 3:
												
													System.out.println("SELECT THE OPTION AGAIN");
													input();
												
										break;
										default: System.out.println("!!!!!INVALID SELECTION!!!!!");
				                        }
									System.out.println("=====================THANK YOU=====================");
									output();
								}
							public void output()
								{   
									Scanner init=new Scanner(System.in);
									System.out.println("PLEASE SELECT THE BRANCH TO BE PRINTED"+"\n 1::::::COMPUTERSCIENCE::::::"+"\n 2::::::MECHANICAL::::::"+"\n3::::::PRINT MORE::::::");
									int printSelection=init.nextInt();
									for(int i=0;i<studCount;i++)
										{
											if(s[i] instanceof Csestudent && printSelection==1)
												{
													((Csestudent)s[i]).cseprint();
												}
											else if(s[i] instanceof Mechstudent && printSelection==2)
												{
												((Mechstudent)s[i]).mechprint();
												}
											else if (printSelection==3)
												{
												output();
												}
							
										
										}
	
			                    }
						
						public void facuilityMode()
						{
							
							
							//Faculity[] f;
							faculityEntry();
						}
							public void faculityEntry()
								{	
									Scanner init=new Scanner(System.in);
									System.out.println("ENTER THE NUMBER OF FACUILTY");
				
									facCount=init.nextInt();
									 f= new Faculity [facCount];
									System.out.println("|----------------------------------------------------------------|");
									System.out.println("|---------------WELCOME FACUILITY REGISTER PORTEL----------------|");
									System.out.println("|----------------------------------------------------------------|");
									facinput();
								}
								public void facinput()
								{
											 
									for(int i=0;i<facCount;i++)
									{
									String facnameInput;
									Scanner in=new Scanner(System.in);
									int facnoInput;
									int facwages;
									System.out.println("PLEASE ENTER THE NAME OF THE FACUILITY::");
									facnameInput=in.nextLine();
									f[i] = new Faculity();
									f[i].setName(facnameInput);
									System.out.println("ENTER THE NO OF HOURS::");
				  					facnoInput=in.nextInt();
									f[i].setNoofHours(facnoInput);
									System.out.println("ENTER THE PER HOUR WAGES::");
				  					facwages=in.nextInt();
									f[i].setwages(facwages);
									System.out.println("-----------------FAcuility details----------------");
									f[i].printfac();
									
									}
									
									
								}
							
							
						}
			
	
