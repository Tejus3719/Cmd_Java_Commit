package day1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Comparing2 {

	public static void main(String[] args) {

		List<Integer> l = new LinkedList<Integer>();
		l.add(23);
		l.add(30);
		System.out.println(l);

		List<Integer> al = new ArrayList<Integer>();
		al.add(23);
		al.add(30);
		System.out.println(al);

		if (l.equals(al)) {
			System.out.println("Equal");
		} else
			System.out.println("Not Equal");

		if (al.equals(l)) {
			System.out.println("Al = L");
		} else {
			System.out.println("Al!=L");
		}
	}
}