package com.ecommerceProject.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.EcommerceProjectBackEnd.Model.Product;
@Repository
@Transactional

public class productDaoImpl implements productDao {
@PersistenceContext
private EntityManager entityManager;

@SuppressWarnings("unchecked")
@Override
public List<Product> getAllProducts(){
String hql = "FROM Products as products ORDER BY products.id";
return(List<Product>) entityManager.createQuery(hql).getResultList();

}
@Override
public Product getProductById(int id){
	Product product = entityManager.find(Product.class,1);
	return product;
}
@Override
public void updateProductById(Product product){
	entityManager.merge(product);
}

}
