package day_2024_08_07;

import java.util.ArrayList;
import java.util.List;

class Circle{
	private double radius;
	
	public Circle(double r) {
		radius = r;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	
	}
}


public class ArrayListExampleMain {

	public static void main(String[] args) {
		
		//반지름이 10, 20, 30인 원 넓이의 합을 구하시오.
		
		List<Circle> circleList = new ArrayList<>(); 
		
		circleList.add(new Circle(10));
		circleList.add(new Circle(20));
		circleList.add(new Circle(30));
		
		double sum=0;
		
		for(Circle cir : circleList) {
			sum += cir.getArea();
		}
		System.out.println(sum);
		
		
	}
}
