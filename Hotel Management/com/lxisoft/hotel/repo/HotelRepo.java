package com.lxisoft.hotel.repo;
import com.lxisoft.hotel.model.*;
public interface HotelRepo{
	public void add(Food food)  throws Exception;
	//public viewall();
	public void delete(int selectedFood) throws Exception;
	//public update();
	public void edit() throws Exception;
}