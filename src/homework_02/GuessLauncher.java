package homework_02;

public class GuessLauncher {
	public static void main(String[] args) {
		player p1 = new player();
		player p2 = new player();
		player p3 = new player();
		GuessGame game = new GuessGame(p1, p2, p3);
		for(int i = 1; i <= 3; i++) {
			System.out.println("��" + i + "��");
			game.startGame();
		}
		game.result();
	}
}
