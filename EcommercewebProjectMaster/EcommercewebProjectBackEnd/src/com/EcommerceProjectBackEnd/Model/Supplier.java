package com.EcommerceProjectBackEnd.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="SUPPLIER")
public class Supplier {
@Id
private int supId;
@Column
private String supName;
public int getSupId(){
	return supId;
}
public void setSupId(int supId) {
	this.supId = supId;
}
public String getSupName() {
	return supName;
}
public void setSupName(String supName) {
	this.supName = supName;
}
}
