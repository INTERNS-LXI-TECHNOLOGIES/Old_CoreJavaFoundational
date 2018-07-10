package com.lxisoft.university.university;
import com.lxisoft.university.college.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.util.*;

public class University{
	int i=0,len=0;
	private static final String FILENAME="D:/workspace/Universityv1.0/Files/university.txt";
	String CollegeName,CollegeAddress,line;
	char st;
	College[] college=new College[20];
	ArrayList<College> list=new ArrayList<College>();
	public void selected(int choice){
		BufferedReader br = null;
		FileReader fr=null;
		BufferedWriter bw=null;
		FileWriter fw=null;
		Scanner sc = new Scanner(System.in);
		try{
		switch(choice){
			case 1: System.out.println("*****COLLEGE REGISTRATION*****");
			         System.out.println("ENTER THE NAME OF THE COLLEGE");
					 CollegeName=sc.nextLine();
					 System.out.println("ENTER THE ADDRESS OF THE COLLEGE");
					 CollegeAddress=sc.nextLine();
					 college[i]=new College(CollegeName,CollegeAddress);
					 list.add(college[i]);
					 fw = new FileWriter(FILENAME,true);
					 bw = new BufferedWriter(fw);
					 bw.write(CollegeName);
					 bw.write("|");
					 bw.write(CollegeAddress);
					 bw.write("/");
					 System.out.println("\n");
					 i++;
					break;
			case 2: 
			        break;
			case 6:  System.out.println("DETAILS OF THE COLLGES REGISTERED\n");
			         fr=new FileReader(FILENAME);
			         br=new BufferedReader(fr);
			         while((line=br.readLine())!=null){
						 len=line.length();
						 for(int i=0;i<len;i++){
							 if(((st=line.charAt(i))!='|')&&((st=line.charAt(i))!='/')){
							 System.out.print(st);}
							else{
							System.out.println(" ");}
							if((st=line.charAt(i))=='/')
								 System.out.println("\n");
							}
							 
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