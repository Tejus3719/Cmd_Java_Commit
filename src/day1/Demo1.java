package day1;

public class Demo1 {

	public static void main(String[] args) {

		F f1 = new F();
		System.out.println(f1.i);
		System.out.println(f1.l);
		System.out.println(f1.b);

		F f2 = new F(100);
		System.out.println(f2.i);
		System.out.println(f2.l);
		System.out.println(f2.b);

		F f3 = new F(200l);
		System.out.println(f3.i);
		System.out.println(f3.l);
		System.out.println(f3.b);

		F f4 = new F((byte) 100);
		System.out.println(f4.i);
		System.out.println(f4.l);
		System.out.println(f4.b);

	}

}
