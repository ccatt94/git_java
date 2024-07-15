
public class CurrencyCount {

	public static void main(String[] args) {
		int total = 126500;
		
		int m50000 = total / 50000;
		int m10000 = (total % 50000) / 10000;
		int m5000 = (total % 50000) % 10000 / 5000;
		int m1000 = (total % 50000) % 10000 % 5000 / 1000;
		int m500 = (total % 50000) % 10000 % 5000 % 1000 / 500;
		int m100 = (total % 50000) % 10000 % 5000 % 1000 % 500 / 100;
		
		System.out.println("오만원 : " + m50000 + "장");
		System.out.println("만원 : " + m10000 + "장");
		System.out.println("오천원짜리 : " + m5000 + "장");
		System.out.println("천원짜리 : " + m1000 + "장");
		System.out.println("오백원짜리 : " + m500 + "개");
		System.out.println("백원짜리 : " + m100 + "개");
	}

}