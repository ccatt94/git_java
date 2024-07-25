package day_2024_07_25;

public class ImmnutableStringMain {

	public static void main(String[] args) {

		String str1 = "Simple String";
		String str2 = "Simple String";

		String str3 = new String("Simple String");
		String str4 = new String("Simple String");

		
		// == 대입연산자는 주소값을 비교함
		if (str1 == str2) // static 변수와 같게 쓰임, 그래서 주소값을 공유하기 때문에
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		else
			System.out.println("str1과 str2는 다른 인스턴스 참조");

		if (str3 == str4) // 주소값이 서로 다름(객체를 각각 만들어서)
			System.out.println("str3과 str4는 동일 인스턴스 참조");
		else
			System.out.println("str3과 str4는 다른 인스턴스 참조");

		if(str1.equals(str3)) // equal()함수는 문자열을 비교함
			System.out.println("안에 있는 글자가 같습니다.");
		else
			System.out.println("글자가 다릅니다.");
		
	}
}
