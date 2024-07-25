package day_2024_07_25;

// 똑같은 함수 이름을 쓸 수 있는 조건 - 파라미터 타입 또는 갯수를 다르게 함 = 함수 오버로딩
// 함수 오버로딩 = 같은 함수 이름으로 파라미터 타입 또는 갯수를 달리함(리턴타입은 상관없음)
class OverloadingEX {

	void function() {
		System.out.println("함수");
	}

	void function(int num) {
		System.out.println(num);
	}

	void function(double num) {
		System.out.println(num);
	}

	void function(int num, int num2) {
		System.out.println(num);
	}

}

class Person {
	private int regiNum; // 주민등록 번호
	private int passNum; // 여권 번호

	Person(int rnum, int pnum) {
		regiNum = rnum;
		passNum = pnum;
	}

	Person(int rnum) {
//	      regiNum = rnum;
//	      passNum = 0;
		this(rnum, 0);
	}

	void showPersonalInfo() {
		System.out.println("주민등록번호 : " + regiNum);

		if (passNum != 0)
			System.out.println("여권번호:" + passNum + "\n");
		else
			System.out.println("여권을 가지고 있지 않습니다.\n");
	}

}

public class OverloadingExampleMain {

	public static void main(String[] args) {

		// 여권 있는 사람의 정보를 담은 인스턴스 생성
		Person jung = new Person(335577, 112233);

		// 여권 없는 사람의 정보를 담은 인스턴스 생성
		Person hong = new Person(775544);

		jung.showPersonalInfo();
		hong.showPersonalInfo();

		
		
		
		
		
		
		
		
		OverloadingEX ex = new OverloadingEX();
		ex.function();
		ex.function(10);

	}
}
