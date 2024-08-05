package day_240805;

class Apple{
	public String toString() {
		return "I am an apple.";
	}
}

class Orange{
	public String toString() {
		return "I am an orange.";
	}
}

class Box<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}


public class GenericBoxMain{
	
	public static void main(String[] args) {
	
		Box<Apple> abox = new Box<Apple>();
		Box<Orange> obox = new Box<>();
		Box<String> sbox = new Box<>();
		Box<Integer> ibox = new Box<>();
		Box<Double> dbox = new Box<>();
		
		dbox.set(1.0);
		double dNum = dbox.get();//형변환도 필요없음		
		System.out.println(dNum);
		
	}
}