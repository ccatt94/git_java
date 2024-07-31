package Test0731;

class Shape{
	public double getArea() {
		return 0;
	}
}

class Circle extends Shape{
	public int radius;
	
	public Circle(int r){
		this.radius = r;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
}

class Rectangle extends Shape{
	public int width, height;
	
	public Rectangle(int width, int height){
		this.width = width;
		this.height  = height;
	}
	
	public double getArea() {
		return width * height;
	}
	
}

class Triangle extends Shape{
	public int width, height;
	
	Triangle(int width, int height){
		this.width = width;
		this.height  = height;
	}
	
	public double getArea() {
		return width * height / 2.0;
	}
	
}

public class Test073101 {

	public static void main(String[] args) {
		
		Shape[] arrShape = {new Circle(5),new Rectangle(5,5),new Triangle(10, 5)};
        double area = 0;
        for (Shape shape : arrShape) {
                area = area + shape.getArea();
        }
        System.out.println(area);
        
        
	}

}
