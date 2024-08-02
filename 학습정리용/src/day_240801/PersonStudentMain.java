package day_240801;

import java.util.Scanner;

class Person{
	public static Object grade;
	protected String name, address;
	protected int age;
}

class Student extends Person{
	public String school, major;
	public int stuNum, gradePointAvg;
	protected double[] grade = new double[8];
	protected int idx = 0;
	
	
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
		System.out.println("----------------------------------");
	}
	
	
	void setGrade() {
		Scanner sc = new Scanner(System.in);
		System.out.println(grade.length + "학기 학점을 순서대로 입력하세요");
		System.out.println();
		for (int idx = 0; idx < grade.length; idx++) {
			System.out.print((idx+1) + "학기 학점  → ");
			grade[idx] = sc.nextDouble();
		}
		System.out.println("----------------------------------");
	}
	
	
	
// 예외처리 인덱스 범위 초과시 ArrayIndexOutOfBoundsException으로 처리
	public void average() {
		setGrade();
		double sum = 0;
		double avg;
		for(int idx = 0; idx < grade.length; idx++) {
			sum = sum + grade[idx];
		}
		avg = sum / grade.length;
		System.out.println(grade.length + "학기 총 평균 평점은 " + avg + "점입니다.");
	}
	
	
}


public class PersonStudentMain {

	public static void main(String[] args) {

		Student stu = new Student("김다정", 20, "서울시", "동양서울대학교", "전산정보학과", 20132222);
		stu.showInfo();
		stu.average();

	}

}
