package com.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test13 {

	public static void main(String[] args) {

		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Gajanan");
		arr.add("umesh");
		arr.add("ajinkya");
		
		ListIterator<String> litr=arr.listIterator();
		litr.add("mayur");
		
		while(litr.hasNext())
		{
			String s=litr.next();
			if(s.equals("Gajanan"))
				litr.remove();
			if(s.equals("umesh"))
				litr.set("shreya");
		}
		System.out.println(arr);
	}
	
	
	
}
