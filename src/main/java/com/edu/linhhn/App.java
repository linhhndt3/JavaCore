package com.edu.linhhn;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException
    {
	    
	Set<String> set = new HashSet(Arrays.asList(args));
        System.out.println( "Hello World!" );
        
        Person p = new Person();
//        p.setName("name");
        Field[] allFields = Person.class.getDeclaredFields();
        for(Field f : allFields) {
        	System.out.println(f.getName());
        }
        
        Field field = p.getClass().getDeclaredField(allFields[0].getName());    
        field.setAccessible(true);
        Object value = field.get(p);
        
        System.out.println(value);
        
    }
    
    private static class Person {
	    private String nametest;

	public String getName() {
		return nametest;
	}

	public void setName(String name) {
		this.nametest = name;
	}
	    
    }
}
