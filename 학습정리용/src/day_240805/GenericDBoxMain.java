package day_240805;

class DBox<L, R>{
	private L str;
	private R in;
	
	public void set(L str, R in) {
		this.str = str;
		this.in = in;
	}
	
	public String toString() {
		return str + " & " + in + "개";
	}
}


public class GenericDBoxMain {

	public static void main(String[] args) {

		DBox<String, Integer> box = new DBox<String, Integer>();
		box.set("Apple", 25);
		System.out.println(box); // Apple & 25개

	}
}