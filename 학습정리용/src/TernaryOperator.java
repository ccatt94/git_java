
public class TernaryOperator {

	public static void main(String[] args) {
		
		int num1 = 90;
		int num2 = 70;
		int num3 = 100;
		int max;
		
		max = num1 > num2 ? num1 : num2;
		max = num3 > max ? num3 : max;
		
		System.out.println("max값은 : " + max);
		
	}

}
