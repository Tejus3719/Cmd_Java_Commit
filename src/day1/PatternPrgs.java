package day1;

public class PatternPrgs {

	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {
			for (int s = 1; s <= i - 1; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}