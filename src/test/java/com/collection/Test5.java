package com.collection;

import java.util.ArrayList;

public class Test5 {

	public static void main(String[] args) {
   
		Emp e1=new Emp(111,"ramesh");
		Emp e2=new Emp(555,"ganesh");
		Emp e3=new Emp(222,"shreya");
		Emp e4=new Emp(444,"gajajan");
		Emp e5=new Emp(77, "ram");
		Emp e6=new Emp(655,"vignesh");
		ArrayList<Emp> a1=new ArrayList<Emp>();
		a1.add(e1);
		a1.add(e2);
		ArrayList<Emp> a2=new ArrayList<Emp>(a1);
		a2.add(e3);
		a2.add(e4);
		ArrayList<Emp> a3=new ArrayList<Emp>();
		a3.addAll(a2);
		a3.add(e5);
		a3.add(e6);
		System.out.println(a3.containsAll(a2));
		
		
		for(Emp e:a3)
		{
			System.out.println(e.eid+"-------"+e.ename);
		}
		
	}

}
