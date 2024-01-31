package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Test12 {

	public static void main(String[] args) {

		ArrayList<Book> ar=new ArrayList<Book>(); 
		ar.add(new Book(111,"2 state","umesh"));
		ar.add(new Book(222,"3 mistake of my life","gajanan"));
		ar.add(new Book(333,"rich dad poor dad","ajinkya"));
		
		Iterator<Book> itr=ar.iterator();
		while(itr.hasNext())
		{
			Book b=itr.next();
			System.out.println(b.bookid+"----"+b.bookname+"--------"+b.bookauthor);
		}
	}

}
