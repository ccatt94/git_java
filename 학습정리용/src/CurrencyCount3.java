
public class CurrencyCount3 {

	public static void main(String[] args) {
		int total = 126500;
		
		System.out.println("오만원 : " + (total / 50000) + "장");	
		total = total % 50000;

		System.out.println("만원 : " + (total / 10000) + "장");
		total = total % 10000;

		System.out.println("오천원짜리 : " + (total / 5000) + "장");
		total = total % 5000;

		System.out.println("천원짜리 : " + (total / 1000) + "장");
		total = total % 1000;

		System.out.println("오백원짜리 : " + (total / 500) + "개");
		total = total % 500;

		System.out.println("백원짜리 : " + (total / 100) + "개");

	}

}