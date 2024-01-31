package com.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Test15Vector {

	public static void main(String[] args) {

		Vector<Product> v=new Vector<Product>();
		v.add(new Product(111,"Iphone15",50000));
		v.add(new Product(222,"HP PAVILION G6 Laptop", 60000));
		v.add(new Product(333,"Room Cooler",15000));
		
		System.out.println(v.capacity());
		// by using enumeration cursor
		Enumeration<Product> e=v.elements();
	  while(e.hasMoreElements())
	   {
		 Product p= e.nextElement();
		 System.out.println(p.prodid+"---"+p.prodname+"---"+p.prodprice);
	   }
	  System.out.println("=========================================");
		//by using iterator cursor
		Iterator<Product>itr=v.iterator();
		while(itr.hasNext())
		{
			Product p=itr.next();
			System.out.println(p.prodid+"---"+p.prodname+"----"+p.prodprice);
		}
		 System.out.println("=========================================");
		 ListIterator<Product>litr=v.listIterator();
		 while(litr.hasPrevious())
		 {
			 Product p=litr.previous();
			 System.out.println(p.prodid+"---"+p.prodname+"----"+p.prodprice);
		 }
		 while(litr.hasNext())
		 {
			 Product p=litr.next();
			 System.out.println(p.prodid+"---"+p.prodname+"----"+p.prodprice);
		 }
		 
		
	}

}
