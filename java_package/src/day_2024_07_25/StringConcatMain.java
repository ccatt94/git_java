package day_2024_07_25;

public class StringConcatMain {

	public static void main(String[] args) {

		String st1 = "Coffee";
		String st2 = "Bread";
		
		String st3 = st1.concat(st2);
		System.out.println(st3);
		
		String st4 = "Fresh".concat(st3);
		System.out.println(st4);
		
		String str = "abcdefg";
		System.out.println(str.substring(2));
		System.out.println(str.substring(2, 4));
		
		String str1 = "abcdefg" + 100;
		System.out.println(str1);
		
	}
}
