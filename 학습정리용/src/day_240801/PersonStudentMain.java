package day_240801;

class Person{
	protected String name, address;
	protected int age;
}

class Student extends Person{
	public String school, major;
	public int stuNum, gradePointAvg;
	double[] grade = new double[8];
	public int idx = 0;
	
	Student(String name, int age, String address, String school, String major, int stuNum){
		this.name = name;
		this.age = age;
		this.address = address;
		this.school = school;
		this.major = major;
		this.stuNum = stuNum;
	}
	
	public void showInfo(){
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("학교 : " + school);
		System.out.println("학과 : " + major);
		System.out.println("학번 : " + stuNum);
	}
// 예외처리 인덱스 범위 초과시 ArrayIndexOutOfBoundsException으로 처
//	public double average() {
//		grade
//		return
//	}
	
	
}


public class PersonStudentMain {

	public static void main(String[] args) {

		Student stu = new Student("김다정", 20, "서울시", "동양서울대학교", "전산정보학과", 20132222);
		stu.showInfo();
		
//		stu.average();

	}

}
