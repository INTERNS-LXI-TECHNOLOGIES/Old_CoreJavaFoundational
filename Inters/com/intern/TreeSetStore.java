package com.intern;
import java.util.*;
public class TreeSetStore<T> implements Repository<T>

{
    private Class<T> type;
    private String name="id";
    Set<T>treeSet=new TreeSet<T>();
    public TreeSetStore(Class<T>type)
    {
        this.type=type;
        if( type==Double.class||type==Integer.class||type==Character.class||type==Short.class||
            type==Float.class)
        {
           treeSet=new TreeSet<T>(); 
        }
        
         System.out.println(treeSet);
    }
    public Class<T>getMyType()
    {
        return this.type;
    }
        public void create(T value)
        {
           treeSet.add(value);
           System.out.println(value); 
        }

   public Collection<T>readAll()
   {
    return treeSet;
   }
    public Collection<T> read()
    {
        return treeSet;
    }
    public void update(T element,T element1)
    {
       if(treeSet.contains(element))
       {
        treeSet.remove(element);
        treeSet.add(element1);
       }
        System.out.println(treeSet);

    }
    public void update(int index,T element)
    {

    }
    public void delete(int index)
    {
        try
        {
            treeSet.remove(index);
        }
        catch(Exception e)
        {

        }
    }

    public void delete(T element)
    {
        treeSet.remove(element);
        System.out.println(treeSet);
    }

    public void sort()
    {

    }
    public void sort(String name)
    {
        if(name!=null)
        {
            this.name=name;
        }
        Set<T>treeSet=this.treeSet;
       
        this.treeSet.addAll(treeSet);
    }
}