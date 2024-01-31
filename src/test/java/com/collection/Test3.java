package com.collection;

import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
     
		ArrayList al=new ArrayList();
		al.add("samar");
		al.add(12);
		al.add(null);
		al.add(10.6);
		al.add(12);
		al.add(true);
		System.out.println(al);
		System.out.println(al.size());//6
		al.add(4,"raya");
		System.out.println(al);
		al.remove(null);
		
		System.out.println(al);
		al.isEmpty();
		System.out.println(al);
	}

}
