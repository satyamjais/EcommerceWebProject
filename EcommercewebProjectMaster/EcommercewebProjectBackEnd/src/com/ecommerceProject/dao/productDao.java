package com.ecommerceProject.dao;
import com.EcommerceProjectBackEnd.Model.Product;
import java.util.List;
public interface productDao {
List<Product>getAllProducts();
Product getProductById(int id);
void updateProductById(Product product);

}
