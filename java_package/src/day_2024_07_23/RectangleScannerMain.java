package day_2024_07_23;

import java.util.Scanner;

class Rectangle1{
	private int w, h;
	
	public Rectangle1(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public int getArea() {
		return w * h;
	}
}

public class RectangleScannerMain {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int width, height;
			

			System.out.print("가로: ");
			width = sc.nextInt();
			
			System.out.print("세로: ");
			height = sc.nextInt();

			Rectangle1 rectangle = new Rectangle1(width, height);
			System.out.println("사각형의 넓이는 " + rectangle.getArea());
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
