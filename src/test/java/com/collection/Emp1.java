package com.collection;

public class Emp1 implements Comparable{
	
	int eid;
	String ename;
	public Emp1(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	
	public int compareTo(Object o) {
       Emp1 e=(Emp1)o;
		if(eid==e.eid)
		{
		return 0;
		}
		else if(eid>e.eid)
		{
			return 1;
		}else
		{
			return -1;
		}
	}

}
