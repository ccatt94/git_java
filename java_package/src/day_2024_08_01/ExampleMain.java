package day_2024_08_01;

import java.util.Scanner;

abstract class Calc {
	protected int a;
	protected int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	abstract int calculate();
}

class Add extends Calc{

	@Override
	int calculate() {
		return a+b;
	}
	
}

class Sub extends Calc{

	@Override
	int calculate() {
		return a-b;
	}
	
}

class Mul extends Calc{

	@Override
	int calculate() {
		return a*b;
	}
	
}

class Div extends Calc{

	@Override
	int calculate() {
		if (b == 0) {
			System.out.println("잘못된 입력입니다.");
			return 0;
		} else {
			return a / b;
		}
	}
	
}

//Calc cal;
//cal = new Add(); ---> 형변환 시킨것

public class ExampleMain {

	public static void main(String[] args) {

	      Scanner sc = new Scanner(System.in);
	      int result=0;
	      System.out.print("두 정수와 연산자를 입력하시오 >> ");
	      int a = sc.nextInt();
	      int b = sc.nextInt();
	      char c = sc.next().charAt(0);
	      Calc cal;
	      switch(c) {
	      case '+' : 
	         cal = new Add();
	         break;
	      case '-' :
	         cal = new Sub();
	         break;
	      case '*' :
	         cal = new Mul();
	         break;
	      case '/' :
	         cal = new Div();
	         break;
	      default :
	         System.out.println("잘못된 연산자 입니다.");
	         sc.close();
	         return; //return을 넣지 않으면 프로그램 오류나서 뒤에 뒤에 코드를 실행 시키지 않아 break말고 return을 써주어야 한다.
	      }
	      cal.setValue(a, b);
	      result = cal.calculate();
	      System.out.println(result);
	      sc.close();
		
	}
}
