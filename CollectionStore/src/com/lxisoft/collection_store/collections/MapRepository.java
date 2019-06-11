/**
 * 
 */
package com.lxisoft.collection_store.collections;

import java.util.Map;

/**
 * @author anish
 *
 */
public interface MapRepository<K,V> {

	public V create(K key,V value);
	
	public Map<K,V> readAll();
	
	public boolean delete(Object key, Object value);
	
	public boolean update(K key, V oldValue, V newValue);
}
