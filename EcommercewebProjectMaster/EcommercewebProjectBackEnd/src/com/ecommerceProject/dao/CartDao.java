package com.ecommerceProject.dao;
import java.util.List;
import com.EcommerceProjectBackEnd.Model.Cart;
public interface CartDao {
	public boolean addCart(Cart cart);
	public boolean updateCart(Cart cart);
	public boolean deleteCart(Cart cart);
	public Cart getCartItem(int cartItemId);
	public List<Cart> getCartItems(String username);
}
