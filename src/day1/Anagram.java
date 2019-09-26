package day1;

public class Anagram {

	public static boolean isAnagram(String word, String anagram) {
		if (word.length() != anagram.length()) {
			return false;
		}
		char[] chars = word.toCharArray();
		for (char c : chars) {
			int index = anagram.indexOf(c);
			if (index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			} else {			
				return false;
			}
		}
		return anagram.isEmpty();
	}

	public static void main(String[] args) {
		
		boolean b=isAnagram("mary", "armys");
		if(b==true){
			System.out.println("Both strings are Anagram");
		}else
				System.out.println("Strings are not Anagram");
		
	}
}
