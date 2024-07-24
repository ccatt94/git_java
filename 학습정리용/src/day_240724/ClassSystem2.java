package day_240724;

class System2 {
	static AA out = new AA();
}

class AA {
	public AA() {
		System.out.println("AA생성");
	}

	public void println() {
		System.out.println("메롱!!");
	}
}

public class ClassSystem2 {

	public static void main(String[] args) {

		System2.out.println();
		System2.out.println();
		System2.out.println();
	}
}