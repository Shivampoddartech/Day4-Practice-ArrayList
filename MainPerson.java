package Day4Practice;

import java.util.LinkedList;

public class MainPerson {
	public static void main(String[] args) {
		LinkedList<Person> ll = new LinkedList<Person>();
		ll.add(new Person("Shivam", 20));
		ll.add(new Person("Ravi", 26));
		for (Person p : ll) {
			System.out.println(p);
		}

	}
}
