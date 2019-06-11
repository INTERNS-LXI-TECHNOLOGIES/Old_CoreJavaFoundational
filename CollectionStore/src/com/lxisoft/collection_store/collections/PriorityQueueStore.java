/**
 * 
 */
package com.lxisoft.collection_store.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

import com.lxisoft.collection_store.exceptions.UnsupportedParameterExeption;

/**
 * @author anish
 *
 */
public class PriorityQueueStore<T> implements CollectionRepository<T> {
	
	PriorityQueue<T> priorityQueue;
	private Class<T> type;
	private String fieldName = "id";

	public PriorityQueueStore(Class<T> type) {
		this.type = type;
		//System.out.println("");
		if (type == Double.class || type == Float.class || type == Long.class ||
			type == Integer.class || type == Short.class || type == Character.class ||
			type == Byte.class || type == Boolean.class){
			priorityQueue = new PriorityQueue<T>();
		}else {
			createSetStore();
		}
	}
	private void createSetStore() {
		try {
			if (type.getDeclaredField(fieldName).getType().toString().equals("class java.lang.String")) {
				priorityQueue = new PriorityQueue<T>(10,(a, b) -> {
					try {
						return ((String) type.getDeclaredField(fieldName).get(a))
								.compareTo((String) type.getDeclaredField(fieldName).get(b));
					} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException
							| SecurityException e) {
						e.printStackTrace();
						return 4;
					}
				});
			} else {

				priorityQueue = new PriorityQueue<T>(10,(a, b) -> {
					try {
						return (Integer) type.getDeclaredField(fieldName).getType()
								.cast(type.getDeclaredField(fieldName).get(a))
								- (Integer) type.getField(fieldName).getType().cast(type.getField(fieldName).get(b));
					} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException
							| SecurityException e) {
						e.printStackTrace();
						return 4;
					}
				});
			}
		} catch (NoSuchFieldException | SecurityException e1) {
			e1.printStackTrace();
		}
	}
	@Override
	public void create(T value) {
		priorityQueue.add(value);
		
	}

	@Override
	public Collection<T> readAll() {
		ArrayList<T> a = new ArrayList<T>();
		while (!priorityQueue.isEmpty()) {
           a.add(priorityQueue.poll());
		}
		return a;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void sort() {
		try {
	         Object[] a = priorityQueue.toArray();
	         Arrays.sort(a);
	         for(Object t:a) {
	        	 priorityQueue.add((T)t);
	         }
		}catch(ClassCastException e) {
			sort(fieldName);
		}
		
	}

	@Override
	public void sort(String fieldName) {
		this.fieldName = fieldName;
		Queue<T> priorityQueue = this.priorityQueue;
		createSetStore();
		this.priorityQueue.addAll(priorityQueue);
		
	}

	@Override
	public void delete(T element) {
		priorityQueue.remove(element);
		
	}

	@Override
	public void delete(int index) {
		try {
			throw new UnsupportedParameterExeption("Delete by index not supported by PriorityQueueStore");
		} catch (UnsupportedParameterExeption e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(int index, T element) {
		try {
			throw new UnsupportedParameterExeption("Update by index not supported by PriorityQueueStore");
		} catch (UnsupportedParameterExeption e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(T element0, T element1) {
		priorityQueue.remove(element0);
		priorityQueue.add(element1);
		
	}

}
