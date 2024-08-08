package day_240808;

import java.util.HashSet;

class Person {
	private String name;
	private int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return age;
	}

	@Override
	public boolean equals(Object o) {
		if (this.name == ((Person) o).name) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return name + "(" + age + "세)";
	}
}

public class HashSetPersonMain {

	public static void main(String[] args) {

		HashSet<Person> hSet = new HashSet<Person>();
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("PARK", 35));
		hSet.add(new Person("PARK", 35));

		System.out.println("저장된 데이터 수: " + hSet.size());
		System.out.println(hSet);

	}

}
