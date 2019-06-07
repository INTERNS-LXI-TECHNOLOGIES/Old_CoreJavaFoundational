package com.lxisoft.collection;
import java.util.ArrayList;
import java.util.Collection;
import com.lxisoft.collection.*;
public interface CollectionRepository<T>
{
	public void create(T a);
	public Collection<T> read();
	public void update(T a,T a1);
	public void delete(T a);
}