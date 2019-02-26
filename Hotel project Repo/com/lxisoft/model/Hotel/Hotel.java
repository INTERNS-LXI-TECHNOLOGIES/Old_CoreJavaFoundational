package com.lxisoft.model;
public class Hotel{

int id;
int orderId;
int tableNo;
int itemId;	
String itemName;
String itemCost;
int qnt;
public enum OrderStatus { STARTED, IN_PROCESS, COOKED }
public OrderStatus orderStat;

public int getId() {
    return id;
}	
public void setId(int id) {
    this.id = id;
}


public String getItemCost() {
    return itemCost;
}
public void setItemCost(String itemCost) {
    this.itemCost = itemCost;
}
public int getTableNo() {
    return tableNo;
}
public void setTableNo(int tableNo) {
    this.tableNo = tableNo;
}
public String getItemName() {
    return itemName;
}

public void setItemName(String itemName) {
    this.itemName = itemName;
}

public int getOrderId() {
    return orderId;
}

public void setOrderId(int orderId) {
    this.orderId = orderId;
}

public int getItemId() {
    return itemId;
}

public void setItemId(int itemId) {
    this.itemId = itemId;
}

public int getQnt() {
    return qnt;
}

public void setQnt(int qnt) {
    this.qnt = qnt;
}

public OrderStatus getOrderStat() {
    return orderStat;
}

public  static OrderStatus getOrderStat(String orderStatus ) {
    for(OrderStatus os : OrderStatus.values())
    {
        if(os.name().equals(orderStatus))
            return os;
    }
    return null;
}

public void setOrderStat(OrderStatus orderStat) {
    this.orderStat = orderStat;
}

@Override
public String toString()
{
    return " OrderMaster {id="+this.id+", orderId="+this.orderId+", itemId="+this.itemId+", qnt="+this.qnt+", orderStat="+this.orderStat.name()+"  }";
}

    }
