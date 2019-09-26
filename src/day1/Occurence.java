package day1;

import java.util.HashMap;
import java.util.Map;

public class Occurence {

	public static void occStr(String s) {

		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		char[] strArray = s.toCharArray();

		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		System.out.println("String is: " + s);
		System.out.println("Number of characters: " + charCountMap);
	}

	public static void main(String[] args) {

		occStr("all the best");
		occStr("oooaaaoouueetts");
		occStr("halloohdjhdhdjdhjdh");
	}

}