package Day4Practice;

public class AutoBoxing {
	public static void main(String[] args) {
		int a = 10;
		int b = a;
		System.out.println(a + " " + b);
		System.out.println("-----------------");
		int c = 10;
		double d = a;
		System.out.println(c + " " + d);
		System.out.println("-----------------");
		Integer e = 40;
		int f = e;
		System.out.println(e + " " + f);
	}
}
