package com.lxisoft.customer;
import java.util.Scanner;
public class Customer{
    private int tableNo;
    private String name;                                         //javac com/lxisoft/menu/Menu.java

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }
    public int getTableNo() {
        return tableNo;
    }

    public void customerDetails(){
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        name = sc.next();
        System.out.println("Enter Table No.:");
        tableNo = sc.nextInt();

    }
}