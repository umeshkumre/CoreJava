package com.collection;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
    
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(new Emp(123,"umesh"));
		al.add(new Student(111,"ajinkya"));
		al.add("umesh");
		al.add(100);
		al.add(true);
		System.out.println(al);
		System.out.println(al.toString());
		
		
		for(Object o:al)
		{
			if(o instanceof Emp)
			{
				Emp e=(Emp)o;
				System.out.println(e.eid+"---" +e.ename);
			}if(o instanceof Student)
			{
				Student s=(Student)o; 
				System.out.println(s.sid+"---"+s.sname);
			}if(o instanceof Integer)
			{
				System.out.println(o);
			}if(o instanceof Boolean)
			{
				System.out.println(o);
			}
		}
	
	}
}
