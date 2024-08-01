package Test0801;

class Circle{
	private int r;
	
	Circle(int r){
		this.r = r;
	}
	
	public double getArea() {
		return r * r * Math.PI;
	}
	
	public String toString() {
		return "출력: 넓이는 " + getArea() + "입니다.";
	}
}

public class Test080102 {

	public static void main(String[] args) {
		
		Object obj = new Circle(10);

		System.out.println(obj); //출력: 넓이는 100 입니다. (예시)
        
	}

}
