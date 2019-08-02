package com.lxisoft.repo;
import com.lxisoft.model.*;
public interface ContactRepository
{

public void create(Contact c);
public void view();
public void edit(int f,String cont,String data);
public void delete(String n);
public void search(String x);

}