package day_01;

public class Nursery {

	public static void main(String[] args) {
		//ÊýÆ¡¾ÆÆ¿Í¯Ò¥´úÂë
		int start = 99;
		int end = 0;
		String word = "bottles";
		for(int i = start; i > end; i--) {
			System.out.println(i + word + " of beer on the wall," + i
					+ word + " of beer");
				System.out.println("Take one down");
				System.out.println("Pass it around");
				if((i - 1) == 1) {
					word = "bottle";
				}
				if(i == 1) {
					System.out.println("NO more bottles of beer on the wall");
					continue;
				}
				System.out.println((i-1) + word + " of beer on the wall");
		}

	}

}
