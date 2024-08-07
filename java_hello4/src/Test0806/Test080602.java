package Test0806;

class DBox<L, R>{
	private L left;
	private R right;
	
	public void set(L l, R r) {
		left = l;
		right = r;
	}
	
	@Override
	public String toString() {
		return left + " & " + right + "개";
	}
}

public class Test080602 {

	public static void main(String[] args) {

		DBox<String, Integer> box = new DBox<String, Integer>();
        box.set("Apple", 25);
        System.out.println(box); // Apple & 25개 
		
	}

}
