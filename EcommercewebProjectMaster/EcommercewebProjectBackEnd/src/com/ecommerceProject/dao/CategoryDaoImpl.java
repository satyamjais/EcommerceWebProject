package com.ecommerceProject.dao;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import com.EcommerceProjectBackEnd.Model.Category;

public class CategoryDaoImpl implements CategoryDao  {
	private SessionFactory sessionfactory;
	@Override
	public boolean addCategory(Category category) {
		try
		{
			sessionfactory.getCurrentSession().save(category);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;
		}
	}

	@Override
	public boolean removeCategory(Category category) {
		try
		{
			sessionfactory.getCurrentSession().delete(category);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;
		}
	}

	@Override
	public boolean updateCategory(Category category) {
		try
		{
			sessionfactory.getCurrentSession().saveOrUpdate(category);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;
		}
	}

	@Override
	public List<Category> getCategoryItems(String categoryName) {
		Session session = sessionfactory.openSession();
		Query query = session.createQuery("from Category where categoryName = categoryName");
		query.setParameter("catergoryName", categoryName);
		List<Category> categoryItem = query.list();
		return categoryItem;
	}
}
