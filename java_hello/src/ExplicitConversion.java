
public class ExplicitConversion {

	public static void main(String[] args) {
		double pi = 3.1415;
		int wholeNumber = (int)pi;
		
		System.out.println(wholeNumber);
		
		long num1 = 3000000007L;
		int num2 = (int)num1;
		
		System.out.println(num2);
		
		short num4 = 1;
		short num5 = 2;
		int num6 = num4 + num5;
		
		System.out.println(num6);
	}

}
