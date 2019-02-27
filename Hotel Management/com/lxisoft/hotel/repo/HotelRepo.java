package com.lxisoft.hotel.repo;
import com.lxisoft.hotel.model.*;
public interface HotelRepo{
	public void add(Food food)  throws Exception;
	public void delete(Food selectedFood) throws Exception;
	public void edit(String foodName,int foodPrice,int nos,String name) throws Exception;
}