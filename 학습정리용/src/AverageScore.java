
public class AverageScore {

	public static void main(String[] args) {
		int kor = 80;
		int math = 80;
		int eng = 60;
		
		int total = kor + math + eng;
		double avg = (double) total / 3;
		
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + eng);
		System.out.println("평균 : " + avg);
		
		if(avg>=90) {
			System.out.println("성적은 수입니다.");
		}else if(avg>=80) {
			System.out.println("성적은 우입니다.");
		}else if(avg>=70) {
			System.out.println("성적은 미입니다.");
		}else if(avg>=60) {
			System.out.println("성적은 양입니다.");
		}else {
			System.out.println("성적은 가입니다.");
		}
	}

}
