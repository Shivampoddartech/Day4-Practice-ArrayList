package Day4Practice;

import java.util.Vector;

public class Demo2 {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add(20.20);
		v.add("True");
		v.add("False");
		v.add(null);
		System.out.println(v);

		System.out.println("----------");

		for (Object o : v) {
			System.out.println(o);
		}
	}
}
