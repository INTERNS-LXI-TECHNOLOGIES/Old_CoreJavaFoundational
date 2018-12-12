/**
 * Java Interface Repository
 * 
 * This Interface provides CRUD operation which should be implemented 
 * by all Repository classes
 *
 * @author Jishnu
 * 
 * @version 1.00
 * 
 * @LastUpdated : 
 * 
 */

package contact.model;

import java.util.concurrent.CopyOnWriteArrayList;

public interface Repository<T> {

	/**
	 * Insert T Object to database
	 * 
	 * @param obj Object to insert
	 * @return boolean : true if insertion is successful else false
	 */
	public boolean create(T obj);


	/**
	 * Retrieve T Objects from Database
	 * 
	 * @param __condition Specifies which elements are to be selected
	 * @return ArrayList of T Objects which matches __condition
	 */
	public CopyOnWriteArrayList<T> retrieve(String __condition);


	/**
	 * Replace Object in Database
	 * 
	 * @param nobj Updated Object
	 * @param odobj Old Object
	 * @return boolean : true if updating is successful
	 * 
	 */
	public boolean update(T nobj , T odobj);


	/**
	 * Delete T Object from database
	 * 
	 * @param obj Object to be deleted
	 * @return boolean : true if deletion is successful else false
	 */
	public boolean delete(T obj);


	/**
	 * Replace Object in Database , which has same ID field has obj
	 * 
	 * @param obj Updated Object
	 * @return boolean : true if updating is successful
	 * 
	 */	
	public boolean update(T obj);


	/**
	 * Update T Objects Values in Database
	 * 
	 * @param obj Updated Object
	 * @param __condition Specifies which elements are to be updated
	 * @return boolean : true if updating is successful
	 * 
	 */	
	//public boolean update(T obj , String ...__condition);


	/**
	 * delete T Object from database
	 * 
	 * @param obj Object to delete
	 * @return boolean : true if deletion is successful else false
	 */
	//public boolean delete(T obj , String...__condition);


}
