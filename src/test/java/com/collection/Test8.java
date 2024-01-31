package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class Test8 {

	public static void main(String[] args) {

		Vector v=new Vector();
		v.add(100);
		v.add("umesh");
		v.add(10.5);
		v.add(null);
		v.add(true);
		System.out.println(v);
		System.out.println("========================================");
		
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		System.out.println("========================================");
		Enumeration<Object> e1=v.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		
	}

}
