package com.ecommerceProject.dao;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.EcommerceProjectBackEnd.Model.Supplier;

public class SupplierImplDao implements SupplierDao  {
	private SessionFactory sessionfactory;
	@Override
	public boolean addSupplier(Supplier supplier) {
		try
		{
			sessionfactory.getCurrentSession().save(supplier);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;
		}
	}

	@Override
	public boolean removeSupplier(Supplier supplier) {
		try
		{
			sessionfactory.getCurrentSession().delete(supplier);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;
		}
	}

	@Override
	public Supplier getSupplierById(int suppId) {
		
		Session session = sessionfactory.openSession();
		Supplier supplier = ((Supplier)session.get(Supplier.class, suppId));
		session.close();
		return supplier;
	}

	@Override
	public ArrayList<Supplier> getallsuppliers() {
		Session session = sessionfactory.openSession();
		Query query = session.createQuery("from Supplier");
		ArrayList<Supplier> supList=(ArrayList<Supplier>) query.list();
		session.flush();
		return supList;
	}

}
