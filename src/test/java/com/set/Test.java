package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {

		HashSet h1=new HashSet();
		h1.add(100);
		h1.add("umesh");
		h1.add(10.5);
		h1.add(100);
		h1.add(null);
		h1.add('c');
		h1.add(true);
		System.out.println(h1);
		
		Iterator itr=h1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
