/**
 * 
 */
package com.lxisoft.collection_store.collections;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author anish
 *
 */
public class TreeMapStore<K,V> implements MapRepository<K,V> {

	Map<K,V> treeMap = new TreeMap<K,V>();
	/**
	 * @param key
	 * @param value
	 * @return
	 * @see java.util.Map#put(java.lang.Object, java.lang.Object)
	 */
	public V create(K key,V value) {
		return treeMap.put(key, value);
	}
	/**
	 * @return treeMap
	 */
	public Map<K,V> readAll(){
		return treeMap;
	}

	/**
	 * @param key
	 * @param value
	 * @return
	 * @see java.util.Map#remove(java.lang.Object, java.lang.Object)
	 */
	public boolean delete(Object key, Object value) {
		return treeMap.remove(key, value);
	}

	/**
	 * @param key
	 * @param oldValue
	 * @param newValue
	 * @return
	 * @see java.util.Map#replace(java.lang.Object, java.lang.Object, java.lang.Object)
	 */
	public boolean update(K key, V oldValue, V newValue) {
		return treeMap.replace(key, oldValue, newValue);
	}
}
