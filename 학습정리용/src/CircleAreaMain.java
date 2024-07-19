
class Circle{
	int radius;
	
	void setRadius(int radius) {
		this.radius = radius;
	}
	
	int getRadius() {
		return radius;
	}
	
	double getArea() {
		return radius * radius * Math.PI;
	}
	
}



public class CircleAreaMain {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.setRadius(30);
		
		Circle AreaTest = new Circle();
		
	}

}