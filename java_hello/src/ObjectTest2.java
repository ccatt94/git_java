
class Grade1{
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
	
	void checkGradeObject(Grade1 grade) {
		grade.getGrade();
	}
	
}




public class ObjectTest2 {
	public static void main(String[] args) {
	
		Grade1 grade1 = new Grade1();
		grade1.setKor(90);
		grade1.setEng(90);
		grade1.setMath(90);
		System.out.println(grade1.avg);
		
		System.out.println("국어 " + grade1.getKor());
		System.out.println("영어 " + grade1.getEng());
		System.out.println("수학 " + grade1.getMath());
		
		System.out.println();
		System.out.println(grade1.getCharGrade() + "입니다.");
		grade1.getGrade();
		
		
		System.out.println();
		System.out.println(grade1.getAvg());
		System.out.println(grade1.avg);
		System.out.println(grade1.kor);
		System.out.println(grade1.getCharGrade() + "입니다.");
		
//		grade1.checkGradeObject(grade1);
//		
//		
//		System.out.println();

		
		
	}

}
