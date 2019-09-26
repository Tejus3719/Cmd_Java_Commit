package day1;

public class Patt4 {

	public static void main(String[] args) {

		int a = 1;
		for (int i = 0; i < 3; i++) {
			for (int s = 0; s < 3 - i - 1; s++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 2; i++) {
			for (int s1 = 0; s1 < i + 1; s1++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 3 - i * 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}