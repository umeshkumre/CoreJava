package com.collection;

public class Emp2 implements Comparable<Emp2>{
	  
		int eid;
		String ename;
		public Emp2(int eid, String ename) {
			super();
			this.eid = eid;
			this.ename = ename;
		}
		
		public int compareTo(Emp2 e) {
	       return ename.compareTo(e.ename);
			
		}

	}



