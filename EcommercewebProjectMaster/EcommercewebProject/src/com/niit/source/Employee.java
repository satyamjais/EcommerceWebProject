package com.niit.source;


public class Employee {
	private String name;
    private Address addr;
    public Employee(String name,Address addr) {
    	
    	this.name = name;
    	
    	this.addr= addr;
    	}

    	
    public void sayHello() {
        
        System.out.println("hello Employee..."+name+"City name is"+addr.getCity());
    	
    }

   }



