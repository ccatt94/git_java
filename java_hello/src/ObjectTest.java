
class A {
	int num; // 인스턴스 변수
	int kor, eng, math;

	void setNum(int n1) {
//		this.num = num;
		num = n1;
	}

	int getNum() {
		return num;
	}

	void setKor(int k1) {
//		this.kor = kor;
		kor = k1;
	}

	int getKor() {
		return kor;
	}

	void setEng(int e1) {
		eng = e1;
	}

	int getEng() {
		return eng;
	}

	void setMath(int m1) {
		math = m1;
	}

	int getMath() {
		return math;
	}

	double getAvg() {
		return (kor + eng + math) / 3.0;
	}

}

class Circle {
	int radius;
	double area;

	void setRadius(int r) {
		radius = r;
	}

	double getArea() {
		return radius * radius * Math.PI;
	}

}



class Rectangle {
	double height, width;

	void setHeight(double h) {
		height = h;
	}

	void setWidth(double w) {
		width = w;
	}

	double getArea() {
		return height * width;
	}

	void printArea(Rectangle rec) {
		System.out.println("넓이 : " + rec.getArea());
	}
}


class Grade{
	int kor, eng, math;
	double avg; 
	char grade;
	
	void setKor(int kor) {
		this.kor = kor;
	}
	
	void setEng(int eng) {
		this.eng = eng;
	}
	
	void setMath(int math) {
		this.math = math;
	}
	
	int getKor() {
		return kor;
	}
	
	int getEng() {
		return eng;
	}
	
	int getMath() {
		return math;
	}

	double getAvg() {
		avg = (kor + eng + math) / 3.0;
		return avg;
	}
	
	char getCharGrade() {
		
//		double avg = (kor + eng + math) / 3.0;
		
		if(avg >= 90) {
			grade = '수';
		}else if(avg >= 80){
			grade = '우';
		}else if(avg >= 70){
			
			grade = '미';
		}else if(avg >= 60){
			grade = '양';
		}else {
			grade = '가';
		}
		return grade;
	}
	
	void getGrade() {
		System.out.println("성적은 " + grade + "입니다.");
	}
	
	void checkGradeObject(Grade grade) {
		grade.getGrade();
	}
	
}




public class ObjectTest {
	public static void main(String[] args) {
	
		Grade grade = new Grade();
		grade.setKor(90);
		grade.setEng(90);
		grade.setMath(90);
		
		System.out.println("국어 " + grade.getKor());
		System.out.println("영어 " + grade.getEng());
		System.out.println("수학 " + grade.getMath());
		
		System.out.println(grade.getAvg());
		System.out.println();
		System.out.println(grade.getCharGrade() + "입니다.");
		grade.getGrade();
		
		
		grade.checkGradeObject(grade);
		
		
		System.out.println();
///////////////////////////////////////////////////////////////////////////////////////////	
		Rectangle rec = new Rectangle();
		rec.setHeight(10.1);
		rec.setWidth(10.1);
		
		System.out.println("직사각형의 넓이는 " + rec.getArea());
		
		rec.printArea(rec);

/////////////////////////////////////////////////////////////////////////////////////////////		
		System.out.println();
		
		Circle circle = new Circle();
		circle.setRadius(10);

		System.out.println("원의 넓이는 " + "" + circle.getArea());

		circle.setRadius(20);

		System.out.println("원의 넓이는 " + "" + circle.getArea());
		
/////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println();
		
		
		
		A a; // 참조형
		a = new A();	//객체(인스턴스) 생성, 클래스 이름과 똑같은 함수인 생성자 함수 생성
						// a에 클래스 주소(메모리)가 들어감
		
		a.setNum(10);
		System.out.println(a.getNum());
		
		a.setKor(90);
		System.out.println(a.getKor());
		
		a.setEng(90);
		System.out.println(a.getEng());
		
		a.setMath(90);
		System.out.println(a.getMath());
		
		System.out.println("평균은 : " + a.getAvg());
		
		
		
		
		
		
		
//		System.out.println(a.num);
//		a.num = 3;
//		System.out.println(a.num);
//		
//		a.kor = 80;
//		a.eng = 80;
//		a.math = 90;
//		
//		
//		
//		System.out.println("국어 : " + a.kor);
//		System.out.println("영어 : " + a.eng);
//		System.out.println("수학 : " + a.math);
//		
//		
//		System.out.println(a);
		
		
		
		
		
		
	}

}
