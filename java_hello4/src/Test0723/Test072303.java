package Test0723;

class Grade{
	int kor, math, eng;
	
	Grade(int kor, int math, int eng){
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	double average() {
		return (kor + math + eng) / 3.0;
	}
}



public class Test072303 {

	public static void main(String[] args) {
		Grade me = new Grade(90,80 ,60 );
		System.out.println("평균은 "+ me.average()); // average()는 평균을 계산하여 리턴

	}

}
