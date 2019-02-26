package com.lxisoft.model.Customer;
import java.util.Scanner;
public class Customer{
    int tableNo; 
    String name;  

    public void setName(String name) {
        this.name = name;
    }
    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }
    public String getName() {
        return name;
    }
    public int getTableNo() {
        return tableNo;
    }
}