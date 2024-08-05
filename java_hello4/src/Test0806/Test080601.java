package Test0806;

class Box<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

public class Test080601 {

	public static void main(String[] args) {

		Box<Integer> ibox = new Box<>();
        Box<Double> dbox = new Box<>();
        
        dbox.set(1.0);
        double dNum = dbox.get();//형변환도 필요없음                
        System.out.println(dNum);
		
	}

}
