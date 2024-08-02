package day_240802;

class MyPoint {
	private int p1, p2;

	MyPoint(int p1, int p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public String toString() {
		return "Point(" + p1 + "," + p2 + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if ((this.p1 == ((MyPoint) obj).p1) && (this.p2 == ((MyPoint) obj).p2)) {
			return true;
		} else {
			return false;
		}
	}
}

public class MyPointMain {
	public static void main(String[] args) {

		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);

		System.out.println(p);

		if (p.equals(q))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");

	}
}