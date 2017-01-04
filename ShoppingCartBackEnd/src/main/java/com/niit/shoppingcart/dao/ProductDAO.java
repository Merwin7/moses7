package com.niit.shoppingcart.dao;

import java.util.List;


import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.Supplier;

public interface ProductDAO {

public void addProduct(Product p);

public void updateProduct(Product p);

public List<Product> listProduct();

public Product getProductById(int id);

public void removeProduct(int id);
}