package com.mkyong;

import java.util.UUID;

/**
 * Generate a unique number
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        App obj = new App();
        System.out.println("Unique ID : " + obj.generateUniqueKey());
        System.out.println("Test Commit Sysout A commit!");
   	System.out.println("Test Commit Sysout A commit!");
	System.out.println("Test Commit Sysout A commit!");
	System.out.println("Test Commit Sysout A commit!");
    }
    
    public String generateUniqueKey(){
    	
    	String id = UUID.randomUUID().toString();
    	return id;
    	
    }
}
