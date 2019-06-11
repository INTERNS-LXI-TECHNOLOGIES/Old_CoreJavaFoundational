/**
 * 
 */
package com.lxisoft.collection_store.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import com.lxisoft.collection_store.exceptions.UnsupportedParameterExeption;

/**
 * @author anish
 *
 */
public class LinkedHashSetStore<T> implements CollectionRepository<T> {
	Set<T> linkedHashSet = new HashSet<>();
	private String fieldName = "id";
	private Class<T> type;
	public LinkedHashSetStore(Class<T> type) {
		this.type = type;
	}
	@Override
	public void sort(String fieldName) {
		try {
			throw new UnsupportedParameterExeption("Sort by Field name not supported by LinkedHashSetStore");
		} catch (UnsupportedParameterExeption e) {
			e.printStackTrace();
		}
	}
	@Override
	public void create(T value) {
		linkedHashSet.add(value);
		
	}

	@Override
	public Collection<T> readAll() {
		return linkedHashSet;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void sort() {
		try {
	         Object[] a = linkedHashSet.toArray();
	         Arrays.sort(a);
	         for(Object t:a) {
	        	 linkedHashSet.add((T)t);
	         }
		}catch(ClassCastException e) {
			sort(fieldName);
		}
		
	}

	@Override
	public void delete(T element) {
		linkedHashSet.remove(element);
		
	}

	@Override
	public void delete(int index) {
		try {
			throw new UnsupportedParameterExeption("Delete by index not supported by LinkedHashSetStore");
		} catch (UnsupportedParameterExeption e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(int index, T element) {
		try {
			throw new UnsupportedParameterExeption("Update by index not supported by LinkedHashSetStore");
		} catch (UnsupportedParameterExeption e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(T element0, T element1) {
		linkedHashSet.remove(element0);
		linkedHashSet.add(element1);
	}

}
