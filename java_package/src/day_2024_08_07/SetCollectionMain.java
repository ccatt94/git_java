package day_2024_08_07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollectionMain {

	public static void main(String[] args) {

		Set<String> sset = new HashSet<>();
		sset.add(new String("AAA"));
		sset.add("AAA");
		
		System.out.println(sset.size());
		
		
		
		
		
		
		//set활용 로또번호 6개 출력
		Set<Integer> lottoSet = new HashSet<>();
		final int LOTTO = 6;
		
		while(lottoSet.size() < LOTTO) {
			int n = (int) (Math.random()*45+1);
			lottoSet.add(n);
		}
		
//		for(Integer i : lottoSet) {
//			System.out.println(i);
//		}
		
		System.out.println(lottoSet);
		
		// 문자열 set
		Set<String> set = new HashSet<>();
		
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Box");
		
		System.out.println("인스턴스 수: " + set.size());
		
		//반복자 이용 전체 출력
		for(Iterator<String> itr = set.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
		
		
		//향상된 for문 이용 전체 출력
		for(String str : set) {
			System.out.print(str + "\t");
		}
		System.out.println();
		
		
		
		//정수 set
		Set<Integer> set1 = new HashSet<>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(2);
		
		System.out.println("인스턴스 수: " + set1.size());
		
		//반복자 이용 전체 출력
		for(Iterator<Integer> itr = set1.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
		
	}
}
