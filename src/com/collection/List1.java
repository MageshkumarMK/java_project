package com.collection;

import java.util.LinkedList;
import java.util.List;

public class List1 {
	public static void main(String[] args) {
		List<Object> l = new LinkedList<Object>();
		// add
		l.add(87687);
		l.add("java");
		l.add(876.876);
		l.add('A');
		System.out.println(l);
		// size
		int s = l.size();
		System.out.println(s);
		// get
		Object o = l.get(0);
		System.out.println(o);
		// set
		Object p = l.set(0, 9999);
		System.out.println(p);
		System.out.println(l);
		// get
		Object oi = l.get(0);
		System.out.println(oi);
		// remove
		Object re = l.remove(3);
		System.out.println(re);
		System.out.println(l);
		// indexOf
		int xr = l.indexOf("java");
		System.out.println(xr);
		// contains
		boolean ct = l.contains('A');
		System.out.println(ct);
		// clear
		 //l.clear();
		// System.out.println(l);
		// addAll
		List<Object> l2 = new LinkedList<Object>();
		l2.add(345678);
		l2.add('M');
		l2.add("Suits");
		boolean ax = l.addAll(l2);
		System.out.println(ax);
		System.out.println(l);
		// retainAll
		boolean xl = l.retainAll(l2);
		System.out.println(xl);
		System.out.println(l);
		//removeAll
		boolean rr=l.removeAll(l2);
		System.out.println(rr);
		System.out.println(l);

	}
}
