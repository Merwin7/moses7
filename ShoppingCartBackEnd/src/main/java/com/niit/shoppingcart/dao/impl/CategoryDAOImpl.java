package com.niit.shoppingcart.dao.impl;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;
@Repository("categoryDAO")

@EnableTransactionManagement
public class CategoryDAOImpl implements CategoryDAO{
	@Autowired(required=true)
	SessionFactory sessionFactory;
	@Transactional
	public void addCategory(Category p) {
		// TODO Auto-generated method stub

		Session session=sessionFactory.getCurrentSession();
		session.persist(p);
		
		
	}
	@Transactional
	public void updateCategory(Category p) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.update(p);
	}
	@Transactional
	public List<Category> listCategory() {
		Session session=sessionFactory.getCurrentSession();
		List<Category> Categorys=session.createQuery("from Category").getResultList();
		return Categorys;
	}
	@Transactional
	public Category getCategoryById(int id) {
		Session session=sessionFactory.getCurrentSession();
		Category Category=(Category)session.createQuery("from Category where id="+id).getSingleResult();
		return Category;
	}
	@Transactional
	public void removeCategory(int id) {
		Session session=sessionFactory.getCurrentSession();
		Category Category=(Category)session.createQuery("from Category where id="+id).getSingleResult();
		session.delete(Category);
		
	}

}
