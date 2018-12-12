/**
 * Java Annotation Distinct
 * 
 * This Annotation is used to set the field which should Not have Duplicate Values
 * 
 *
 * @author Jishnu
 * 
 * @version 1.00 
 * 
 * @LastUpdated : 
 * 
 */

package contact.model;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)

/*
 * Should only be used in single Field in a Class 
 * 
 */
public @interface Distinct {}
