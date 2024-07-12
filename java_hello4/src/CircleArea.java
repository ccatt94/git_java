
public class CircleArea {

	public static void main(String[] args) {
		double radius = 10;
		final double PI = 3.14;
		
		double area = radius * radius * PI;
		
		System.out.println("반지름 : " + radius + " 넓이 : " + area);
		System.out.println("넓이가 100 미만 입니까?");
		System.out.println(100 > area);

	}

}
