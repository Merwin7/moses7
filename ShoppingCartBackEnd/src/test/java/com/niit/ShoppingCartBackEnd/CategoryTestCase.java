package com.niit.ShoppingCartBackEnd;



import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;

public class CategoryTestCase {
	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static Category category;

	@Autowired
	static CategoryDAO categoryDAO;

	@BeforeClass
	public static void init()
	{
		context=new  AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		categoryDAO=(CategoryDAO) context.getBean("categoryDAO");
		category=(Category) context.getBean("category");
		System.out.println("The objects are created");
	}
		/*@Test
	public void saveCategoryTestCase()
	{
		category.setId("134");
		category.setDescription("abc");
		category.setName("mob");
		Boolean status=categoryDAO.save(category);
		Assert.assertEquals("save category test case",true,status);
		}*/
		/*@Test
		public void deleteCategoryTestCase()
		{
			category.setId("134");
			Boolean status=categoryDAO.delete(category);
			Assert.assertEquals("delete category test case",true,status);
			}*/
		/*@Test
		public void updateCategoryTestCase()
		{
			category.setId("134");
						category.setDescription("cate");
			category.setName("aks");
			Boolean status=categoryDAO.update(category);
			Assert.assertEquals("update category test case",true,status);
			}*/



	/*@Test
		public void getCategoryTestCase()
		{
					Assert.assertEquals("get category test case",null,categoryDAO.get("abcd"));
			}

		public void getallCategoryTestCase()
		
			{
				Assert.assertEquals("getall category test case",12,categoryDAO.list().size());
			}*/
	
}
