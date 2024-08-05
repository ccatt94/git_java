package day_2024_08_05;

class Apple{
	public String toString() {return "I am an apple.";}
}

class Orange{
	public String toString() {return "I am an orange.";}
}

//class Box{
//	private Object ob;
//	
//	public void set(Object o) {
//		ob = o;
//		}
//	
//	public Object get() {
//		return ob;
//		}
//}

/*
 * <T> - 타입 파라미터
 */

class Box<T> { 
	
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}



public class GeneticMain {
	public static void main(String[] args) {
		
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<>();
		Box<String> sBox = new Box<>();
		Box<Integer> iBox = new Box<>();
		Box<Double> dBox = new Box<>();
		
		
		
		aBox.set(new Apple());
		Apple ap = aBox.get(); //형변환 필요없음(데이터 타입을 미리 정해 객체 생성됐기 때문에)
		System.out.println(ap);
//		aBox.set(new Orange()); //Apple외에는 다른 타입 못 넣음
		
		
		
		oBox.set(new Orange());
		Orange or = oBox.get();
		System.out.println(or);
		
		
		
		sBox.set("해킹 안됨");
		String str = sBox.get();
		System.out.println(str);
		
		
		iBox.set(100);
		int num = iBox.get();
		System.out.println(num);
		
		dBox.set(3.14);
		double num1 = dBox.get();
		System.out.println(num1);
		
		
//		Box aBox = new Box();
//		Box oBox = new Box();
		
//		aBox.set("Apple");
//		oBox.set("Orange");
		
//		aBox.set(new Apple());
//		oBox.set(new Orange());
		
//		Apple ap = (Apple)aBox.get();
//		Orange og = (Orange)oBox.get();
		
//		System.out.println(aBox.get());
//		System.out.println(oBox.get());

	}
}
