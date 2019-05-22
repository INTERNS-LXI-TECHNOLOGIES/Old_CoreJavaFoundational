package com.lxisoft.collection;
import com.lxisoft.collection.*;
import java.util.*;  
class AgeComparator implements Comparator<Student>
{  
	public int compare(Student s1,Student s2)
	{  
		//Student s1=(Student)o1;  
		//Student s2=(Student)o2;  
  
		if(s1.age==s2.age)  
			return 0;  
		else if(s1.age>s2.age)  
			return 1;  
		else  
			return -1;  
	}  
}  