package day_2024_07_23;

import java.util.Scanner;

public class InputMain {
	
	public static void main(String[] args) {
		//키보드
		
		Scanner sc = new Scanner(System.in); //입력 기능을 가진 클래스
		
//		System.out.println("국어");
//		int kor = sc.nextInt();		//제어권이 키보드로 넘어가 있음
//		System.out.println("영어");
//		int eng = sc.nextInt();
//		System.out.println("수학");
//		int math = sc.nextInt();
//		
//		System.out.println("국어 : " + kor);
//		System.out.println("영어 : " + eng);
//		System.out.println("수학 : " + math);
		
		System.out.print("문자열 입력: ");
		String str1 = sc.nextLine();		//문자열 전체를 받음
		
		System.out.print("문자열 입력: ");
		String str2 = sc.next();			//단어만 받음
		
		System.out.printf("입력된 문자열 1 : %s \n", str1);
		System.out.printf("입력된 문자열 2 : %s \n", str2);
	}
}
