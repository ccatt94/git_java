
public class NumberRangeOR {

	public static void main(String[] args) {

		int num1 = 33;
		boolean result;
		
		result = (num1 % 2 == 0) || (num1 % 3 == 0);
		System.out.println("2의 배수 또는 3의 배수? \n" + result);
		
		
	}

}
