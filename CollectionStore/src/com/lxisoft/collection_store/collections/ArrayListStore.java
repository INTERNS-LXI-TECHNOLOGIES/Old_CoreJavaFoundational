/**
 * 
 */
package com.lxisoft.collection_store.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author anish
 *
 */
public class ArrayListStore<T> implements CollectionRepository<T>{

	private List<T> arrayList = new ArrayList<>();
	@Override
	public void create(T value) {
		arrayList.add(value);
	}
	@Override
	public Collection<T> readAll() {
		return arrayList;
	}
	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sort(String by) {
		// TODO Auto-generated method stub
		
	}

}
