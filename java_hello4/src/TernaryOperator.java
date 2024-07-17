
public class TernaryOperator {

	public static void main(String[] args) {
		
		int kor = 90;
		int eng = 88;
		int math = 78;
		int max;
		
		max = ((kor >= eng) && (kor >= math)) ? kor : ((kor <= eng) && (eng >= math)) ? eng : math;
		
		System.out.println(max);

	}

}
