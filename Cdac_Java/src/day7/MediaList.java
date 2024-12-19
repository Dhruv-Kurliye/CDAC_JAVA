package day7;

import java.util.ArrayList;
import java.util.List;

public class MediaList {
	
	public void playlist(List <? extends Media> medialist) {
		
		for (Media m: medialist) {
			m.play();
		}
		
	}
	public static void main(String[] args) {
		MediaList player=new MediaList();
		List<Song> songs = new ArrayList<Song>();
		songs.add(new Song(877, "Bye Bye Bye"));
		songs.add(new Song(78787, "Tum se"));
		songs.add(new Song(9898, "Beh chala"));
		
		player.playlist(songs);
		
	}

}
