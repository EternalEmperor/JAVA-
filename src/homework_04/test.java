package homework_04;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		SongDrive sd = new SongDrive(); //创建管理器
		String addsong = new String(); //用户选择的曲目
		Song song;
		Scanner in = new Scanner(System.in);
		for(;;) {
			addsong = sd.player.addSong(); //用户增加的曲目
			if((song = sd.exit(addsong)) != null) { //如果增加的曲目在曲库中存在
				sd.master.listSong.add(song);//将曲目加载到播放列表中
			}else{
				System.out.println("抱歉，曲库中没有该歌曲，请更换添加的歌曲！");
			}
			System.out.println("是否继续添加：（y/n）：");
			if(in.nextLine().equals("y")) {
				continue;
			}else {
				break;
			}
		}
		System.out.println("开始播放歌曲");
		sd.master.play();
	}
}
