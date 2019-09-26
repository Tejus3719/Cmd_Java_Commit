package day1;

public class WrapperEx {
	
	public static void main(String[] args) {
		
		int i=10;
		System.out.println(i);
		
		Integer intObj=new Integer(i);
		System.out.println(intObj);
		
		//Boxing operation
		
		Integer intObj1=new Integer(100);
		System.out.println(intObj1);
		
		Integer iOb2=new Integer("200");
		System.out.println(iOb2);
		
		Integer io3=300;
		System.out.println(io3);
		
	}

}