package day_2024_08_08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExampleMain {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");


		
		System.out.println("1:" + map.containsKey(45));
		System.out.println("2:" + map.containsKey(60));
		System.out.println("3:" + map.containsValue("홍길동"));
		System.out.println("4:" + map.isEmpty());
		System.out.println("5:" + map.size());
		System.out.println("6:" + map);
		System.out.println("7: " + map.replace(23,"홍길동"));
		
		
		System.out.println("=========================");
		
		System.out.println("23번: " + map.get(23));
		System.out.println("37번: " + map.get(37));
		System.out.println("45번: " + map.get(45));
		System.out.println();
		
		map.remove(37);
		
		System.out.println("37번: " + map.get(37));
		
		Set<Integer> ks = map.keySet();
		
		for(Integer i : ks) {
			System.out.print(i.toString() + "\t");
		}
		System.out.println("=========================");
		
		for(Integer i : ks) {
			System.out.print(map.get(i).toString() + "\t");
		}
		System.out.println("===========================");
		
		for(Iterator<Integer> itr = ks.iterator(); itr.hasNext();) {
			System.out.print(itr.next().toString() + "\t");
		}
		System.out.println("=============================");
		
		
	}
}
