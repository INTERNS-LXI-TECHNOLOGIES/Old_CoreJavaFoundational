/**
 * 
 */
package com.lxisoft.collection_store.collections;

import java.util.LinkedHashMap;
import java.util.Map;

import com.lxisoft.collection_store.exceptions.UnsupportedParameterExeption;

/**
 * @author anish
 *
 */
public class LinkedHashMapStore<K,V>implements MapRepository<K, V> {
	
	Map<K,V> linkedHashMap = new LinkedHashMap<K,V>();
	@Override
	public V create(K key, V value) {
		return linkedHashMap.put(key, value);
	}

	@Override
	public Map<K, V> readAll() {
		return linkedHashMap;
	}

	@Override
	public boolean delete(Object key, Object value) {
		return linkedHashMap.remove(key, value);
	}

	@Override
	public boolean update(K key, V oldValue, V newValue) {
		return linkedHashMap.replace(key, oldValue, newValue);
	}

	@Override
	public void sortByValue() {
		try {
			throw new UnsupportedParameterExeption("Sortingnot supported by HashMapStore");
		} catch (UnsupportedParameterExeption e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void sortByValue(String fieldName) {
		try {
			throw new UnsupportedParameterExeption("Sortingnot supported by HashMapStore");
		} catch (UnsupportedParameterExeption e) {
			e.printStackTrace();
		}
		
		
	}
}
