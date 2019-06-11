package com.intern;
import java.util.*;
public interface Repository<T>
{
	public void create(T value);
	public Collection<T> readAll();
	public void update(int index,T element);
	public void update(T element,T element1);
	public void delete(T element);
	public void delete(int index);
	public void sort(String name);
	public void sort();
}