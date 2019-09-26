package day1;

import java.util.HashSet;

public class HashSettoArray {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("Atr1");
		hs.add("Str2");
		hs.add("Str3");
		System.out.println("Before converting:" + hs);
		String[] arr = new String[hs.size()];
		hs.toArray(arr);
		for (String s : arr) {
			System.out.println(s);
		}
	}

}