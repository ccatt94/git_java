package day_240802;

import java.util.Scanner;

class Calculator {
	private int num1, num2;
	private String op;

	Calculator(int num1, int num2, String op) {
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}

	public void getResult() {
		if (op.equals("+")) {
			System.out.println("계산 결과 : " + (num1 + num2));
		} else if (op.equals("-")) {
			System.out.println("계산 결과 : " + (num1 - num2));
		} else if (op.equals("*")) {
			System.out.println("계산 결과 : " + (num1 * num2));
		} else if (op.equals("/")) {
			if (this.num2 == 0) {
				System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
			} else {
				System.out.println("계산 결과 : " + (num1 / num2));
			}
		}

	}
}

public class CalculatorMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("*** 계산기 ***");

			int num1 = 0;
			int num2 = 0;

			String operator = null;

			try {
				System.out.print("수1 : ");
				num1 = sc.nextInt();

				System.out.print("수2 : ");
				num2 = sc.nextInt();

				System.out.print("연산 : ");
				operator = sc.next();

				Calculator cal = new Calculator(num1, num2, operator);
				cal.getResult();
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
				sc.nextLine();
				continue;
			}

			if (!(num2 == 0 && operator.equals("/"))) {
				System.out.println("계속 하시겠습니까? 계속 : Y, 종료 : N");
				String quit = sc.next();

				if (quit.equalsIgnoreCase("y")) {
					continue;
				} else {
					System.out.println("종료입니다.");
					sc.close();
					return;
				}

			}
		}

	}
}