package day_240807;

import java.util.HashSet;

class Num{
	private int n;
	
	Num(int n){
		this.n = n;
	}
	
	@Override
	public int hashCode() {
		return n % 3;
	}
	
	@Override
	public boolean equals(Object o) {
		if(n == ((Num)o).n) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return String.valueOf(n);
	}
}

public class HashSetExampleMain {

	public static void main(String[] args) {

		HashSet<Num> set = new HashSet<>();
        set.add(new Num(7799));
        set.add(new Num(9955));
        set.add(new Num(7799));

        System.out.println("인스턴스 수: " + set.size());

        for(Num n : set)
            System.out.print(n.toString() + '\t');

        System.out.println();
		
		
	}

}
