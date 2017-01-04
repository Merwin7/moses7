package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Category;

public interface CategoryDAO {
	
	public void addCategory(Category p);

	public void updateCategory(Category p);

	public List<Category> listCategory();

	public Category getCategoryById(int id);

	public void removeCategory(int id);
}
