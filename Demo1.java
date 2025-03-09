package Day4Practice;

import java.util.LinkedList;

public class Demo1 {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();

		ll.add(10);
		ll.add(202.200);
		ll.add("True");
		ll.add("False");
		ll.add(null);
		ll.add("shivam");
		System.out.println(ll);
		System.out.println("----------------");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("----------------");
		for( int i = ll.size()-1; i>0; i--) {
			System.out.println(ll.get(i));
		}
		System.out.println("----------------");
		for(Object p : ll) {
			System.out.println(p);
			
		}
	}
}
