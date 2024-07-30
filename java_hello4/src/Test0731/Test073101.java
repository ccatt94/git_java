package Test0731;

class Shape{
//	public double getArea(){
//		return 0;
//	}
}

class Circle extends Shape{
	private int radius;
	
	Circle (int radius){
		this.radius = radius;
	}
	
////	public double getArea(){
////		return radius * radius * Math.PI;
//	}
	
}

class Rectangle extends Shape{
	private int width, height;
	
	Rectangle (int width, int height){
		this.width = width;
		this.height = height;
	}
	
//	public double getArea(){
//		return width * height;
//	}
	
}

class Triangle extends Shape{
	private int width, height;
	
	Triangle (int width, int height){
		this.width = width;
		this.height = height;
	}
	
//	public double getArea(){
//		return width * height / 2;
//	}
	
}



public class Test073101 {

	public static void main(String[] args) {
		
		Shape[] arrShape = {new Circle(5),new Rectangle(5,5),new Triangle(10, 5)};
        double area = 0;
        for (Shape shape : arrShape) {
//                area = area + shape.getArea();
        }
        System.out.println(area);
        
        
	}

}
