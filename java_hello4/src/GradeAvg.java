
public class GradeAvg {

	public static void main(String[] args) {
		int kor = 90;
		int eng = 77;
		int math = 90;
		int total = kor + eng + math;
		double avg = (double)total / 3;
		
		
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("평균 : " + avg);
		
		
		if(avg >= 90) {
			System.out.println("성적 : 수 입니다.");
		}else if(avg >= 80) {
			System.out.println("성적 : 우 입니다.");
		}else if(avg >= 70) {
			System.out.println("성적 : 미 입니다.");
		}else if(avg >= 60) {
			System.out.println("성적 : 양 입니다.");
		}else  {
			System.out.println("성적 : 가 입니다.");
			}
		
		int max;
		
		if((kor >= math) && (kor >= eng)) {
			max = kor;
		} else if((kor <= math) && (math >= eng)) {
			max = math;
		}else {
			max = eng;
		}
		System.out.println("max 값 : " + max);
		

	}

}
