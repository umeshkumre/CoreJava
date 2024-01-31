package com.collection;

import java.util.Stack;

public class Test15 {

	public static void main(String[] args) {

		Stack<Integer> s=new Stack<Integer>();
		s.add(111);
		s.add(222);
		s.add(333);
		s.add(444);
		s.add(55);
		System.out.println(s);
		System.out.println(s.peek());//55
				s.push(666);
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		System.out.println(s.contains(444));
		System.out.println(s.removeElement(111));
		System.out.println(s);
		System.out.println(s.empty());
		
	}

}
