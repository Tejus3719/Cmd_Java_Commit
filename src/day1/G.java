package day1;

public class G {
	int i, j;
	long l;
	String a, b;

	G(int u, int v) {
		i = u;
		j = v;
	}

	G(int x, long y) {
		i = x;
		l = y;
	}

	G(String s, int p) {
		a = s;
		i = p;
	}

	G(int m, String n) {
		i = m;
		a = n;
	}

}
