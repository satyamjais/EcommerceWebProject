package com.EcommerceProjectBackEnd.Model;
import org.springframework.beans.factory.annotation.Autowired;
public class Employee {
private String name;
private Address addr;
@Autowired
public Employee(Address addr){
	this.addr = addr;
}
public void sayHello(){
	System.out.println("City name is "+addr.getCity());
}
}
