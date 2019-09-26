package day1;

public class D {
	int id;
	String name;

	D(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		D n = new D(1, "name");
		System.out.println(n);

	}
}
