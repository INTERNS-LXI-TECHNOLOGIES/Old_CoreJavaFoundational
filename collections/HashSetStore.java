package com.lxisoft.collections;
import java.util.*;
import java.io.*;
public class HashSetStore<T> implements CollectionRepository<T>
{
	Set<T> hashSet = new HashSet<>();
	public void create(T data)
	{
		hashSet.add(data);
	}
	public Collection<T> read()
	{
		return hashSet;
	}	
	public void update(T data,T data1)
	{
	}
	public void delete(T data)
	{
	}
	public void sort()
	{
	}
}