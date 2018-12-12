/**
 * Java Class TempRepository
 * 
 * This class is used to temporary store data in an ArrayList
 * 
 * Provides CRUD operations to manipulate Data;
 * 
 * @link Repository
 *
 * @author Jishnu
 * 
 * @version 1.00, 
 * 
 * @LastUpdated : 
 * 
 */

package contact.model;

import java.lang.reflect.Field;
import java.util.concurrent.CopyOnWriteArrayList;

public class TempRepository<T> extends RepositoryParser<T> implements Repository<T>{
	
	public CopyOnWriteArrayList<T> default_storage;

	// Constructors
	
	public TempRepository(Class<T> _class) {
		
		this.setClassType(_class);
		this.default_storage = new CopyOnWriteArrayList<>();
	}
	

	// Setters and Getters
	
	/**
	 * Changes default storage ArrayList
	 * 
	 * @param storage ArrayList Where Data is to be stored
	 * 
	 */
	public void setDataStore(CopyOnWriteArrayList<T> storage) {

		this.default_storage = storage;
	}
	
	
	/**
	 * Returns The current default_storage ArrayList
	 * 
	 * @return ArrayList
	 * 
	 */
	public CopyOnWriteArrayList<T> getCurrentDataStore() {
		
		return this.default_storage;
	}
	
	
	// CRUD operations
	
	/**
	 * Insert T Object to database
	 * 
	 * @param obj Object to insert
	 * @return boolean : true if insertion is successful else false
	 * 
	 */
	@Override
	public boolean create(T obj) {
		
		try {
			
			Field dfield = this.getDistinctField();
			
			for(T tobj : this.default_storage) {
				
				if(dfield.get(tobj).equals(dfield.get(obj))) {
					
					throw new Exception("Duplicate Value for Distinct field");
				}
			}
			
			this.getCurrentDataStore().add(obj);
			
			return true;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return false;
	}
	
	
	/**
	 * Retrieve T Objects from Database
	 * 
	 * @param __condition Specifies which elements are to be selected
	 * @return ArrayList of T Objects which matches __condition
	 * 
	 */
	@Override
	public CopyOnWriteArrayList<T> retrieve(String __condition) {
		
		String[] columnValue = null;
		
		int pos = 0;

		Field field = null;
		
		T obj = null;
		
		CopyOnWriteArrayList<T> tmpStorage = null;
		
		try {
			
			if(__condition.equals("*")) {
				
				return this.getCurrentDataStore();
			}
			else {
				
				columnValue = this.parseCondition(__condition);
				
				if(columnValue.length > 1)
				{
					
					obj = this.getCurrentDataStore().get(0);
					
					field =  obj.getClass().getDeclaredField(columnValue[0]);
					
					field.setAccessible(true);
					
					tmpStorage= new CopyOnWriteArrayList<>();
					
					for(T tmpObj : this.getCurrentDataStore()) {
						
						if(field.get(tmpObj).toString().equals(columnValue[1])) {
							
							tmpStorage.add(tmpObj);
						}
					}
					
					return tmpStorage;
					
				}
				else {
					
					pos = this.getCurrentDataStore().indexOf(columnValue[0]);
					
					tmpStorage= new CopyOnWriteArrayList<>();
					
					tmpStorage.add(this.getCurrentDataStore().get(pos));
					
					return tmpStorage;
				}
			}
			
		} catch (SecurityException e) {
			
			e.printStackTrace();
			
		} catch (IllegalArgumentException e) {
		
			e.printStackTrace();
			
		} catch (NoSuchFieldException e) {
			 
			e.printStackTrace();
			
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
		} 
		
		return null;
	}

	
	/**
	 * Replace Object in Database
	 * 
	 * @param nobj Updated Object
	 * @param odobj Old Object
	 * @return boolean : true if updating is successful
	 * 
	 */
	@Override
	public boolean update(T nobj , T odobj) {
		
		int pos = 0;
		
		try {
		
			pos = this.getCurrentDataStore().indexOf(odobj);
			
			this.getCurrentDataStore().remove(odobj);
			
			this.getCurrentDataStore().add(pos, nobj);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return false;
	}
	
	/**
	 * Delete T Object from database
	 * 
	 * @param obj Object to be deleted
	 * @return boolean : true if deletion is successful else false
	 * 
	 */
	@Override
	public boolean delete(T obj) {
	
		try {
			
			this.getCurrentDataStore().remove(obj);
			
			return true;
		} 
		catch (Exception e) {
		
			e.printStackTrace();
		}
		
		return false;
	}
	
	
	/**
	 * Replace Object in Database , which has same ID field has obj
	 * 
	 * @param obj Updated Object
	 * @return boolean : true if updating is successful
	 * 
	 */	
	@Override
	public boolean update(T obj) {
		
		Field[] fields = obj.getClass().getDeclaredFields();
		
		Field field = null;
		
		int index = 0;
		
		try {
			
			for(Field tmpField : fields) {
				
				tmpField.setAccessible(true);

				if(tmpField.getDeclaredAnnotation(Distinct.class) != null) {
					
					field = tmpField;
					
					for(T tmpObj : this.getCurrentDataStore()) {
					
						
						if( field.get(tmpObj).toString().equals(field.get(obj).toString())) {
							
							index = this.getCurrentDataStore().indexOf(tmpObj);
							
							this.getCurrentDataStore().remove(tmpObj);
							
							this.getCurrentDataStore().add(index, obj);
						}
					}
				}		
			}
			
			if(field == null) {
				
				throw new Exception("Distinct Annotation not found on any Fields");
			}
			
		
		} catch (IllegalArgumentException e) {
			
			e.printStackTrace();
			
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
			
		} catch (Exception e) {
	
			e.printStackTrace();
		}		
		
		return false;
	}
	
}
