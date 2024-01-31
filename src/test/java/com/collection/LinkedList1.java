package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {

		LinkedList ll=new LinkedList();
		ll.add(10.56);
		ll.add("gajanan");
		ll.add("gajanan");
		ll.add(true);
		ll.add(null);
		ll.add(100);
		System.out.println(ll);
		
		ll.addFirst("umesh");
		ll.addLast("ajinkyya");
		System.out.println(ll);
		
		ll.clone();
		System.out.println(ll);
		System.out.println(ll.peekFirst());
		
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
		
	}

}
