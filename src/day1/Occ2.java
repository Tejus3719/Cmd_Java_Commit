package day1;

import java.util.HashMap;
import java.util.Map;

public class Occ2 {

	public static void strOcc(String s) {
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] strArr = s.toCharArray();
		for (char c : strArr) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		System.out.println("String is: " + s);
		System.out.println("No of Occurence: " + hm);
	}

	public static void main(String[] args) {

		strOcc("halloooweennnn  ");
		strOcc("  ,   ,,','  ");
		strOcc("I love java programming");
	}

}