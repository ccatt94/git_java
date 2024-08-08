package day_2024_08_08;

import java.util.HashSet;
import java.util.Set;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return age;
	}
	
	@Override
	public boolean equals(Object o) {
		int age = ((Person)o).age; // 상대방
		String name = ((Person)o).name; // 상대방
		
		if((this.name.equals(name)) && (this.age == age)){
			return true;
		}else {
			return false;
		}
	}
	
}

class Person2{
	private String name;
	
	public Person2(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() { // 분류 알고리즘 작용
		return name.length();
	}
	
	@Override
	public boolean equals(Object o) {
		if(this.name.equals(((Person2)o).name)) {
			return true;
		}else {
			return false;
		}
	}
}

public class HashSetExampleMain {

	public static void main(String[] args) {
		
		Set<Person> personSet = new HashSet<>();
		
		personSet.add(new Person("홍길동", 11));
		personSet.add(new Person("바둑이", 11));
		personSet.add(new Person("홍길동", 11));
		personSet.add(new Person("홍길순", 30));
		personSet.add(new Person("홍길순", 30));
		
		System.out.println("중복 제거된 인스턴스의 수 : " + personSet.size() + "명");
		
		/////////////////////////////////////////////////////////////////
		
		Set<Person2> personSet2 = new HashSet<>();
		
		personSet2.add(new Person2("홍길동"));
		personSet2.add(new Person2("바둑이"));
		personSet2.add(new Person2("홍길"));
		personSet2.add(new Person2("홍길순"));
		personSet2.add(new Person2("마틴"));
		personSet2.add(new Person2("홍길동"));
		
		System.out.println("중복 제거된 인스턴스의 수 : " + personSet2.size() + "명");
		
	}
}
