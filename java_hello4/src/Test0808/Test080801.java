package Test0808;

import java.util.HashSet;

public class Test080801 {

	public static void main(String[] args) {

		HashSet<Integer> lottoSet = new HashSet<>();
		final int LOTTO = 6;
		
		while(lottoSet.size() < LOTTO) {
			int num = (int) (Math.random()*45+1);
			lottoSet.add(num);
		}
		
		System.out.println(lottoSet);
	}

}
