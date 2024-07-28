package homework_240728;

import java.util.Scanner;

public class WhileScannerBankAccount {

	public static void main(String[] args) {

		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");

			int num = sc.nextInt();

			if (num == 1) {
				System.out.print("예금액> ");
				balance += sc.nextInt();
				System.out.println("");

			} else if (num == 2) {
				System.out.print("출금액> ");
				balance -= sc.nextInt();
				System.out.println("");

			} else if (num == 3) {
				System.out.println("잔고> " + balance);
				System.out.println("");

			} else {
				System.out.println("");
				break;
			}

		}
		
		System.out.println("프로그램 종료");
	}

}
