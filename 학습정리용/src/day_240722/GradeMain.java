package day_240722;

class Grade2 {
	int math, science, english;

	Grade2(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}

	double average() {
		return (math + science + english) / 3.0;
	}
}

public class GradeMain {

	public static void main(String[] args) {

		int math = 90;
		int science = 80;
		int english = 70;
		Grade2 me = new Grade2(math, science, english);
		System.out.println("평균은 " + me.average()); // average()는 평균을 계산하여 리턴

	}
}
