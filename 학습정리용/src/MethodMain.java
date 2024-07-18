
public class MethodMain {
	
	public static double getAvg(double kor, double eng, double math) {
		return (kor + eng + math) / 3.0;
	}
	
	public static char getGrade(double avg) {
		char grade;
		
		if(avg>=90) {
			grade = '수';
		}else if(avg>=80) {
			grade = '우';
		}else if(avg>=70) {
			grade = '미';
		}else if(avg>=60) {
			grade = '양';
		}else {
			grade = '가';
		}
		
		return grade;
		
	}
	
	public static double getCircleArea(double r) {
		return r * r * Math.PI;
	}
	
	public static double getRectangleArea(double w, double h) {
		return w * h;
	}

	public static void main(String[] args) {
		
		int kor = 80;
		int eng = 70;
		int math = 80;
		
		double avg = getAvg(kor, eng, math);
		char grade = getGrade(avg);
		System.out.println("평균은 " + avg + "입니다.");
		System.out.println("성적은 " + grade + "입니다.");
		
		System.out.println(getCircleArea(10));
		System.out.println(getRectangleArea(14.5, 16.78));
		
	}

}