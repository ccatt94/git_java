
public class TernaryOperator {

	public static void main(String[] args) {
		
		int num = 5;
		
		if(num>=5) {
			num = 10;
		}else {
			num = 20;
		}
		System.out.println(num);
		
		int result = (num >= 5)? 10 : 20;
		System.out.println(result);
		
		
		
		int kor = 90;
		int eng = 100;
		int math = 70;
		
		int max;
		
		
		// 첫번째 방법
		max = ((kor >= eng) && (kor >= math)) ? kor : ((kor <= eng) && (eng >= math)) ? eng : math;
		
		System.out.println("max값은 : " + max);

		
		// 두번째 방법
		max = (kor >= eng) ? kor : eng;
		max = (math >= max) ? math : max;
		
		System.out.println("max값은 : " + max);
		
		
		// 세번째 방법
		max = (kor > eng) ? (kor > math ? kor : math) : (eng > math ? eng : math);
		
		System.out.println("max값은 : " + max);
		
		
	}

}

