package com.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test10 {

	public static void main(String[] args) {

		LinkedList ll=new LinkedList();
		ll.add(10.7);
		ll.add(true);
		ll.add(null);
		ll.add(10.7);
		ll.add('f');
		ll.add("umesh");
		System.out.println(ll);
		System.out.println("-----------------");
		
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
                  System.out.println(itr.next());			
		}
		System.out.println("-----------------");
		
		ListIterator litr=ll.listIterator();
		
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
	}

}
