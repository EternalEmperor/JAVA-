package homework_04;

public class Song {
	String songName; //歌曲名称
	String singer;//歌手
	double time;//歌曲时长
	public Song(String songName,String singer,double time ) {
		this.songName = songName;
		this.singer = singer;
		this.time = time;
	}
	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	
}
