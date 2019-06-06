package com.lxisoft.collections;

import java.util.*;
public interface CollectionRepository<T>
{
public	void create(T data);
public	Collection<T> read();
public	void update(T data,T data1);
public	void delete(T data);
public	void sort();
}

