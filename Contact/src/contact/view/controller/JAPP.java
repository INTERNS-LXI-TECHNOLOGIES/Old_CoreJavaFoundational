package contact.view.controller;

import java.util.concurrent.CopyOnWriteArrayList;

import org.json.simple.JSONObject;

public class JAPP {
	
	public String getJsonData() {
		
		CopyOnWriteArrayList<JSONObject> jlist = new CopyOnWriteArrayList<>();
		
		for(JSONObject job : MainViewController.getBController().getJsonArray())
		{
			jlist.add(job);
		}
		
		return jlist.toString();

	}
	
	public void createContact(String jsonString) {

		MainViewController.getBController().jsonToContact(jsonString);
	}

	public boolean updateContact(String jsonString) {
		
		return false;
	}
	
	public boolean deleteContact(String jsonString) {
		
		return false;
	}
}
