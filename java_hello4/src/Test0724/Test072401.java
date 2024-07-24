package Test0724;

import java.util.Scanner;

class Circle {
	private int radius;

	Circle(int radius) {
		this.radius = radius;
	}

	double getArea() {
		return radius * radius * Math.PI;
	}

}

public class Test072401 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("원의 반지름을 입력하시오 : ");
			int radius = sc.nextInt();

			Circle circle = new Circle(radius);
			System.out.println("원의 넓이는 " + circle.getArea());

			System.out.println("계속하시겠습니까? y,n");
			String quit = sc.next();

			if (quit.equals("Y") || quit.equals("y")) {
				continue;
			} else {
				break;
			}

		}
		System.out.println("프로그램을 종료합니다.");
	}

}
