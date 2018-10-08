package homework_04;

import java.util.ArrayList;
import java.util.List;

public class Master {
	static List<Song> listSong;//歌曲列表
	public Master() {//构造函数，初始化list
		listSong = new ArrayList<Song>();
	}

	public static void setListSong(Song s) {
		listSong.add(s);
	}

	public boolean play(){//播放歌曲
		if(!listSong.isEmpty()) {
			for(Song song : listSong) {
				System.out.println("播放歌曲为：" + song.songName);
				System.out.println("歌手为：" +song.singer);
				System.out.println("播放时长：" + song.time);
			}
			return true;
		}else {
			return false;
		}
	}

}
