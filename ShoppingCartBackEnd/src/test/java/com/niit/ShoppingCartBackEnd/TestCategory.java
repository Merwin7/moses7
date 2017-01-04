package com.niit.ShoppingCartBackEnd;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCategory {
public static void main(String[] args)
{
AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
context.scan("com.niit");
context.refresh();
context.getBean("product");
context.close();
System.out.println("The Category instances is created successfully");
}
}
