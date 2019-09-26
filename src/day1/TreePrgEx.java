package day1;

import java.util.Map;
import java.util.TreeMap;

public class TreePrgEx {

	public static void main(String[] args) {

		Map m = new TreeMap();
		m.put(0, 6);
		try {
			m.put("Str1", 152);
		} catch (Exception e) {
			System.out.println("Cannot add String for key value");
		}
		m.put(1, 7);
		m.put(2, "sTR");
		m.put(1, 37);

		System.out.println(m);

	}

}