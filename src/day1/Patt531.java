package day1;

public class Patt531 {

	public static void patt() {
		for (int i = 0; i < 3; i++) {
			for (int s = 0; s < i; s++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 5 - i * 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		patt();
	}

}