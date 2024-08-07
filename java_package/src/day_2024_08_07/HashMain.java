package day_2024_08_07;

import java.util.HashSet;
import java.util.Set;

class Num{
	public int num;
	
	public Num(int n) {
		num = n;
	}
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
	@Override
	public int hashCode() {
		return num % 3;
	}
	
	@Override
	public boolean equals(Object o) {
		if(num == ((Num)o).num)
			return true;
		else
			return false;
	}
}

public class HashMain {

	public static void main(String[] args) {

		Set<Num> n1 = new HashSet<>();
		
		n1.add(new Num(1));
		n1.add(new Num(2));
		n1.add(new Num(2));

		System.out.println(n1.size());
	}
}
