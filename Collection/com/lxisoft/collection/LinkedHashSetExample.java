package com.lxisoft.collection;
import java.util.*; 
public class LinkedHashSetExample 
{  
public static void main(String[] args) 
{  
    LinkedHashSet<Book> hs=new LinkedHashSet<Book>();  

    //Creating Books  
    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
    Book b4=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
    Book b5=new Book(103,"Operating System","Galvin","Wiley",6);  
    //Adding Books to hash table  
    hs.add(b1);  
    hs.add(b2);  
    hs.add(b3);  
    hs.add(b4);
    hs.add(b5);
    
    //Traversing hash table  
    for(Book b:hs){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
}  