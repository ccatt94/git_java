package day_240808;

import java.util.TreeMap;

public class TreeMapMain {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");

		System.out.println("23번: " + map.get(23));
		System.out.println("37번: " + map.get(37));
		System.out.println("45번: " + map.get(45));
		System.out.println();

		map.remove(37);

		System.out.println("37번: " + map.get(37));

	}

}
