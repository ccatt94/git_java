package day_2024_07_23;

import java.util.Scanner;

class Circle{
	private double rad;
	
	public Circle(double rad) {
		this.rad = rad;
	}
	
	public double getArea() {
		return rad * rad * Math.PI;
	}
}

public class CircleScannerMain {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			double radius;

			System.out.print("원의 반지름을 입력하시오: ");
			radius = sc.nextDouble();

			Circle circle = new Circle(radius);
			System.out.println("원의 넓이는 " + circle.getArea());
			System.out.println("계속하시겠습니까? y,n");

			String quit = sc.next();

			if (quit.equals("Y") || quit.equals("y"))
				continue;
			else {
				break;
			}

		}
		System.out.println("프로그램이 종료 되었습니다.");

	}

}
