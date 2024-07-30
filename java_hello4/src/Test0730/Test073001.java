package Test0730;

class TV {
    private int size;

    public TV(int size) {
            this.size = size;
    }
    
    //상속 관련 - 자손에서는 언제든지 접근 가능(패키지와 상관없이)
    protected int getSize() {
            return size;
    }
}        

class ColorTV extends TV{
	int color;
	
	ColorTV(int size, int color){
		super(size);
		this.color = color;
	}
	
	void printProperty() {
		System.out.println(super.getSize() + "인치 " + this.color + "컬러");
	}
}

public class Test073001 {

	public static void main(String[] args) {
		
		ColorTV myTV = new ColorTV(32, 1024);
        myTV.printProperty();
        
        
	}

}
