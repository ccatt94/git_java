package Test0806;

class Box<T>{
	
	private T dou;
	
	public void set(T d) {
		dou = d;
	}
	
	public T get() {
		return dou;
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
