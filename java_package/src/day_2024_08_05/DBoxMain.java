package day_2024_08_05;

class DBox<L, R> { 
	
	private L str;
	private R count;
	
	public void set(L str, R count) {
		this.str = str;
		this.count = count;
	}
	
	@Override
	public String toString() {
		return str + " & " + count;
	}
}

class Box1<T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

public class DBoxMain {
	public static void main(String[] args) {

		DBox<String, Integer> box = new DBox<String, Integer>();
		box.set("Apple", 25);
		System.out.println(box); // Apple & 25개
		
		DBox<String, String> box2 = new DBox<>();
		box2.set("Apple", "Orange");
		System.out.println(box2); // Apple & Orange

		Box1<String> sBox = new Box1<>();
		sBox.set("I am so happy.");
		
		Box1<Box1<String>> wBox = new Box1<>();
		wBox.set(sBox);
		
		Box1<Box1<Box1<String>>> zBox = new Box1<>();
		zBox.set(wBox);
		System.out.println(zBox.get().get().get());
		
		
		
		
		
		
		
		
	}
}
