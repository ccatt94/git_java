
public class CurrencyCount2 {

	public static void main(String[] args) {
		int total = 126500;
		
		int m50000 = total / 50000;
		int tmp = total % 50000;
		System.out.println("오만원 : " + m50000 + "장");		
		
		int m10000 = tmp / 10000;
		tmp = tmp % 10000;
		System.out.println("만원 : " + m10000 + "장");
		
		int m5000 = tmp / 5000;
		tmp = tmp % 5000;
		System.out.println("오천원짜리 : " + m5000 + "장");
		
		int m1000 = tmp / 1000;
		tmp = tmp % 1000;
		System.out.println("천원짜리 : " + m1000 + "장");
		
		int m500 = tmp / 10000;
		tmp = tmp % 10000;
		System.out.println("오백원짜리 : " + m500 + "개");
		
		int m100 = tmp / 10000;
		tmp = tmp % 10000;
		System.out.println("백원짜리 : " + m100 + "개");
	}

}