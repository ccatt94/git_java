
class Circle1 {
	int radius;

	void setRadius(int radius) {
		this.radius = radius;
	}

	double getArea() {
		return radius * radius * Math.PI;
	}

	void addCircle(Circle1 circle1, Circle1 circle2) {
		System.out.println("두 원의 넓이의 합 : " + (circle1.getArea() + circle2.getArea()));
	}

	double mulCircle(Circle1 circle1, int mul) {
		return circle1.getArea() * mul;
	}
	
	double absCircle(Circle1 circle1, Circle1 circle2) {
		double abs = circle1.getArea() - circle2.getArea();
		return abs <= 0 ? abs : abs*(-1);
//		return Math.abs(circle1.getArea() - circle2.getArea());
	}
	
}

public class CircleTest {

	public static void main(String[] args) {
		Circle1 circle1 = new Circle1();
		circle1.setRadius(10);

		System.out.println(circle1.getArea());

		Circle1 circle2 = new Circle1();
		circle2.setRadius(10);

		System.out.println(circle2.getArea());

		circle1.addCircle(circle1, circle2);

		System.out.println("원 넓이의 두배 값 : " + circle1.mulCircle(circle1, 2));
		System.out.println("원 넓이의 세배 값 : " + circle1.mulCircle(circle2, 3));

		System.out.println("두 원의 넓이의 차의 절대값 : " + circle1.absCircle(circle1, circle2));
		
		
	}

}
