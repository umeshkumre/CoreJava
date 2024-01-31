package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CompSorting {

	public static void main(String[] args) {

		ArrayList<Emp> al=new ArrayList<Emp>();
		al.add(new Emp(222,"ramesh"));
		al.add(new Emp(444,"umesh"));
		al.add(new Emp(111,"amar"));
		al.add(new Emp(333,"ravet"));
		
		Collections.sort(al,new EnameComp());
		
		for(Emp e:al)
		{
			System.out.println(e.eid+"------"+e.ename);
		}
	}

}
