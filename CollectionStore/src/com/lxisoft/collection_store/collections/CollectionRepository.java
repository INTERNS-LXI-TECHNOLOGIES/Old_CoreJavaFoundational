/**
 * 
 */
package com.lxisoft.collection_store.collections;

import java.util.Collection;

/**
 * @author anish
 *
 */
public interface CollectionRepository<T> {

	public void create(T value);

	public Collection<T> readAll();

	public void sort();

	public void sort(String fieldName);

	public void delete(T element);

	public void delete(int index);

	public void update(int index, T element);

	public void update(T element0, T element1);
}
