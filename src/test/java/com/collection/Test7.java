package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Test7 {

	public static void main(String[] args) {

		ArrayList<String> aa=new ArrayList<String> ();
		aa.add("rakesh");
		aa.add("shravani");
		aa.add("mayur");
		aa.add("pooja");
        System.out.println("before swapping"+aa);
        Collections.swap(aa, 1, 3);
        System.out.println("after swapping"+aa);
        

		ArrayList<String> a2=new ArrayList<String>(aa.subList(1, 3));
		System.out.println(a2);
  
		
	}
}
