// package com.lxisoft.InternsLXI;
// import java.util.*;
// import java.io.*;

// public class ArrayListStore<T> implements CollectionRepository<T>{

// ArrayList<Intern> interns = new ArrayList<Intern>();
// Scanner scan = new Scanner(System.in);
// String name;
// String qualification;
// int age;
// String newName;

		
// 		InputStreamReader r=new InputStreamReader(System.in);    
//     	BufferedReader br=new BufferedReader(r);

// 	public void display(){

// 		Scanner in = new Scanner(System.in);	
// 		System.out.println("1.create,2.read,3.add,4.update,5.delete,6.sort,7.exit");
// 		System.out.println("Enter your choice:");
// 		int a=in.nextInt();
// 		if(a==1){
// 			create();
// 		}
// 		if(a==2){
// 			read();
// 		}
// 		if(a==3){
// 			add();
// 		}
// 		if(a==4){
// 			update();
// 		}
// 		if(a==5){
// 			delete();
// 		}
// 		if(a==6){
// 			sort();
// 		}
// 		if(a==7){
// 			exit();
// 		}
// 	}
// 	public void create(){
		
// // 		// Intern in1 = new Intern("abu","q",12);
// // 		// Intern in2 = new Intern("ayan","e",14);
// // 		// interns.add(in1);
// // 		// interns.add(in2);
// // 		// interns.add(new Intern("abu","q",12));
// // 		// interns.add(new Intern("ayan","e",14));
// 		int num;
		  
// 	    System.out.println(" ");
//         System.out.print("Enter the total number of interns :");
// 		num=scan.nextInt();
// 		for(int j=0;j<num;j++)
// 		{
// 		System.out.print("Enter the name of intern : ");
// 		name=scan.next();
// 		// System.out.println("Enter the qualification of intern :");
// 		// qualification=scan.next();
// 		// System.out.println("Enter the age of intern :");
// 		// age=scan.nextInt();
// 		Intern inj = new Intern(name);
// 		//Intern inj = new Intern(name,qualification,age);
// 		interns.add(inj);
// 		System.out.println(interns);
// 		}
// 		display();
// 	}
// 	public void add(){
// 		try{
// 		System.out.println("Enter the name of new intern:");
// 		name=br.readLine();
// 		// System.out.println("Enter the qualification of the intern:");
// 		// qualification=scan.next();
// 		// System.out.println("Enter the age:");
// 		// age=scan.nextInt();
// 		Intern in3 = new Intern(name);
// 		//Intern in3 = new Intern(name,qualification,age);
// 		interns.add(in3);
// 		System.out.println(interns);
// 		display();
// 	}
// 	catch(FileNotFoundException e){

// 	}
// 	catch(IOException e){

// 	}
// 	}
// 	public void read(){
// 		Iterator<Intern> itr=interns.iterator();
// 		while(itr.hasNext()){
// 			System.out.println(itr.next());	
// 		}
// 		display();
// 	}
// 	public void update(){
// 		try{
// 		System.out.println("Enter the name of the intern to replace:");
// 		String name1=br.readLine();
// 		System.out.println("Enter the new name of the intern:");
// 		newName=br.readLine();
// 		// System.out.println("Enter the new qualification of the intern:");
// 		// String newQualification=scan.nextLine();
// 		// System.out.println("Enter the new age of the intern:");
// 		// int newAge=scan.nextInt();
// 		for(int i=0;i<interns.size();i++){
// 			if((interns.get(i).name).equals(name1)){
// 				System.out.println((interns.get(i).name).equals(name1));
// 				interns.get(i).name=newName;
// 				System.out.println(interns);
// 				// interns.set(qualification,newQualification);
// 				// interns.set(age,newAge);
// 			}
// 		}
// 		display();
// 	}
// 	catch(FileNotFoundException e){

// 	}
// 	catch(IOException e){

// 	}
// 	} 
// 	public void delete(){
// 		try{
// 		System.out.println("Enter the name of the INTERN you want to remove:");
// 		String name2=br.readLine();
// 		for(int i=0;i<interns.size();i++){
// 			if((interns.get(i).name).equals(name2)){
// 				interns.remove(i);
// 			}
// 		}
// 		System.out.println("Remaining interns:"+interns);
// 		display();
// 		}
// 		catch(FileNotFoundException e){

// 		}
// 		catch(IOException e){

// 		}
// 	}
// 	public void sort(){
// 		Collections.sort(interns);
// 		System.out.println("sorted list:"+interns);
// 		display();
// 	}
// 	public void exit(){
// 		System.out.println("thank you............");
// 	}
// }