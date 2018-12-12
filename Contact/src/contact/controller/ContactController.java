/**
 * Java Class ContactController
 * 
 * This class is used to Interchange data between the Model
 *
 * and the front-end View Controller
 * 
 * @author Jishnu
 * 
 * @version 1.00
 * 
 * @LastUpdated : 
 * 
 */

package contact.controller;

import java.util.concurrent.CopyOnWriteArrayList;

import org.json.simple.JSONObject;

import contact.model.*;

public class ContactController {
	
	private Repository<Contact> prepo;

	
	// Constructors
	
	public ContactController() {}
	
	
	// Getters and Setters
	
	/**
	 * Returns the Repository Reference
	 * 
	 * @return Repository<Contact>
	 * 
	 */
	public Repository<Contact> getRepository() {
		
		return this.prepo;
	}

	
	/**
	 * Sets the Repository Reference
	 * 
	 * @param repo
	 * 
	 */
	public void setRepository(Repository<Contact> repo) {
		
		this.prepo = repo;	
	}
	
	
	// Repository Data Retrieving and Manipulating methods
	
	@SuppressWarnings("unchecked")
	public CopyOnWriteArrayList<JSONObject> getJsonArray() {
		
		CopyOnWriteArrayList<JSONObject> jsonArray = new CopyOnWriteArrayList<>();
		
		try {
			
			for(Contact contact : this.getAllContacts()) {
				
				if(contact!=null) {
							
					JSONObject json = new JSONObject();
					
					json.put("id", contact.getId());
					
					json.put("name", contact.getName());
					
					json.put("mobileNo", contact.getMobileNo());
					
					json.put("landLine", contact.getLandLine());
					
					jsonArray.add(json);
					
				}
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return jsonArray;
	}
	
	public void jsonToContact(String jsonString) {
		
		/* Implement this function Later */
		
		System.out.println(jsonString);
		
	}
	
	public CopyOnWriteArrayList<Contact> getAllContacts() {
		
		return this.getRepository().retrieve("*");
	}
	
	public Contact getContactById(int id) {
		
		return this.getRepository().retrieve("id=" + id).get(0);
	}
	
	public CopyOnWriteArrayList<Contact> getContactsByAttribute(String attr) {
		
		return this.getRepository().retrieve(attr);
	}
	
	public Contact getContactByAttribute(String attr) {
		
		return this.getRepository().retrieve(attr).get(0);
	}
	
	public void insertContact(Contact contact) {
		
		this.getRepository().create(contact);
	}
	
	public void deleteContact(Contact contact) {
		
		this.getRepository().delete(contact);
	}
	
	public void updateContact(Contact contact) {
		
		this.getRepository().update(contact);
	}
	
}
