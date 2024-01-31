package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Test11 {

	public static void main(String[] args) {

		ArrayList <String>ar=new ArrayList<String>(); 
		ar.add("ramesh");
		ar.add("pavan");
		ar.add("navin");
		ar.add("vedant");
		
		Iterator<String> itr=ar.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println(s);
			
			
			if(s.equals("pavan"))
			{
				itr.remove();
			}
		}
		System.out.println("------------------------");
		System.out.println(ar);
	}

}
