package day_2024_07_30;


/*	
 * 다형성, 함수 오버라이딩 응용
 * 
 */

class Dance{
	public static final String arrDance = null;

	public void dance() {
		System.out.println("춤을 춥니다");
	}
}

class PersonDance extends Dance{
	
	@Override
	public void dance() {
		System.out.println("사람이 춤을 춥니다");
	}
}

class RobotDance extends PersonDance{
	
	@Override
	public void dance() {
		System.out.println("로봇이 춤을 춥니다");
	}
}

class AIDance extends RobotDance{
	
	@Override
	public void dance() {
		System.out.println("AI가 춤을 춥니다");
	}
}

class Shape{
	
	//더미 함수(오버라이딩시키기위해 억지로만든 함수)
	public double getArea() {
		return 0;
	}
}

//부모 클래스 생성했는데 더미 함수로 인해 의미없는 함수 생성하지 않고 아래 interface로 구현하는데 메소드 몸체없는없다
//아래 자식 클래스에서 함수 구현해 주어야함
interface IShape{
	public double getArea();	
}

class Circle extends Shape{
	public double r;
	
	public Circle (double r) {
		this.r = r;
	}
	
	public double getArea() {
		return r * r * Math.PI;
	}
}

class Rectangle extends Shape{
	public double width, height;
	
	public Rectangle (double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
}

class Triangle extends Shape{
	public double width, height;
	
	public Triangle (double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height / 2;
	}
}

public class PolymorphismMain {

	public static void main(String[] args) {

		Dance dance = new PersonDance();
		dance.dance();
		
		dance = new RobotDance();
		dance.dance();
		
		dance = new AIDance();
		dance.dance();
		
		Dance[] arrDance = {new PersonDance(), new RobotDance(), new AIDance()};
		
		for(Dance dan : arrDance) {
			dan.dance();
		}
		
		Circle circle = new Circle(5);
		Rectangle rec = new Rectangle(5, 5);
		
		double area = circle.getArea() + rec.getArea();
		System.out.println(area);
		
		
		/////////////////////////////////////////////////////////////////////////////
		
		
		
		Shape[] arrShape = {new Circle(5), new Rectangle(5, 5), new Triangle(10, 5)};
		
		area = 0;
		for(Shape shape : arrShape) {
			area = area + shape.getArea();
		}
		
		System.out.println(area);
		
		
		
		
		
	}

}
