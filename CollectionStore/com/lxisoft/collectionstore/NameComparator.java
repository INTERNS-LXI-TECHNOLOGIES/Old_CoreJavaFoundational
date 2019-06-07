package com.lxisoft.collectionstore;
import java.util.*;
class NameComparator implements Comparator
{
    public int compare(Object o1, Object o2) 
    {
    	User user1=(User)o1;
    	User user2=(User)o2;

    	return user1.getName().compareTo(user2.getName());
      
    }
}