package com.lxisoft.university.college;
import com.lxisoft.university.university.*;
import java.io.*;
import java.util.*;

public class College extends University{
	String CollegeName,CollegeAddress;
	public College(String CollegeName,String CollegeAddress){
		this.CollegeName=CollegeName;
		this.CollegeAddress=CollegeAddress;
	}
	public String getCollegeName(){
		return CollegeName;
	}
	public String getCollegeAddress(){
		return CollegeAddress;
	}
	public String toString(){
		return this.getCollegeName()+"\n"+this.getCollegeAddress();
	}
}