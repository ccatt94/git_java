package day_240801;

import java.util.Scanner;

abstract class Calc {
	protected int a;
	protected int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	abstract int calculate();
}

class Add extends Calc {
	public int calculate() {
		return a + b;
	}
}

class Sub extends Calc {
	public int calculate() {
		return a - b;
	}
}

class Mul extends Calc {
	public int calculate() {
		return a * b;
	}
}

class Div extends Calc {
	public int calculate() {
		if (b == 0) {
			System.out.println("잘못된 입력입니다.");
			return 0;
		} else {
			return a / b;
		}
	}
}

public class ScannerCalculatorMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int result = 0;
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int a = sc.nextInt(); // 5
		int b = sc.nextInt(); // 7
		String str = sc.next(); // +*-/

		char c = str.charAt(0);

		Calc cal;
		switch (c) {
		case '+':
			cal = new Add();
			break;
		case '-':
			cal = new Sub();
			break;
		case '*':
			cal = new Mul();
			break;
		case '/':
			cal = new Div();
			break;
		default:
			System.out.println("잘못된 연산자 입니다.");
			sc.close();
			return;
		}
		cal.setValue(a, b);
		result = cal.calculate();
		System.out.println(result);
		sc.close();

	}
}