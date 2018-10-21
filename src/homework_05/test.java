package homework_05;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		String src = new String();
		String tar = new String();
		int distance;
		System.out.println("请输入出发地和目的地以及距离");
		Scanner in = new Scanner(System.in);
		src = in.nextLine();
		tar = in.nextLine();
		distance = in.nextInt();
		Trans ts = new car();
		ts.getResult(src,tar,distance);
		ts = new tail();
		ts.getResult(src, tar, distance);
		ts = new plane();
		ts.getResult(src, tar, distance);
	}
	
}
