package day_2024_07_30;

class MobilePhone{
	protected String number;
	
	public MobilePhone(String num) {
		number = num;
	}
	
	public void answer() {
		System.out.println("Hi~ from " + number);
	}
}

class SmartPhone extends MobilePhone{
	private String androidVer;
	
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}
	
	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}
}

class Cake{
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake extends Cake{
	public void yummy() {
		System.out.println("Yummy Cheese Cake");
	}
}

public class OverridingMain {

	public static void main(String[] args) {

		SmartPhone phone = new SmartPhone("010-555-777", "Nougat");
		
		phone.answer();
		phone.playApp();
		
		
		
		// 다형성(polyrimorphizm) : 데이터 타입이 다양하다의 의미
		/*	부모-자식 데이터 타입이 다르면 casting함(자동형변환과 비슷)
			부모클래스 타입은 자식 클래스 타입으로 객체 생성 가능함(형변환)
		*/
		MobilePhone ph2 = new SmartPhone("010-999-333", "Nougat");
		ph2.answer(); // 다형성 적용됨
		
		
		//접근할 수 있는 범위가 mobilephone(부모클래스 타입)이라 접근 할 수 없음(형변환시 가능)
//		ph2.playApp();
		
		
		
		
		// 자식클래스 타입은 부모클래스 타입으로 객체 생성시 형변환 할 수 없기 때문에 컴파일 오류발생
//		SmartPhone ph3 = new MobilePhone("010-999-333", "Nougat");
		
//		SmartPhone ph3 = (SmartPhone) ph2;
		
		//함수 오버라이딩 = 상속 관계에서 이름이 같은 함수가 있을 때 자식 함수로 부모함수를 덮어씀 = 오버라이딩은자식꺼
		/*	상속 JVM이 같은 리턴타입,함수이름이 같은 함수를 찾음(부모-자식의 함수이름이 같은 함수를 찾음
			자식이 갖고있는 함수로 덮어씀
		*/
		Cake c1 = new CheeseCake();
		CheeseCake c2 = new CheeseCake();
		
		c1.yummy();
		c2.yummy();
		
		
		
		
		
		
	}

}
