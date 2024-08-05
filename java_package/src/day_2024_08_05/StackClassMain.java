package day_2024_08_05;

import java.util.Scanner;

interface Stack {
	int length(); // 현재 스택에 저장된 개수 리턴

	int capacity(); // 스택의 전체 저장 가능한 개수 리턴

	String pop(); // 스택의 톱(top)에 저장

	boolean push(String val); // 스택의 톱(top)에 저장된 문자 리턴
}

class StringStack implements Stack {
	
	private int size;
	private String[] stack;
	private int index; // top

	public StringStack(int size) {
		index = 0;
		this.size = size;
		stack = new String[size];
	}

	@Override
	public int length() {
		return stack.length;
	}

	@Override
	public int capacity() {
		return size - index;
	}

	@Override
	public String pop() {
		return stack[--index];

	}

	@Override
	public boolean push(String val) {
		if (capacity() <= 0) {
			return false;
		} else {
			stack[index] = val;
			index++;
			return true;
		}
	}

}

public class StackClassMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringStack s;
		
		System.out.print("총 스택의 저장 공간의 크기 입력>>");
		s = new StringStack(sc.nextInt());

		while (true) {

			System.out.print("문자열 입력>>");
			String str = sc.next();

			if (str.equals("그만")) {
				break;
			}

			boolean isFull = s.push(str);

			if (isFull == false) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}

		}

		System.out.print("스택에 저장된 모든 문자열 팝: ");
		
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.pop() + " ");
		}

	}
}
