/**
 * 
 */
package com.lxisoft.collection_store.collections;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author anish
 *
 */
public class TreeMapStore<K, V> implements MapRepository<K, V> {

	Map<K, V> treeMap;
	private Class<K> type;
	private String fieldName = "id";
	private boolean sort = false;

	public TreeMapStore(Class<K> type) {
		this.type = type;
		treeMap = new TreeMap<K,V>();
		sortByValues(treeMap);
	}

	public Map<K, V> sortByValues( Map<K, V> map) {
		Comparator<K> valueComparator = new Comparator<K>() {
			public int compare(K k1, K k2) {
				//System.out.println(map.get(k1).getClass());
				Class<?> type = map.get(k1).getClass();
				if(type == Double.class || type == Float.class || type == Long.class ||
					type == Integer.class || type == Short.class || type == Character.class ||
					type == Byte.class || type == Boolean.class) {
					return (Integer)map.get(k1)-(Integer)map.get(k2);
				}
				else if(type== String.class) {
					return ((String)map.get(k1)).compareTo((String)map.get(k2));	
				}
				else {
					try {
						if (type.getDeclaredField(fieldName).getType().toString().equals("class java.lang.String")) {
								try {
									return ((String) type.getDeclaredField(fieldName).get(map.get(k1)))
											.compareTo((String) type.getDeclaredField(fieldName).get(map.get(k2)));
								} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException
										| SecurityException e) {
									e.printStackTrace();
									return 4;
								}
						} else {
							
								try {
									return (Integer) type.getDeclaredField(fieldName).getType()
											.cast(type.getDeclaredField(fieldName).get(map.get(k2)))
											- (Integer) type.getDeclaredField(fieldName).getType().cast(type.getDeclaredField(fieldName).get(map.get(k2)));
								} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException
										| SecurityException e) {
									e.printStackTrace();
									return 4;
							}
						}
					} catch (NoSuchFieldException | SecurityException e1) {
						e1.printStackTrace();
					}
				}
				return 1;
			}
		};

		Map<K,V> sortedByValues = new TreeMap<K, V>(valueComparator);
		sortedByValues.putAll(map);
		return sortedByValues;
	}

	/**
	 * @param key
	 * @param value
	 * @return
	 * @see java.util.Map#put(java.lang.Object, java.lang.Object)
	 */
	public V create(K key, V value) {
		return treeMap.put(key, value);
	}

	/**
	 * @return treeMap
	 */
	public Map<K, V> readAll() {
		if(sort) {
			Map<K,V> sortedMap = sortByValues(treeMap);
			return sortedMap;
		}
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
	 * @see java.util.Map#replace(java.lang.Object, java.lang.Object,
	 *      java.lang.Object)
	 */
	public boolean update(K key, V oldValue, V newValue) {
		return treeMap.replace(key, oldValue, newValue);
	}
	@Override
	public void sortByValue() {
		sort = true;
	}
	@Override
	public void sortByValue(String fieldName) {
		this.fieldName = fieldName;
		sort = true;
	}
	
}
