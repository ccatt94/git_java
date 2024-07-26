package day_2024_07_26;

public class ArrayMain {

	public static void main(String[] args) {

		int[] ar1 = new int[5];
		
		double[] ar2 = new double[7];
		
		float[] ar3;
		ar3 = new float[9];
		
		System.out.println("배열 ar1 길이: " + ar1.length);
		System.out.println("배열 ar2 길이: " + ar2.length);
		System.out.println("배열 ar3 길이: " + ar3.length);
		
		
		int[] ar = new int[5];
		
		ar[0]=1;
		ar[1]=2;
		ar[2]=3;
		ar[3]=4;
		ar[4]=5;
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);
		
		for(int i = 0; i < ar.length; i++) {
			ar[i]=i+1;
			System.out.println(ar[i]);
					
		}

		
	}
}
