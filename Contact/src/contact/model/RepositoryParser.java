
/**
 * Java Abstract Class RepositoryParser
 * 
 * This Abstract Class Provides a Single Method to Parse Conditions
 * 
 * This class Was Just Written to reduce Code Duplication
 *
 * @author Jishnu
 * 
 * @version 1.00
 * 
 * @LastUpdated : 
 * 
 */

package contact.model;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

public abstract class RepositoryParser<T> {
	
	private Class<T> classType;
	
	public void setClassType(Class<T> _class) {
		
		this.classType = _class;
	}
	
	public Class<T> getClassType() {
		
		return classType;
	}

	
	/**
	 * 
	 * Split __condition into column and value
	 * 
	 * @param __condition to be parsed
	 * @return String[] : An array of column and value
	 */
	public String[] parseCondition(String __condition) {
		
		String column = null;
		
		String value = null;
		
		if(!__condition.isEmpty() && __condition.contains("=")) {
		
			column = __condition.split("=")[0];
			
			value = __condition.split("=")[1];
			
			return new String[] {column , value};
		}
		else {
			
			value = __condition;
			
			return new String[] {value};
		}
		
	}
	
	public CopyOnWriteArrayList<T> sqlParseResult(ResultSet set) {
		
		final CopyOnWriteArrayList<T> list = new CopyOnWriteArrayList<T>();
		
		try {
			while(set.next()) {

				Stream<Field> fields = Arrays.asList(this.getClassType().getDeclaredFields()).stream();
				
				final T tobj = this.getClassType().newInstance();
				
				fields.forEach(field->{
					
					field.setAccessible(true);
							
					String fieldType = field.getType().getSimpleName();
					
					try {
						
						if(fieldType.equals("int")) {
							
							field.set(tobj, set.getInt(field.getName()));
							
						}
						else if(fieldType.equals("String")) {
							
							field.set(tobj, set.getObject(field.getName()));
						}
						else {
							
							throw new Exception("shjhs");
						}
						
					} catch (Exception e) {
						
						e.printStackTrace();
					} 
					
				});
				
				list.add(tobj);			
			}
		} catch (SecurityException e) {
			
			e.printStackTrace();
		} catch (InstantiationException e) {
			
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;
		
		
	}
	
	/**
	 *
	 * Get The field Annotated with @Distinct
	 * 
	 * @return Field : The field which is annotated with @Distinct
	 */
	public Field getDistinctField() {
		
		Field[] fields = this.getClassType().getDeclaredFields();
		
		Field field = null;
	
		try {
			
			for(Field tmpField : fields) {
				
				tmpField.setAccessible(true);
	
				if(tmpField.getDeclaredAnnotation(Distinct.class) != null) {
					
					field = tmpField;
				}
			}
				
			if(field == null) {
				
				throw new Exception("Distinct Annotation not found on any Fields");
			}
			
		
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		return field;
	}



}
