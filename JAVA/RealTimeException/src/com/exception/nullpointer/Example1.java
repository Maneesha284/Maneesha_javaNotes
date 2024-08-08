package com.exception.nullpointer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Example1 {

	public static void main(String[] args) {

		Product p1 = new Product(11, "anu");
		Product p2 = new Product(22, "fgg");
		Product p3 = new Product(33, "klj");
		Product p4 = null;
		Product p5 = new Product(567, "gfkgj");
		List l = new ArrayList();
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
		l.add(p5);

//		Iterator iterator = l.iterator();
//		while (iterator.hasNext()) {
//			Product p = (Product) iterator.next();
//			System.out.println(p.getPno() + " " + p.getPname());
//		}

		Iterator iterator = l.iterator();
		while(iterator.hasNext()) {
			Optional<Product> p = Optional.ofNullable((Product) iterator.next());
			if(p.isPresent())
				System.out.println(p.get());
			else
				System.out.println("product is not present");
		}

	}

}
