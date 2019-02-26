package com.lxisoft.model;
public class Menu {
    int ch;
    String hotelName ="Internationale";
 	int id;	
	int tableNo;
	String date;
	String time;
	public enum OrderStatus { JUST_ORDERED, IN_PROCESS, COOKED, DELIVERED }
	public OrderStatus orderStat;
	
	String orderName ;
	
	
	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public int getId() {		 
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	public int getTableNo() {
		return tableNo;
	}

	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString()
	{
		return " OrderMaster {id="+this.id+", date="+this.date+", time="+this.time+", orderStat="+this.orderStat.name()+"  }";
	}

}

