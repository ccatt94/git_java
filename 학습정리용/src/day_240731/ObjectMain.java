package day_240731;

class Circle{
	private int r;
	
	public Circle(int r) {
		this.r = r;
	}
	
	public double getArea() {
		return r * r * Math.PI;
	}
	
	public String toString() {
		return "출력: " + getArea() + "입니다.";
	}
}

public class ObjectMain {

	public static void main(String[] args) {
		
		Object obj = new Circle(10);

		System.out.println(obj); //출력: 넓이는 100 입니다. (예시)
        
	}

}
