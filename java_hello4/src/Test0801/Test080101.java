package Test0801;

interface Printable { // MS가 정의하고 제공한 인터페이스
    public void print(String doc);
}

class SPrinterDriver implements Printable{

	@Override
	public void print(String doc) {
		System.out.println("From Samsung Printer");
		System.out.println(doc);
	}
	
}

class LPrinterDriver implements Printable{

	@Override
	public void print(String doc) {
		System.out.println("From LG Printer");
		System.out.println(doc);
	}
	
}



public class Test080101 {

	public static void main(String[] args) {
		
		String myDoc = "This is a report about...";

        // 삼성 프린터로 출력
        Printable prn = new SPrinterDriver();
        prn.print(myDoc);
        System.out.println();

        // LG 프린터로 출력 
        prn = new LPrinterDriver();
        prn.print(myDoc);
        
	}

}
