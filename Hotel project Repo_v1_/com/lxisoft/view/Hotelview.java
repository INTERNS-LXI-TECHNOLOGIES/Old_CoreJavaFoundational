package com.lxisoft.view;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import com.lxisoft.model.*;
import com.lxisoft.view.*;
public class Hotelview{
    
    ArrayList<Food> food = new ArrayList<Food>();
    Menuview m = new Menuview();

    public void setFood(ArrayList<Food> food) {
        this.food = food;
    }
    public ArrayList<Food> getFood() {
        return food;
    }

    public void foodDetails() throws Exception{
        int ch;
        Scanner sc = new Scanner(System.in);
        
        File file = new File("Items.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
       
        do{
            Food food1 =new Food();
            System.out.println("Enter food name:");
            food1.setName(sc.next());
            System.out.println("Enter price:");
            food1.setPrice(sc.nextInt());
            System.out.println("Enter quantity:");
            food1.setQuantity(sc.nextInt());
            food.add(food1);
            System.out.println("Enter 1 to continue:");
            ch = sc.nextInt();
                
            bw.write(food1.getName()+","+food1.getQuantity()+","+food1.getPrice());
            bw.flush();
            
            
            String string = br.readLine();
            System.out.println(string);
            
        
        }while(ch==1);
        m.temp(food); 
        m.mainMenu();
        m.list();
        
        fr.close();

    }
    public void remove(){
        int ch;
        Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter choice:");
            ch=sc.nextInt();
        
    }
}
