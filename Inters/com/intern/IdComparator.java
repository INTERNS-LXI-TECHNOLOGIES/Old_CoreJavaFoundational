package com.intern;
import java.util.*;
public class IdComparator implements Comparator
{
    public int compare(Object o1, Object o2) 
    {
        Intern in1=(Intern)o1;
        Intern in2=(Intern)o2;

       if(in1.getId()==in2.getId())
        return 0;
        else if(in1.getId()>in2.getId())
            return 1;
        else
            return -1;
    }
}