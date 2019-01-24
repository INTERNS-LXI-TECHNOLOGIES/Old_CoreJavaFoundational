package com.lxisoft.metrov3.train;
import java.util.Scanner;
import java.util.ArrayList;
import com.lxisoft.metrov3.train.Class;
public class Train{
	private int noOfClasses;
	private String name;
	private String time;
	Scanner scan = new Scanner(System.in);
	private ArrayList<Class> classes;
	public void setNoOfClasses(int noOfClasses){
		this.noOfClasses = noOfClasses;
	}
	public int getNoOfClasses(){
		return noOfClasses;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setTime(String time){
		this.time = time;
	}
	public String getTime(){
		return time;
	}
	public void setClasses(ArrayList<Class> classes){
		this.classes = classes;
	}
	public ArrayList<Class> getclasses(){
		return classes;
	}
public void setTrainDetails(){
	System.out.println("Enter Train Name And Time ");
	setName(scan.nextLine());
	setTime(scan.nextLine());
	System.out.println("how Many Classes Available");
	setNoOfClasses(scan.nextInt());
	setClasses(new ArrayList<Class>());
	for(int j=0;j<getNoOfClasses();j++){
		getclasses().add(new Class());
		getclasses().get(j).setClassDetails();
	}
}
}