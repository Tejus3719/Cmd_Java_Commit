package day1;

import java.util.Scanner;

public class PrimeNo {

	public int[] nNum() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enetr" + n + "Elements:");
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		return ar;
	}

	public int pNum(int ar[]) {
		int pCount = 0;
		for (int i = 2; i < ar.length; i++) {
			if (ar[i] % i != 0) {
				System.out.println("Prime is:" + ar[i]);
				pCount++;
			}
		}
		return pCount;
	}

	public static void main(String[] args) {

		PrimeNo pn = new PrimeNo();
		int[] a = pn.nNum();
		int c = pn.pNum(a);
		System.out.println("Prime Nos: " + c);
	}

}