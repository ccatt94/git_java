package day_2024_07_30;

class Employee {
	private String name, address, dept;
	private int age;
	protected int salary;

	public Employee(String name, int age, String address, String dept) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.dept = dept;
	}

	public void printInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("주소 : " + this.address);
		System.out.println("부서 : " + this.dept);
	}
}

class Regular extends Employee {

	public Regular(String name, int age, String address, String dept, int salary) {
		super(name, age, address, dept);
		setSalary(salary);
	}
	
	public void setSalary(int salary){
		super.salary = salary;
	}
	

	public void printInfo() {
		System.out.println("고용형태 : 정규직");
		super.printInfo();
		System.out.println("월급 : " + super.salary);
	}

}

//class Temporary extends Employee{
//	
//}

public class PolymorphismExampleMain {

	public static void main(String[] args) {

		Employee employee = new Employee("홍길동", 27, "서울시", "디자인");
		employee.printInfo();

		System.out.println();

		employee = new Regular("김철수", 26, "서울시", "마케팅", 2_500_000);
		employee.printInfo();

	}

}
