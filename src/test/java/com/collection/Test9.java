package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Test9 {

	public static void main(String[] args) {

		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add("umesh");
		ar.add(10.5);
		ar.add(true);
		ar.add(10.5);
		ar.add('c');
		System.out.println(ar);
		System.out.println("=========================");
		
		Iterator it=ar.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
