package day_240725;

import java.util.Scanner;

public class CountConsonantVowl {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("입력하시오.");

		String input = sc.nextLine();

		int total = 0;
		int consonants = 0;
		int vowels = 0;

		for (int a = 0; a < input.length(); a++) {
			char i = input.charAt(a);

			if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
				vowels++;
			} else
				consonants++;
			total++;
		}
		System.out.println("총 글자 수는 " + total + "개 입니다.");
		System.out.println("모음은 : " + vowels + "개 입니다.");
		System.out.println("자음은 : " + consonants + "개 입니다.");

	}
}