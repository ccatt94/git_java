
public class IEBasicExercise {

	public static void main(String[] args) {
		int num = 24;
		
		if(num % 2 == 0) {
			System.out.println(num + " 짝수 입니다.");
		}
		else {
			System.out.println(num + " 홀수 입니다.");
		}
		
		
		
		int num1 = 5;
		
		if((1 <= num1) && (num1 <= 100)) {
			System.out.println(num1 + " true 입니다.");
		}
		else {
			System.out.println(num1 + " false 입니다.");
		}
		
		
		
		int num2 = 11;
		
		if(((num2 % 2) == 0) && ((num2 % 3) == 0)) {
			System.out.println(num2 + " true 입니다.");
		}
		else {
			System.out.println(num2 + " false 입니다.");
		}
		
		
		
		int kor = 70;
		int eng = 88;
		int math = 92;
		double avg;
		
		int total = kor + eng + math;
		avg = (double) total / 3;
		
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + eng);
		System.out.println("평균 : " + avg);
		
		if (avg >= 90) {
			System.out.println("성적 : 수입니다.");
		}else if(avg >= 80) {
			System.out.println("성적 : 우입니다.");
		}else if(avg >= 70) {
			System.out.println("성적 : 미입니다.");
		}else if(avg >= 60) {
			System.out.println("성적 : 양입니다.");
		}else {
			System.out.println("성적 : 가입니다.");
		}
	
		
		
		
	}

}
