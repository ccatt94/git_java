package day_240723;

import java.util.Scanner;

class Money {
	private int money;

	Money(int money) {
		this.money = money;
	}

	void show() {

		int m50000, m10000, m5000, m1000, m500, m100;
		int tMoney;

		m50000 = money / 50000;
		tMoney = money % 50000;
		System.out.println("오만원 : " + m50000 + "장");

		m10000 = tMoney / 10000;
		tMoney = tMoney % 10000;
		System.out.println("만원 : " + m10000 + "장");

		m5000 = tMoney / 5000;
		tMoney = tMoney % 5000;
		System.out.println("오천원 : " + m5000 + "장");

		m1000 = tMoney / 1000;
		tMoney = tMoney % 1000;
		System.out.println("천원 : " + m1000 + "장");

		m500 = tMoney / 500;
		tMoney = tMoney % 500;
		System.out.println("오백원 : " + m500 + "개");

		m100 = tMoney / 100;
		tMoney = tMoney % 100;
		System.out.println("백원 : " + m100 + "개");
	}
}

public class CurrencyMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int total;

		while (true) {
			System.out.print("머니 : ");
			total = sc.nextInt();

			Money money = new Money(total);
			money.show();

			System.out.println("계속하시겠습니까? y,n");
			String quit = sc.next();

			if (quit.equals("Y") || quit.equals("y"))
				continue;
			else
				break;
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
