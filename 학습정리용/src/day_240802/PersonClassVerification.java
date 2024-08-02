package day_240802;

class Person {
	private String name;

	Person(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.name == ((Person) obj).name) {
			return true;
		} else {
			return false;
		}
	}
}

public class PersonClassVerification {
	public static void main(String[] args) {

		Person p1 = new Person("홍길동");
		System.out.println(p1.equals(new Person("홍길동"))); // true 출력
		System.out.println(p1.equals(new Person("최명태"))); // false 출력

	}
}