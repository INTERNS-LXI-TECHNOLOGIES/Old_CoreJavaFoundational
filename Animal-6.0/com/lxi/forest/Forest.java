package com.lxi.forest;

import com.lxi.*;
import com.lxi.animals.*;
import com.lxi.types.*;

import java.util.*;
import java.lang.*;
public class Forest extends Hunter
{
	ArrayList <Animal> animals= new ArrayList <Animal> ();
	 
	public void Inside()
	{
   String [][] area=new String[30][30];
  int kk=1;
	   System.out.println("-------------------Welcome to Forest!----------------------");
	   Random rand=new Random();	
       for(int i=1;i<=rand.nextInt(10);i++)
          {
        	Animal tiger =new Tiger();
            tiger.name="Tiger "+i;
            tiger.strength=rand.nextInt(100);
            animals.add(tiger);
          } 
       for(int i=1;i<=rand.nextInt(10);i++)
          {
       	  Animal lion =new Lion();
          lion.name="Lion "+i;
          lion.strength=rand.nextInt(100);
          animals.add(lion);
          }   
      for(int i=1;i<=rand.nextInt(10);i++)
         {
        	Animal deer =new Deer();
           deer.name="Deer "+i;
          deer.strength=rand.nextInt(100); 
     animals.add(deer);
       } 

        for(int i=1;i<=rand.nextInt(10);i++)
       {
       	Animal zebra =new Zebra();
     zebra.name="Zebra "+i;
     zebra.strength=rand.nextInt(100);
     animals.add(zebra);
       } 

      

    
for(int i=0;i<animals.size();i++){
 System.out.println("Name:"+animals.get(i).name+"\tStrength:"+animals.get(i).strength);}
 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

int sizer=9;
int count =0;


  


      while((count<=10))
{
  for(int p=0;p<=sizer;p++)
{
  for(int q=0;q<=sizer;q++)
  {
       area[p][q]="\t" ;
  }
}
     int i=0;
     while(i<animals.size())
      {
       int x=rand.nextInt(sizer);
       animals.get(i).locationX=x;
       int y= rand.nextInt(sizer);
       animals.get(i).locationY=y;
        if(area[x][y]=="\t")
           {
           area[x][y]=animals.get(i).name;
           i++ ;
           }

      }
      
       System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
       for(int p=0;p<=sizer;p++)
      {
          for(int q=0;q<=sizer;q++)
             {
              System.out.print(area[p][q]);
             }
           System.out.println();
       }
       System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
      for(int p=0;p<animals.size();p++)
       {
        int x1=animals.get(p).locationX;
        int y1=animals.get(p).locationY;
        for(int q=p+1;q<animals.size();q++)
             {
             int x2=animals.get(q).locationX;
             int y2=animals.get(q).locationY;
             int r1=x1-x2;
             int r2=y1-y2;
             if(((Math.abs(r1)<=1)&&(Math.abs(r2)<=1)))
                {
                  System.out.print("\n"+animals.get(p).name+"("+animals.get(p).strength+") Vs "+animals.get(q).name+"("+animals.get(q).strength+")");
                  //System.out.print("\nNearers:"+animals.get(p).name+":"+animals.get(q).name);
                  String k=(animals.get(p)).fight(animals.get(q));

                  String b="null";
                if (k.equals(b)) {}
                else{
                     for(int d=0;d<animals.size();d++)
                       {
                         if((animals.get(d).name).equals(k))
                           {System.out.print("\t "+animals.get(d).name+" died!!\n");
                          animals.remove(d);
                              }
                        }
                     }

                }
               

              }
         

        }
   

        System.out.println();
    




if(animals.size()<1)
count=11;
else
count++;
          try{     
                Thread.sleep(2000);
             }            
        catch(Exception e){
           System.out.println(e);
             }


  } 
     
System.out.println("\n Survivers:\n-----------------------------------------------------------------");
  for(int p=0;p<=sizer;p++)
      {
          for(int q=0;q<=sizer;q++)
             {
              System.out.print(area[p][q]);
             }
           System.out.println("\n");
       }
System.out.println("--------------------------------------------------------------------------");



	}
  
}