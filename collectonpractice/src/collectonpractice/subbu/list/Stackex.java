package collectonpractice.subbu.list;

import java.util.Stack;

public class Stackex {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.add("e");
		s.push("s");
		s.push("l");
		System.out.println(s.capacity());
		System.out.println(s);
		s.pop();
		
		System.out.println(s);
		System.out.println(s.capacity());
		
	}

}
