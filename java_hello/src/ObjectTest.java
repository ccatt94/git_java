
class A{
	int num; //인스턴스 변수
	int kor, eng, math;
}



public class ObjectTest {
	public static void main(String[] args) {
		A a; // 참조형
		a = new A();	//객체(인스턴스) 생성, 클래스 이름과 똑같은 함수인 생성자 함수 생성
						// a에 클래스 주소(메모리)가 들어감
		
		
		System.out.println(a.num);
		a.num = 3;
		System.out.println(a.num);
		
		a.kor = 80;
		a.eng = 80;
		a.math = 90;
		
		
		
		
		
		
		System.out.println("국어 : " + a.kor);
		System.out.println("영어 : " + a.eng);
		System.out.println("수학 : " + a.math);
		
		
		System.out.println(a);
		
		
		
		
		
		
	}

}
