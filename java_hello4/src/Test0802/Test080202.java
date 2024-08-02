package Test0802;

class IFruit{
	public void print(){}
}

class Grape extends IFruit{
	public void print(){
		System.out.println("나는 포도이다.");
	}
}

class Apple extends IFruit{
	public void print(){
		System.out.println("나는 사과이다.");
	}
}

class Pear extends IFruit{
	public void print(){
		System.out.println("나는 배이다.");
	}
}

public class Test080202 {

	public static void main(String[] args) {
		
        IFruit fAry[] = {new Grape(), new Apple(), new Pear()};
        for(IFruit f : fAry)
        f.print();
		
	}

}
