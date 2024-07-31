package day_2024_07_31;

class Circle extends Object{
	private int r;
	
	public Circle(int r) {
		this.r = r;
	}
	
	public double getArea() {
		return r * r * Math.PI;
	}
	
	@Override // @ = 함수 = 짜는 방법이 따로 존재
	public String toString() {
		return "넓이는 " + getArea() + " 입니다.";
	}
}

class AA{
	public void aa() {}
}

class BB extends AA{
	@Override
	public void aa() {}
	
//	@Override // 부모에 해당 함수 없으면, 컴파일 에러 메시지 전달
//	public void bb() {}
}

class D{
	
	public String toString() {
		return "정상출력";
	}

}

public class ObjMain {

	public static void main(String[] args) {

		Object obj = new Circle(10);

		System.out.println(obj); //출력: 넓이는 100 입니다. (예시)
	
		D d = new D();
		System.out.println(d); // String s = String.valueOf(x); -> s가 주소 뿌림
		System.out.println(d.toString());
	}

}
