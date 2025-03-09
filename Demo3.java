package Day4Practice;

import java.util.Iterator;
import java.util.Vector;

public class Demo3 {
	public static void main(String[] args) {

		Vector<String> v = new Vector();
		v.add("Shivam");
		v.add("Ravi");
		v.add("Seema");
		v.add("Veena");
		v.add("sAiM _AlAtMaN");
		System.out.println(v);
		System.err.println("-------");
		System.out.println("Enter Name");
		Iterator<String> itr = v.iterator();
		System.out.println("Brother AnD SiStEr");
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}
}
