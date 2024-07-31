package day_2024_07_31;

class A{
	public void aaa() {
		System.out.println("aaa 호출");
	}
	@Override
	public String toString() {
		return "주소나오지마";
	}
}

class B extends A{
	public void bbb() {
		System.out.println("bbb 호출");
	}
}

class C extends B{
	public void ccc() {
		System.out.println("ccc 호출");
	}
}

public class ObjCastingMain {

	public static void main(String[] args) {

		
		A a = new A();
		String str = "111";
		System.out.println(a); // println()이 toString() 호출
		System.out.println(str);
		
		System.out.println(new A());
		System.out.println(new B());
		
		
		
		
		
		
		
		
		
		
	////////////////////////////////////////////////////////////////////////////////////////	
		
	A a1 = new B(); //다형성
	
	//인스턴스 앞은 객체(주소), 인스턴스 뒤는 클래스 (true / false)
	//a 주소 찾아가서 B가 있으면 true , 없으면 false
	if(a1 instanceof B) {
		B b = new B();
		b.bbb();
		
//		((B)a).bbb(); //위 코드와 같은 의미
	}
	
	
	B b = (B) a; //자식 = (자식)부모 - 형변환하면 사용 가능	
	b.bbb();
	
	
	a = new C();
	if(a instanceof B) {
		System.out.println("트루입니다.");
	}
	
	if(a instanceof A) {
		System.out.println("트루입니다.");
	}
	
	if(a instanceof C) {
		System.out.println("트루입니다.");
	}
		
		
	
	
	
		
	}

}
