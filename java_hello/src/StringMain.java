
public class StringMain {

	public static void main(String[] args) {
		String name = "홍길동";
		
		String name2 = new String("AAA");
		
		System.out.println(name);
		System.out.println(name2);
		
		
		
		String str1 = "Happy";
		String str2 = "Birthday";
		
		System.out.println(str1 + " " + str2);
		
		printString(str1);
		printString(str2);
	}
	
	public static void printString(String str) {
		System.out.println(str);
	}

}
