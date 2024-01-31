package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ListSorting {

	public static void main(String[] args) {

		ArrayList<Emp1> al=new ArrayList<Emp1>();
		al.add(new Emp1(333,"umesh"));
		al.add(new Emp1(222,"esha"));
		al.add(new Emp1(111,"vedant"));
		al.add(new Emp1(444,"mayur"));
		
		Collections.sort(al);
		
		for(Emp1 e:al)
		{
			System.out.println(e.eid+"---"+e.ename);
		}
		
	}

}
