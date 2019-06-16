package com.lxisoft.InternsLXI;
public interface CollectionRepository<T>{

public void create(T data);
public void read();
public void update(T data,T data1);
public void delete(T data);
public void sort();
}
