package Test0723;


class Song{
		String title, artist, country;
		int year;
		
		Song(String title, String artist, int year, String country){
			this.title = title;
			this.artist = artist;
			this.year = year;
			this.country = country;
		}
		
		void show() {
			System.out.println(year + "년 " + country + " 국적의 " + artist + "가 부른 " + title);
		}
	}



public class Test072304 {

	public static void main(String[] args) {

        Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
        song.show();
		
	}

}
