package day1;

public class ReverseStr {
	
	public static String reverseRecursively(String str) {

        if (str.length() < 2) {
            return str;
        }
        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }
public static void main(String[] args) {
	System.out.println(reverseRecursively("Teeth is strong"));
}
}
