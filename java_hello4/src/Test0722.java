
class Circle3{
	int radius;
	final double PI = 3.14;
	
	void setRadius(int radius) {
		this.radius = radius;
	}
	
	double getArea() {
		return radius * radius * PI;
	}
}



public class Test0722 {

	public static void main(String[] args) {
		
        Circle3 circle3 = new Circle3();
        circle3.setRadius(10);

        System.out.println(circle3.getArea());
		
		
	}

}
