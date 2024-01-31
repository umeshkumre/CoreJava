package com.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Test6 {

	public static void main(String[] args) {
 
		String [] str= {"jayesh","ramesh","mangesh","shreya","janki"};
		
		ArrayList al=new ArrayList(Arrays.asList(str));
		System.out.println(al);
		
		ArrayList <String> a2=new ArrayList<String>();
		a2.add("aaa");
		a2.add("bbb");
		String[] ss=new String[a2.size()];
		a2.toArray(ss);
		//System.out.println(ss);
		for(String s:ss)
		{
			System.out.println(s);
		}
		
		ArrayList aa=new ArrayList();
		aa.add("rakesh");
		aa.add(true);
		aa.add(100);
		Object[] o=aa.toArray();
		for(Object oo:o)
		{
			System.out.println(oo);
		}
		
		
		
	}

}
