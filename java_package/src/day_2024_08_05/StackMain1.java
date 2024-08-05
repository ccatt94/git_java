package day_2024_08_05;

import java.util.Scanner;

interface Stack1 {
	int length(); // 현재 스택에 저장된 개수 리턴

	int capacity(); // 스택의 전체 저장 가능한 개수 리턴

	String pop(); // 스택의 톱(top)에 저장

	boolean push(String val); // 스택의 톱(top)에 저장된 문자 리턴
}

class StackApp1 implements Stack1 {

	private String[] arrStack;
	private int index; // top

	public StackApp1(int size) {
		arrStack = new String[size];
		index = 0;
	}

	@Override
	public int length() {
		return index;
	}

	@Override
	public int capacity() {
		return arrStack.length;
	}

	@Override
	public String pop() {
		if (index == 0) {
			return "비어있음";
		} else {
			String str = arrStack[index-1];
			index--;
			return str;
		}

	}

	@Override
	public boolean push(String val) {
		if (index == arrStack.length) {
			return false;
		} else {
			arrStack[index] = val;
			index++;
			return true;
		}
	}

}

public class StackMain1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StackApp1 stack;

		System.out.print("총 스택의 저장 공간의 크기 입력>>");

		stack = new StackApp1(sc.nextInt());

		while (true) {

			System.out.print("문자열 입력>>");
			String str = sc.next();

			if (str.equals("그만")) {
				break;
			}

			boolean isFull = stack.push(str);

			if (isFull == false) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}

		}

		System.out.println("스택에 저장된 모든 문자열 팝: ");

		for (int i = 0; i < stack.length(); i++) {
			System.out.print(stack.pop() + " ");
		}

	}
}
