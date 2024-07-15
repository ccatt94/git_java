
public class IEBasicExerciseMax {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 1;
		int num3 = 3;
		
		int max;
		
		if((num1 <= num3) && (num2 <= num3)) {
			max = num3;
		}else if((num1 >= num2) && (num1 >= num3)) {
			max = num1;
		}else {
			max = num2;
		}
		System.out.println("최대값 : " + max);
	 	
		
	
		//////두번째 방법
		max = num1;
		if(max <= num2) {
			max = num2;
		}
		if(max <= num3) {
			max = num3;
		}
		System.out.println("최대값 : " + max);
		
		
		
		///////세번째 방법
		if(num1>=num2) {
			if(num1>=num3) {
				max = num1;
			}
		}else if(num2>=num1) {
			if(num2>=num3) {
				max = num2;
			}
		}else {
			max = num3;
		}
		
		System.out.println("최대값 : " + max);
		
		
		
		///////네번째
		if((num1 >= num2) && (num1 >= num3)) {
			max = num1;
		}else if((num3 >= num2) && (num3 >= num1)){
			max = num3;
		}else {
			max = num2;
		}
		
		System.out.println("최대값 : " + max);
		
	}	
}
