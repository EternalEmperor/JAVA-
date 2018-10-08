package homework_04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SongDrive {
	public Master master;//主持人
	public Player player;//点歌的
	List<Song> SongMaven = new ArrayList<Song>(); //曲库
	public SongDrive() {//初始化master和player
		master = new Master();
		player = new Player();
		SongMaven.add(new Song("稻香","周杰伦",3.20));
		SongMaven.add(new Song("醉赤壁","林俊杰",4.10));
		SongMaven.add(new Song("Lemon","八爷",5.00));
	}
	public Master getMaster() {
		return master;
	}
	public void setMaster(Master master) {
		this.master = master;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public Song exit(String songName) {
		for(Song song : SongMaven) {
			if(song.getSongName().equals(songName)) {
				return song;
			}
		}
		return null;
	}
}
