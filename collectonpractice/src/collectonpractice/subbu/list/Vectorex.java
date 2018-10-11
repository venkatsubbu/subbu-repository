package collectonpractice.subbu.list;

import java.util.Vector;

public class Vectorex {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("d");
		v.addElement("s");
		System.out.println("sariama");
		System.out.println(v);
        System.out.println(v.capacity());
		v.remove("d");
		
		for(int i=0;i<=10;i++) {
			v.addElement(i);
		System.out.println(v);
		}
		for(int j=10;j>=0;j--) {
			v.addElement(j);
			System.out.println(v);
		}
		System.out.println(v.capacity());
	}

}
