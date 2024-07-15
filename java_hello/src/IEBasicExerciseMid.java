
public class IEBasicExerciseMid {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 2;
		int num3 = 1;
		
		int mid;
		
		if(((num1 < num2) && (num1 > num3)) || ((num1 > num2) && (num1 < num3))) {
			mid = num1;
		}else if(((num2 < num1) && (num2 > num3)) || ((num2 > num1) && (num2 < num3))) {
			mid = num2;
		}else{
			mid = num3;
		}
		
		System.out.println("중간값 : " + mid);

		
		
		
		
		
		
		
	}

}
