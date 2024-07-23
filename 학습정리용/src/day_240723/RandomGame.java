package day_240723;

import java.util.Scanner;

public class RandomGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int randInt = (int) (Math.random() * 50) + 1;
		System.out.println("테스트용 랜덤숫자 : " + randInt);

		int chance = 5;
		while (chance > 0) {

			System.out.println("숫자를 입력해주세요");
			int num = sc.nextInt();

			if ((randInt < num) && (chance > 1)) {
				chance--;
				System.out.println("DOWN!! 기회가 " + chance + "번 남았습니다.");

			} else if ((randInt > num) && (chance > 1)) {
				System.out.println("UP!! 기회가 " + chance + "번 남았습니다.");

			} else if (randInt != num) {
				System.out.println("실패하였습니다. 정답은 " + randInt + "입니다.");
				break;

			} else {
				System.out.println("정답입니다.");
				break;
			}

		}

	}

}
