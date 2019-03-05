package com.lxisoft.hotel.repo;
import com.lxisoft.hotel.model.*;
public interface HotelRepo{
	public void add(Food food)  throws Exception;
	public void delete(Food selectedFood) throws Exception;
	public void viewAll() throws Exception;
	public void searchByName(String name) throws Exception;
	public void searchByPrice(int from,int to) throws Exception;
}