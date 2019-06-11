/**
 * 
 */
package com.lxisoft.collection_store.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * @author anish
 *
 */
public class ArrayListStore<T> implements CollectionRepository<T> {
	private Class<T> type;
	private String fieldName = "id";
	List<T> arrayList = new ArrayList<>();

	public ArrayListStore(Class<T> type) {
		this.type = type;
	}

	@Override
	public void create(T value) {
		arrayList.add(value);
	}

	@Override
	public Collection<T> readAll() {
		return arrayList;
	}
	
	@SuppressWarnings("unchecked")
	private void sort(List<T> list) {
		try {
	         Object[] a = list.toArray();
	         Arrays.sort(a);
	         ListIterator<T> i = list.listIterator();
	         for (int j=0; j<a.length; j++) {
	             i.next();
	             i.set((T)a[j]);
	         }
		}catch(ClassCastException e) {
			sort(fieldName);
		}
	}
	
	@Override
	public void sort() {
		sort(arrayList);
	}

	@Override
	public void sort(String fieldName) {
		if (this.fieldName != null) {
			this.fieldName = fieldName;
		}
		Collections.sort(arrayList, (a, b) -> {
			try {
				if (type.getDeclaredField(this.fieldName).getType().toString().equals("class java.lang.String")) {
					try {
						return ((String) type.getDeclaredField(this.fieldName).get(a))
								.compareTo((String) type.getDeclaredField(this.fieldName).get(b));
					} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException
							| SecurityException e) {
						e.printStackTrace();
						return 4;
					}
				} else {
					try {
						return (Integer) type.getDeclaredField(this.fieldName).getType()
								.cast(type.getDeclaredField(this.fieldName).get(a))
								- (Integer) type.getField(fieldName).getType().cast(type.getField(fieldName).get(b));
					} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException
							| SecurityException e) {
						e.printStackTrace();
						return 4;
					}
				}
			} catch (NoSuchFieldException | SecurityException e) {
				e.printStackTrace();
			}
			return 4;
		});

	}

	@Override
	public void delete(T element) {
		arrayList.remove(element);

	}

	@Override
	public void delete(int index) {
		arrayList.remove(index);

	}

	@Override
	public void update(int index, T element) {
		arrayList.set(index, element);
	}

	@Override
	public void update(T element0, T element1) {
		arrayList.set(arrayList.indexOf(element0), element1);
	}

}
