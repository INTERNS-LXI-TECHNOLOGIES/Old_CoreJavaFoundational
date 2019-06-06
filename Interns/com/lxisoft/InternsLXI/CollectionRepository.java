package com.lxisoft.InternsLXI;
interface CollectionRepository<T>{

public void create(T data);
public void read();
public void update();
public void delete();
public void sort();

}