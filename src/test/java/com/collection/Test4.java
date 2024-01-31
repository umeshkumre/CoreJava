package com.collection;

import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
  
		ArrayList <Integer>a1=new ArrayList<Integer>();
		a1.add(10);
		ArrayList <Integer>a2=new ArrayList<Integer>(a1);
		a2.add(30);
		System.out.println(a2);
		
		ArrayList <Integer>b1=new ArrayList<Integer>();
		b1.add(200);
		b1.add(100);
		ArrayList <Integer>b2=new ArrayList<Integer>();
		b2.add(800);
		ArrayList <Integer>b3=new ArrayList<Integer>();
		b3.add(29);
		b3.addAll(b1);
		b3.addAll(b2);
		System.out.println(b3);
		
		
	}

}
