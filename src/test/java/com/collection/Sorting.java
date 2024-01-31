package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Sorting {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(200);
		al.add(678);
		al.add(323);
		al.add(123);
		System.out.println("before sortig:- "+al);
		Collections.sort(al);
		System.out.println("after sortig:- "+al);
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("mayur");
		ll.add("umesh");
		ll.add("gajanana");
		ll.add("ajinkya");
		System.out.println("before sorting: "+ll);
		Collections.sort(ll);
		System.out.println("after sorting"+ll);
		
		
	}

}
