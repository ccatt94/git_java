package day_240726;

import java.util.Scanner;

class Rectangle {
	int width, height;

	Rectangle(int w, int h) {
		this.width = w;
		this.height = h;
	}

	int getArea() {
		return width * height;
	}

}

public class ArrayRectangle {

	public static void main(String[] args) {

		Rectangle[] rec = new Rectangle[3];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < rec.length; i++) {
			System.out.println(i + "번째 사각형의 가로 세로를 적으시오.");
			System.out.print("가로 : ");
			int width = sc.nextInt();

			System.out.print("세로 : ");
			int height = sc.nextInt();

			rec[i] = new Rectangle(width, height);

		}

		int AreaSum = getAreaSum(rec);
		System.out.println("사각형들의 총 넓이 : " + AreaSum);
	}

	static int getAreaSum(Rectangle[] rec) {
		
		int AreaSum = 0;

		for (int i = 0; i < rec.length; i++) {
			AreaSum += rec[i].getArea();
		}
		
		return AreaSum;
	}

}