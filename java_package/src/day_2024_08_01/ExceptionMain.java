package day_2024_08_01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
		try {
			System.out.println(7 / 2);
//			System.out.println(7 / 0); // 에러 만나는 자리이므로 원래는 밑에 코드는 실행되지 않지만 에러를 catch문으로 잡아 catch문 밑에 코드 마져 실행 가능
			System.out.println("숫자를 넣으세요");
			int a = sc.nextInt();
			
		} catch (InputMismatchException | ArithmeticException e) {
			e.printStackTrace(); // 에러문구 보이게 하는 함수
			System.out.println("에러입니다.");
//		} catch (ArithmeticException e) {
//			e.printStackTrace(); // 에러문구 보이게 하는 함수
//			System.out.println("에러입니다.");
		} finally { // 에러의 유무 상관없이 실행
			System.out.println("굿바이");
		}
		System.out.println("종료합니다");
		
		
		
		
		try {
			int num = 6 / 0;
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
