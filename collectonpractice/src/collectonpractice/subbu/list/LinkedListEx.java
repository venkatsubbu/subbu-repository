package collectonpractice.subbu.list;

import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("b");
		l.add("d");
		l.add("u");
		l.add("m");
		System.out.println(l);
		
		l.addFirst("k");
		l.addLast("s");
		l.element();
		System.out.println(l);
		l.remove();
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		l.removeFirst();
		l.add("d");
		System.out.println(l);
		l.removeFirstOccurrence("d");
		
		System.out.println(l);
		
	}

}
