package collection;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		ll.add(500);
		ll.addFirst(50);
		ll.addLast(550);
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		ll.removeFirst();
		ll.removeLast();

	}

}
