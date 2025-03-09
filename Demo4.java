package Day4Practice;

import java.util.Iterator;
import java.util.Vector;

public class Demo4 {
	public static void main(String[] args) {
		Vector<String> v = new Vector();
		v.add("Seema");
		v.add("Ravi");
		v.add("shivam");
		v.add("Veena");
		System.out.println(v);
		for (Object o : v) {
			System.out.println(o);
		}
		Iterator<String> itr = v.iterator();
		System.out.println("brother sister");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		for (String s : v) {
			System.out.println(s);
		}
	}
}
