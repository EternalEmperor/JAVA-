package day_02;

public class player {
	public int score; //得分
	public int number;//用户要猜测的随机数
	


	public player() {
		super();
		// TODO Auto-generated constructor stub
		score = 10;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
