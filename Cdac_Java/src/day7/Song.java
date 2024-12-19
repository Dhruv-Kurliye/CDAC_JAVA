package day7;

public class Song extends Media {
	int srno;
	String Song_name;
	
	public Song(int srno, String name) {
		this.srno = srno;
		this.Song_name=name;		
	}
	
	public String toString() {
		return "Song [ srno- " + srno +", tittle- "+ Song_name + "]";
	}

	@Override
	public void play() {
		System.out.println("Playing a song");
		
	}

}
