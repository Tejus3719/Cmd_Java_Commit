package day1;

public class Pattern1 {

	public static int patt1(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		return 0;
	}

	public static void main(String[] args) {
		Pattern1 p1 = new Pattern1();
		System.out.println(p1.patt1(5));
		System.out.println("pattern2");
		int k = 1;
		for (int i = 1; i <= 4; i++) {
			for (int s = 1; s <= 4 - i - 1; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
	}

}