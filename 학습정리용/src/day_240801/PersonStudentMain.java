package day_240801;

import java.util.Scanner;

class Person {
	protected Object grade;
	protected String name, address;
	protected int age;
}

class Student extends Person {
	public String school, major;
	public int stuNum;
	private double gradePointAvg;
	protected double[] grade = new double[8];
	protected int idx = 0;

	Student(String name, int age, String address, String school, String major, int stuNum) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.school = school;
		this.major = major;
		this.stuNum = stuNum;
	}

	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("학교 : " + school);
		System.out.println("학과 : " + major);
		System.out.println("학번 : " + stuNum);
		System.out.println("----------------------------------");
	}

	public void average() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println(grade.length + "학기 학점을 순서대로 입력하세요");
		System.out.println();
		double sum = 0;

		for (int idx = 0; idx < grade.length; idx++) {

			System.out.print((idx + 1) + "학기 학점  → ");

			try {
				grade[idx] = sc.nextDouble();
				sum = sum + grade[idx];
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				idx--;
				sc.nextLine();
				continue;
			}

		}
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println();
		gradePointAvg = sum / grade.length;
		System.out.println(grade.length + "학기 총 평균 평점은 " + gradePointAvg + "점입니다.");
	}

}

public class PersonStudentMain {

	public static void main(String[] args) {

		Student stu = new Student("김다정", 20, "서울시", "동양서울대학교", "전산정보학과", 20132222);
		stu.showInfo();
		stu.average();

	}

}
