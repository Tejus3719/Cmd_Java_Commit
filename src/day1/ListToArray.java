package day1;

import java.util.ArrayList;

public class ListToArray {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("Orange");
		al.add("Blue");
		al.add("Red");

		String arr[] = new String[al.size()];
		for (int j = 0; j < al.size(); j++) {
			arr[j] = (String) al.get(j);
		}
		for (String s : arr) {
			System.out.println(s);
		}

	}

}