/**
 * 
 */
package com.lxisoft.collection_store.collections;

import java.util.Collection;

/**
 * @author anish
 *
 */
public interface CollectionRepository<T>{

	public void create(T value);
	public Collection<T> readAll();
	public void sort();
	public void sort(String by);
	
}
