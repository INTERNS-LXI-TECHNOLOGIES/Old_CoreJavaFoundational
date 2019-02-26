package com.lxisoft.model;
public class Bill {
	private int id;
	private int orderId;
	int totalItem;
	String totalCost;
	String date;
	String time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}

	public String getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(String totalCost) {
		this.totalCost = totalCost;
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
	public String toString() {
		return "Bill { id=" + this.id + ", orderId=" + this.orderId
				+ ", totalItem=" + this.totalItem + ", totalCost="
				+ this.totalCost + ", data=" + this.date + ", time="
				+ this.time + "}";
	}

}