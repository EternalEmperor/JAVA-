package day_02;

import java.util.ArrayList;
import java.util.Scanner;

public class GuessGame {
	public int rand_num;
	ArrayList<player> Arr = new ArrayList<player>();
	Scanner in = new Scanner(System.in);
	
	public GuessGame(player p1,player p2,player p3) {
		Arr.add(p1);
		Arr.add(p2);
		Arr.add(p3);
	}

	public void generate() {
		rand_num = (int)(Math.random()*10 + 1);
	}
	
	public void startGame() {
		generate();
			for(player p : Arr) {
			p.setNumber(in.nextInt());
			if(p.getNumber() == rand_num) {
				p.setScore(p.getScore() + 1);
			}else {
				p.setScore(p.getScore() - 1);
			}
		}
		
	}
	
	public void result() {
		for(player p : Arr) {
			System.out.println(p.toString()+"µÄ³É¼¨"+p.getScore());
		}
	}
	
}
