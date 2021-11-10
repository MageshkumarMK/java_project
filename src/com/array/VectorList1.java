package com.array;

import java.util.List;
import java.util.Vector;

public class VectorList1 {
	public static void main(String[] args) {
		List<Object> a = new Vector<Object>();
		// add
		a.add(98767);
		a.add('V');
		a.add("List");
		System.out.println("VectorList is" + a);
		// size
		int z = a.size();
		System.out.println("the size of index " + z);
		// get
		Object q = a.get(0);
		System.out.println("byusing get" + q);
		// set
		Object w = a.set(0, 19);
		System.out.println("the old value of a[0] is " + w);
		System.out.println("Changed VectorList is" + a);
		// remove
		Object mk = a.remove(1);
		System.out.println(mk);
		System.out.println(a);
		// indexOf
		int l = a.indexOf("List");
		System.out.println(l);
		// contains
		boolean qi = a.contains(19);
		System.out.println(qi);
		// clear
		// a.clear();
		// System.out.println(a);
		// addAll
		List<Object> b = new Vector<Object>();
		b.add(34567);
		b.add('M');
		b.add("VectorListAdd");
		boolean u = a.addAll(b);
		System.out.println(a);
		System.out.println(u);
		// retainAll
		boolean t = a.retainAll(b);
		System.out.println(a);
		System.out.println(t);
		//removeAll
		boolean o=a.removeAll(b);
		System.out.println(o);
		System.out.println(a);

	}
}
