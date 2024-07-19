
public class Test0719 {

	public static double getCircleArea(double r) {
		return r * r * Math.PI;
	}
	
	public static double getAvg(double kor, double eng, double math) {
		
		return (kor + eng + math) / 3.0;
	}
	
	public static char getGrade(double avg) {
		
		char grade;
		if(avg>= 90) {
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
	
	public static void main(String[] args) {
		
		System.out.println(getCircleArea(10));

		int kor = 90;
		int eng = 80;
		int math = 77;
		
		double avg = getAvg(kor, eng, math);
		char grade = getGrade(avg);
		System.out.println("평균은 " + avg + " 입니다.");
		System.out.println("성적은 " + grade + " 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
