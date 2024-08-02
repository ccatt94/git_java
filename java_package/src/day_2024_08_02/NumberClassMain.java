package day_2024_08_02;

public class NumberClassMain {
	public static void main(String[] args){
		
		// 다형성-오버라이딩 적용
		Integer num1 = new Integer(29);
		System.out.println(num1.intValue());
		System.out.println(num1.doubleValue());
		
		Double num2 = new Double(3.14);
		System.out.println(num2.intValue());
		System.out.println(num2.doubleValue());
		
		// 클래스 메소드를 통한 인스턴스 생성 방법 두 가지
		Integer n1 = Integer.valueOf(5);
		Integer n2 = Integer.valueOf("1024");
		
		// 대소 비교와 합을 계산하는 클래스 메소드
		System.out.println("큰 수: " + Integer.max(n1, n2));
		System.out.println("작은 수: " + Integer.min(n1, n2));
		System.out.println("합: " + Integer.sum(n1, n2));
		System.out.println();
		
		// 정수에 대한 2진, 8진, 16진수 표현 결과를 반환하는 클래스 메소드
		System.out.println("12진 2진 표현: " + Integer.toBinaryString(12));
		System.out.println("12진 8진 표현: " + Integer.toOctalString(12));
		System.out.println("12진 16진 표현: " + Integer.toHexString(12));
	}
}
