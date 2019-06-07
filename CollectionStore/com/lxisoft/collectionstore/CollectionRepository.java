package com.lxisoft.collectionstore;
import java.util.*;

interface CollectionRepository<T>
{
	
	public void create(T user);
	public Collection<T> read();
	public void update(int id, T user);
	public void update(T user, T user1);
	//public void delete(T user);
	//public void sort(String value);
	
}

