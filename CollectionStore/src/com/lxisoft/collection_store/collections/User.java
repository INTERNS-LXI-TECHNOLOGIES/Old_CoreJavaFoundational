/**
 * 
 */
package com.lxisoft.collection_store.collections;

/**
 * @author anish
 *
 */
public class User {
	public int id;
	public String name;
	public User(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
}
