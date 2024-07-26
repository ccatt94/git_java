package day_2024_07_26;

import java.util.Scanner;

/*
1. 반지름이 10, 15, 7 인 원이 있다. 3원의 넓이의 합을 구하는 프로그램을 완성하시오.
배열 활용하기
*/

class Circle10 {

	private int radius;

	Circle10(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}
}

/*
 * 2. 가로세로가 (10,10) (17,89) (90,100)인 사각형이 있다. 각각의 넓이의 합을 구하는 프로그램 완성하시오. 배열활용
 * 3. 3개의 가로세로를 유저로 부터 입력받아 넓이 합 구하기.
 */

class Rectangle {
	private int width, height;

	public Rectangle(int w, int h) {
		this.width = w;
		this.height = h;
	}

	public int getArea() {
		return width * height;
	}
}

class RectangleUser{
	private int width, height;
	
	public RectangleUser(int w, int h){
		this.width = w;
		this.height = h;
	}
	
	public int getArea() {
		return width * height;
	}
}




public class ArrayExampleMain {

	public static void main(String[] args) {
		

		
		
		
		
		
		
		
		System.out.println("========================================================");
		
		RectangleUser[] arrRec1 = new RectangleUser[3];
		
		for(int i = 0; i < arrRec1.length; i++) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println(i + "번째 사각형의 가로 세로를 넣으세요");
			
			System.out.print("가로 : ");
			int width = sc.nextInt();
			
			System.out.print("세로 : ");
			int height = sc.nextInt();
			
			arrRec1[i] = new RectangleUser(width, height);
		}
		
		int area = 0;
		for (int i = 0; i < arrRec1.length; i++) {
			area += arrRec1[i].getArea();
		}

		System.out.println("세 직사각형의 넓이의 합 : " + area);
		
		
		
		
		System.out.println("========================================================");

		
		
		
		Rectangle[] arrRec = new Rectangle[3];

		arrRec[0] = new Rectangle(10, 10);
		arrRec[1] = new Rectangle(17, 89);
		arrRec[2] = new Rectangle(90, 100);

		int total = 0;
		for (int i = 0; i < arrRec.length; i++) {
			total += arrRec[i].getArea();
		}

		System.out.println("세 직사각형의 넓이의 합 : " + total);

		
		
		
		System.out.println("========================================================");


		
		
		Circle10[] arrCircle = new Circle10[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arrCircle.length; i++) {
			System.out.print(i + "번째 원의 반지름 : ");
			arrCircle[i] = new Circle10(sc.nextInt());
		}
		
		double sum1 = 0;
		for (int i = 0; i < arrCircle.length; i++)
			sum1 += arrCircle[i].getArea();

		System.out.println("세 원의 넓이의 합 : " + sum1);
		
		
		
		System.out.println("==========================================================");
		
		
		
//		Circle10[] arrCircle = {new Circle10(7), new Circle10(10), new Circle10(7)};
		
		arrCircle[0] = new Circle10(10);
		arrCircle[1] = new Circle10(15);
		arrCircle[2] = new Circle10(7);

		double sum = 0;
		for (int i = 0; i < arrCircle.length; i++)
			sum += arrCircle[i].getArea();

		System.out.println("세 원의 넓이의 합 : " + sum);

		
		
		
		System.out.println("==========================================================");

		
		
		
		
		String[] sr = new String[7];
		sr[0] = new String("Java");
		sr[1] = new String("System");
		sr[2] = new String("Compiler");
		sr[3] = new String("Park");
		sr[4] = new String("Tree");
		sr[5] = new String("Dinner");
		sr[6] = new String("Brunch Cafe");

		int cnum = 0;
		for (int i = 0; i < sr.length; i++)
			cnum += sr[i].length();

		System.out.println("총 문자의 수: " + cnum);

	}
}
