package day_2024_07_31;

//데이터 멤버 상수와 함수선언(abstract) = 추상 메서드
interface Printable{
	public static final int COUNT = 0;
	public abstract void print(String doc);
}

//interface = abstract = 자식이 구현
class Printer implements Printable{
	@Override
	public void print(String doc) {
		System.out.println(doc);
	}
}

public class InterfaceMain {

	public static void main(String[] args) {

		Printable prn = new Printer();
		prn.print("hello");
	
		
	}

}
