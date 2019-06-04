/**
 * 
 */
package com.lxisoft.collection_store.collections;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

import com.lxisoft.collection_store.exceptions.UnsupportedParameterExeption;

/**
 * @author anish
 *
 */
public class TreeSetStore<T> implements CollectionRepository<T> {

	private Class<T> type;
	private String fieldName = "id";
	Set<T> treeSet;

	public TreeSetStore(Class<T> type) {
		this.type = type;
		if (type == Double.class || type == Float.class || type == Long.class ||
			type == Integer.class || type == Short.class || type == Character.class ||
			type == Byte.class || type == Boolean.class){
			treeSet = new TreeSet<T>();
		}else {
			createSetStore();
		}
	}

	public void createSetStore() {
		try {
			if (type.getDeclaredField(fieldName).getType().toString().equals("class java.lang.String")) {
				treeSet = new TreeSet<T>((a, b) -> {
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
				treeSet = new TreeSet<T>((a, b) -> {
					try {
						return (int) type.getDeclaredField(fieldName).getType()
								.cast(type.getDeclaredField(fieldName).get(a))
								- (int) type.getField(fieldName).getType().cast(type.getField(fieldName).get(b));
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

	public Class<T> getMyType() {
		return this.type;
	}

	@Override
	public void create(T value) {
		treeSet.add(value);
	}

	@Override
	public Collection<T> readAll() {
		return treeSet;
	}
	
	@Override
	public void sort() {
		
	}

	@Override
	public void sort(String fieldName) {
		if (fieldName != null) {
			this.fieldName = fieldName;
		}
		Set<T> treeSet = this.treeSet;
		createSetStore();
		this.treeSet.addAll(treeSet);
	}

	@Override
	public void delete(T element) {
		treeSet.remove(element);

	}

	@Override
	public void delete(int index) {
		try {
			throw new UnsupportedParameterExeption("Delete by index not supported by TreeSetStore");
		} catch (UnsupportedParameterExeption e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(int index, T element) {

	}

	@Override
	public void update(T element0, T element1) {

	}

}
