package day_240725;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		String input = sc.nextLine();

		System.out.print("출력 : ");
		for (int i = input.length() - 1; i >= 0; i--) {
			char Letter = input.charAt(i);
			System.out.print(input.charAt(i));

		}
	}
}