package com.collection;

import java.util.Iterator;
import java.util.Vector;

public class Test14 {

	public static void main(String[] args) {

		Vector<Integer> v=new Vector<Integer>();
		for(int i=1;i<=30;i++)
		{
			v.add(i);
			
		}
	   System.out.println(v); 
	   Iterator<Integer>itr=v.iterator();
	   while(itr.hasNext())
	   {
		 Integer i=  itr.next();
		   if(i%2!=0)
		   {
			  System.out.println(i);
		   }else {
			   itr.remove();
		   }
	   }
	   System.out.println(v);
	}
	
	
  	  

}
