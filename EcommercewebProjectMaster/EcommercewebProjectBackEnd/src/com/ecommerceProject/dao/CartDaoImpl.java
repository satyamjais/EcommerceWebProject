package com.ecommerceProject.dao;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import com.EcommerceProjectBackEnd.Model.Cart;

public class CartDaoImpl implements CartDao  {
	private SessionFactory sessionfactory;
	public boolean addCart(Cart cart) {
		try
		{
			sessionfactory.getCurrentSession().save(cart);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;
		}
	}
	@Override
	public boolean updateCart(Cart cart) {
		try
		{
			sessionfactory.getCurrentSession().saveOrUpdate(cart);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	@Override
	public boolean deleteCart(Cart cart) {
		try
		{
			sessionfactory.getCurrentSession().delete(cart);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	@Override
	public Cart getCartItem(int cartItemId) {
		
		Session session = sessionfactory.openSession();
		Cart cart = ((Cart)session.get(Cart.class, cartItemId));
		session.close();
		return cart;
	}
	@Override
	public List<Cart> getCartItems(String username) {
		
		Session session = sessionfactory.openSession();
		Query query = session.createQuery("from Cart where username=username and status='NP'");
		query.setParameter("username", username);
		List<Cart>listCartItem = query.list();
		return listCartItem;
	}

}
