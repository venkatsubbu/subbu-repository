package collectonpractice.subbu.list;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		int i=0;
		ArrayList al=new ArrayList();
		al.add("a");
		al.add("d");	
		for( i=0;i<=10;i++) {
			al.add("i");
		}
		
		System.out.println(al);
			System.out.println(al);
			al.remove(4);
			System.out.println(al);
			al.hashCode();
			System.out.println(al);
			al.get(6);
			System.out.println(al);
			
	}
}

