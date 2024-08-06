package day_240806;

class Box<T> {
	private T type;

	public void set(T t) {
		type = t;
	}

	public T get() {
		return type;
	}

}

public class GeneticCompBoxMain {

	public static <T> boolean compBox(Box<T> box, T t) {

		if (box.get() == t) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Box<Integer> box1 = new Box<>();
		box1.set(24);

		Box<String> box2 = new Box<>();
		box2.set("Poly");

		if (compBox(box1, 25))
			System.out.println("상자 안에 25 저장");
		if (compBox(box2, "Moly"))
			System.out.println("상자 안에 Moly 저장");

		System.out.println(box1.get());
		System.out.println(box2.get());

	}

}
