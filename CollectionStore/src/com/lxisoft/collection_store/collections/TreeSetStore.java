/**
 * 
 */
package com.lxisoft.collection_store.collections;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author anish
 *
 */
public class TreeSetStore<T> implements CollectionRepository<T> {

	private Class<T> type;
	private String fieldName = "name";
	private Class<?> dataType;
	Set<T> treeSet = new TreeSet<T>((a, b) -> {
		try {
			return ((String) type.getField(fieldName).get(a)).compareTo((String) type.getField(fieldName).get(b));
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
			return 4;
		}
	});

	public TreeSetStore(Class<T> type) {
		this.type = type;
		User obj = new User();
		try {
			System.out.println(type.getField(fieldName).getType().cast(type.getField(fieldName).get(obj)));
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		// TODO Auto-generated method stub

	}
	@Override
	public void sort(String fieldName) {
		fieldName = this.fieldName;
		Type[] a = TreeSetStore.this.getClass().getGenericInterfaces();
		try {
			System.out.println();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
