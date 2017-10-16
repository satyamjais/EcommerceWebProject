package com.ecommerceProject.dao;
import java.util.ArrayList;
import com.EcommerceProjectBackEnd.Model.Supplier;
public interface SupplierDao {
	public boolean addSupplier(Supplier supplier);
	public boolean removeSupplier(Supplier supplier);
	public Supplier getSupplierById(int suppId);
	public ArrayList<Supplier> getallsuppliers();
}
