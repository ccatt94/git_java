
class TV{
	String brand;
	int year, inch;
	
	TV(){
		this.brand = "oo";
		this.year = 1900;
		this.inch = 0;
		show();
	}
	
	TV(String brand, int year, int inch){
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	void show(){
		System.out.println(brand + "에서 만든 " + year + "년형 " + inch + "인치 TV" );
	}
	
}

class Grade2{
	int math, science, english;
	
	Grade2(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	double average() {
		return (math + science + english) / 3.0;
	}
}

class Song{
	String title, artist, country;
	int year;
	
	Song(){}
	
	Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	void show(){
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title );
	}
}

class Circle3{
	int radius;
	
	Circle3(int radius){
		this.radius = radius;
	}
	
	void getArea() {
		System.out.println(radius * radius * Math.PI);
	}
}

class Rectangle4{
	double width, height;
	
	Rectangle4(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	void getArea() {
		System.out.println(width * height);
	}
	
}

public class TVMain {

	public static void main(String[] args) {
		
		//1번 문제
	   {
		TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
		myTV.show();
			
		TV myTV2 = new TV();
		System.out.println("------------------------------");
	   }
		
		//2번 문제
	   {
		int math = 90;
		int science = 80;
		int english = 70;
		Grade2 me = new Grade2(math, science, english);
		System.out.println("평균은 " + me.average()); // average()는 평균을 계산하여 리턴
		System.out.println("------------------------------");
	   }
		
	   	//3번 문제
	   {
	    Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
	    song.show();
	    System.out.println("------------------------------");

	   }
	   
	   	//4번 문제
	   {
	    Circle3 c3 = new Circle3(10);
	    c3.getArea();
	    System.out.println("------------------------------");
	   }
	   
	   	//5번 문제
	   {
	    Rectangle4 rec = new Rectangle4(10, 10);
	    rec.getArea();
	   }
	   
	}
		
}
