
public class MidValue {

	public static void main(String[] args) {

		int num1 = 90;
		int num2 = 70;
		int num3 = 100;
		
		int mid;
		
		if((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
			mid = num1;
		}else if((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
			mid = num2;
		}else {
			mid = num3;
		}
		
		System.out.println("mid값 : " + mid);
		
	}

}
