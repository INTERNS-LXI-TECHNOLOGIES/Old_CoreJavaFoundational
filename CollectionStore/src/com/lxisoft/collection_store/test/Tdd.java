/**
 * 
 */
package com.lxisoft.collection_store.test;

import com.lxisoft.collection_store.collections.ArrayListStore;
import com.lxisoft.collection_store.collections.CollectionRepository;
import com.lxisoft.collection_store.collections.TreeSetStore;
import com.lxisoft.collection_store.collections.User;

/**
 * @author anish
 *
 */
public class Tdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CollectionRepository<User> a = new TreeSetStore<>(User.class);
		a.create(new User(1,"lmn"));
		a.create(new User(13,"axe"));
		a.create(new User(11,"tde"));
		a.sort("name");
		System.out.println(a.readAll());

	}

}
