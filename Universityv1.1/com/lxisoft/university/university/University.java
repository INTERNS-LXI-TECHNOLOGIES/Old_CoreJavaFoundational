package com.lxisoft.university.university;
import com.lxisoft.university.college.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.util.*;

public class University{
	int i=0,len=0,count=0,j=0,len1=0,c1=0;
	private static final String FILENAME1="D:/workspace/Universityv1.0/Files/university.txt";
	private static final String FILENAME2="D:/workspace/Universityv1.0/Files/password.txt";
	String CollegeName="",CollegeAddress="",line,line1,CollegeName1,CollegeAddress1,Password,UserName;
	char st,st1,s;
	College c;
	ArrayList<College> list=new ArrayList<College>();
	public void selected(int choice){
		BufferedReader br = null;
		FileReader fr=null;
		BufferedWriter bw=null;
		FileWriter fw=null;
		Scanner sc = new Scanner(System.in);
		try{
		switch(choice){
			case 1:  System.out.println("*****COLLEGE REGISTRATION*****");
			         System.out.println("ENTER THE NAME OF THE COLLEGE");
					 CollegeName1=sc.nextLine();
					 System.out.println("ENTER THE ADDRESS OF THE COLLEGE");
					 CollegeAddress1=sc.nextLine();
					 System.out.println("ENTER THE USERNAME");
					 UserName=sc.nextInt();
					 System.out.printlN("ENTER THE PASSWORD");
					 Password=sc.nextInt();
					 fw1 = new FileWriter(FILENAME1,true);
					 fw2 = new FileWriter(FILENAME2,true);
					 bw2 = new BufferedWriter(fw2);
					 bw1 = new BufferedWriter(fw1);
					 bw1.write(CollegeName1);
					 bw1.write("|");
					 bw1.write(CollegeAddress1);
					 bw1.newLine();
					 bw1.close();
					 fr=new FileReader(FILENAME);
			         br=new BufferedReader(fr);
					 System.out.println("\n");
					 while((line1=br.readLine())!=null){
						 
						 len1=line1.length();
						 do{
							 while((st1=line1.charAt(c1))!='|'){
							 CollegeName+=st1;
							 c1++;
							 }
							 c1++;
							 while(c1<len1){
								 st1=line1.charAt(c1);
								 CollegeAddress+=st1;
								 c1++;
							 }
							c=new College(CollegeName,CollegeAddress);
							list.add(c);
							j++;
							CollegeName="";
							CollegeAddress="";
							c1=0;
						 }while(false);
					}
					break;
			case 2: System.out.println(list.get(0));
			        break;
			case 6:  System.out.println("DETAILS OF THE COLLGES REGISTERED\n");
			         fr=new FileReader(FILENAME);
			         br=new BufferedReader(fr);
			         while((line=br.readLine())!=null){
						 len=line.length();
						 for(int i=0;i<len;i++){
							 if((st=line.charAt(i))!='|'){
							 System.out.print(st);}
							else{
							System.out.println("");}
							}
						System.out.println("\n");
						} 
			        System.exit(0);
			        break;
			default : System.out.println("YOU Entered a wrong choice");
			        break; 
		}}catch(IOException e){
			System.out.println("Error");
			
		}finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
	}
}