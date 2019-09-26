package day1;

public class Patt5 {

	public static void pat(int n) {

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i - 1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
