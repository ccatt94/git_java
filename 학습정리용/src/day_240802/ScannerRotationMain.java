package day_240802;

import java.util.Scanner;

public class ScannerRotationMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어, 한글 모두 됩니다.");
		String input = sc.nextLine();

		for (int i = 0; i <= input.length(); i++) {
			for (int j = i; j < input.length(); j++) {
				System.out.print(input.substring(j, j+1));
			}
			for (int j = 0; j < i; j++) {
				System.out.print(input.substring(j, j + 1));
			}
			System.out.println();
		}

	}
}