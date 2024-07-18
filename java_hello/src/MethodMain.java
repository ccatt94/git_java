
public class MethodMain {

	public static void add(int num1, int num2) {
		int result;
		result = num1 + num2;
		System.out.println(result);
	}

	public static void sayHello() {
		System.out.println("say hello");
	}

	public static void sayHello2() {
		for (int i = 0; i < 5; i++)
			System.out.println("say hello");
	}

	public static void printHello() {
//		System.out.println("Hello world");
		sayHello2();
	}

	public static void printStart(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public static void hiEveryone(int age, double height) {
		System.out.println("제 나이는 " + age + "세 입니다.");
		System.out.println("저의 키는 " + height + "cm 입니다.");
	}

	public static int adder(int num1, int num2) {
		int addResult = num1 + num2;
		return addResult;
	}

	public static double square(double num) {
		return num * num;
	}

	public static double getAvg(double kor, double math, double eng) {
		return (kor + math + eng) / 3.0;
	}

	public static char getGrade(double avg) {

		char grade = '가';

		if (avg >= 90) {
			
			grade = '수';
		} else if (avg >= 80) {
			grade = '우';
		} else if (avg >= 70) {
			grade = '미';
		} else if (avg >= 60) {
			grade = '양';
		} else {
			grade = '가';
		}

		return grade;

	}
	
	public static double getCircleArea(double r) {
//		double PI = 3.14;
//		double area = r * r * PI;
//		return area;
		return r * r * Math.PI;
	}

	public static double getRectangleArea(double w, double h) {
		return w * h;
	}
	
	public static void divide(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		System.out.println("나눗셈 결과: " + (num1 / num2));
	}
	
	public static void main(String[] args) {

//		add(3,4);
		printStart(4);

		double myHeight = 175.9;
		hiEveryone(12, 12.5);
		hiEveryone(13, myHeight);

		int result;
		result = adder(4, 5);
		System.out.println(result);

		System.out.println(square(3.5));

		double avg = getAvg(70, 80, 60);
		char grade = getGrade(avg);

		System.out.println("성적은 " + grade + "입니다.");
		System.out.println("평균은 " + avg + "입니다.");
		
		System.out.println(getCircleArea(10));

		System.out.println(getRectangleArea(14.5, 16.7));
		
		divide(4,2);
		divide(6,2);
		divide(9,0);
		
		{
			int num = 10;
			System.out.println(num);
		}
		
		
		
		
		
		
		
	}
}
