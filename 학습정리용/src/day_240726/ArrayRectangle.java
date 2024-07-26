package day_240726;

import java.util.Arrays;
import java.util.Scanner;

class Rectangle{
	int width, height;
	
	Rectangle(int w, int h){
		this.width = w;
		this.height = h;
	}
	
	int getArea() {
		return width * height;
	}
	
//	double getAreaSum(int rec[], int w, int h) {
////		return 
//	}
}

public class ArrayRectangle {

	public static void main(String[] args) {

		Rectangle[] rec = new Rectangle[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < rec.length; i++) {
		System.out.println(i + "번째 사각형의 가로 세로를 적으시오.");
		System.out.print("가로 : ");
		int width = sc.nextInt();
		
		System.out.print("세로 : ");
		int height = sc.nextInt();
		
		rec[i] = new Rectangle(width, height);
		}

	}
}