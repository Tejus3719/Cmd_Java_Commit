package day2;

import java.util.Scanner;

public class PrimeNo {
	public static boolean primeM(int num) {
		boolean flag = true;
		for (int i = 2; i < num; i++) {
			if (num % 2 == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {

		PrimeNo p = new PrimeNo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int b = sc.nextInt();
		boolean bn = p.primeM(b);
		if (bn == true) {
			System.out.println(b + " is Prime");
		} else {
			System.out.println(b + " is Not Prime");
		}

	}
}