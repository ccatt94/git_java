package day_2024_08_07;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class IntLinkedList{

	int num;
	IntLinkedList link;
	
	public IntLinkedList(int num) {
		this.num = num;
	}
}



public class ArrayListMain {

	public static void main(String[] args) {
		
		LinkedList<Integer> list1 = new LinkedList<>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		int n;
		for(Iterator<Integer> itr = list1.iterator(); itr.hasNext();) {
			n = itr.next();
			System.out.print(n + '\t');
		}
		System.out.println();		
		
		
		
		
		IntLinkedList l1 = new IntLinkedList(1);
		IntLinkedList l2 = new IntLinkedList(2);
		IntLinkedList l3 = new IntLinkedList(3);

		l1.link = l2;
		l2.link = l3;

		
		// List<E> 인터페이스(함수 오버라이딩, 다형성)
//		List<String> list = new ArrayList<>();
		List<String> list = new LinkedList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + '\t');
		}
		System.out.println();
		
		list.remove(0);
		
		//1.5버전 부터 사용 가능
		for(String str : list) {
			System.out.print(str + '\t');
		}
		System.out.println();
		
		
		//화살표 역할하는 함수
		Iterator<String> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		
	}
}
