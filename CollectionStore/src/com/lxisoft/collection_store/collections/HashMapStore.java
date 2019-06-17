/**
 * 
 */
package com.lxisoft.collection_store.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.lxisoft.collection_store.exceptions.UnsupportedParameterExeption;

import java.util.Set;

/**
 * @author anish
 *
 */
public class HashMapStore<K,V> implements MapRepository<K,V> {
	private Map<K,V> hashMap = new HashMap<K,V>();

	@Override
	public V create(K key, V value) {
		return hashMap.put(key, value);
	}

	@Override
	public Map<K, V> readAll() {
		return hashMap;
	}

	@Override
	public boolean delete(Object key, Object value) {
		return hashMap.remove(key, value);
	}

	@Override
	public boolean update(K key, V oldValue, V newValue) {
		return hashMap.replace(key, oldValue, newValue);
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
