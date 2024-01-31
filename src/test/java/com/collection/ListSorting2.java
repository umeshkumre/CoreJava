package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ListSorting2 {

	public static void main(String[] args) {

		ArrayList<Emp2> al=new ArrayList<Emp2>();
		al.add(new Emp2(333,"Gajanan"));
		al.add(new Emp2(222,"Esha"));
		al.add(new Emp2(111,"Sachin"));
		al.add(new Emp2(444,"Mayur"));
		al.add(new Emp2(666,"Amar"));
		
		Collections.sort(al);
		
		for(Emp2 e:al)
		{
			System.out.println(e.eid+"---"+e.ename);
		}
	}

}
