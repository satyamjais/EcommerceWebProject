package com.ecommerceProject.dao;
import java.util.List;
import com.EcommerceProjectBackEnd.Model.Category;

	public interface CategoryDao {
		
		public boolean addCategory(Category category);
		public boolean removeCategory(Category category);
		public boolean updateCategory(Category category);
		public List<Category> getCategoryItems(String categoryName);
		
	}


