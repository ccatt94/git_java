package day_240731;

interface Shape { 
	final double PI = 3.14; // 상수 
    void draw(); 			// 도형을 그리는 추상 메소드 
    double getArea(); 	// 도형의 면적을 리턴하는 추상 메소드 
    default public void redraw() {
	System.out.print("--- 다시 그립니다. ");
 	draw();
    }
 }

class Circle1 implements Shape{

	public int r;
	
	public Circle1(int r) {
		this.r = r;
	}
	
	@Override
	public void draw() {}

	@Override
	public double getArea() {
		return r * r * Math.PI;
	}
	
}

public class ShapeInterfaceMain {

	public static void main(String[] args) {
		
		Shape donut = new Circle1(10); // 반지를이 10인 원 객체 
	    donut.redraw();  
		System.out.println("면적은 "+ donut.getArea());


	}
}