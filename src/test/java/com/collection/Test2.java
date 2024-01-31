package com.collection;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
      
    	   ArrayList<Emp> al=new ArrayList<Emp>();
    	   al.add(new Emp(123,"sagar"));
    	   al.add(new Emp(122,"gaja"));
    	   
    	   for(Emp e:al)
    	   {
    		   System.out.println(e.eid+"------"+e.ename);
    	   }
    	   
    	   Emp ee=al.get(0);
    	   System.out.println(ee.eid+"------"+ee.ename);
	}

}
