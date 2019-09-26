package day1;

public class Demo2G {

	public static void main(String[] args) {

		G g1=new G(100,200);
		System.out.println(g1.i);
		System.out.println(g1.j);
		System.out.println("-------");
		
		G g2=new G("Star",20);
		System.out.println(g2.i);
		System.out.println(g2.a);
		System.out.println(g2.b);
		System.out.println(g2.j);
		System.out.println(g2.l);
		System.out.println("-------");
		
		G g3=new G(20,"Super");
		System.out.println(g3.i);
		System.out.println(g3.a);
		System.out.println(g3.b);
		
		}
		
	}
