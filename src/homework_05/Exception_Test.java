package homework_05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Exception_Test {
	public static void main(String[] args) {
		try {
			int[] a = { 1, 2 };
			System.out.println(a[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		File file = new File("test.txt");
		try {
			System.out.println();
			System.out.println("a");
			FileReader rd = new FileReader(file);
			System.out.println("b");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("c");
		}
		
		System.out.println("我是谁？");
		Scanner in = new Scanner(System.in);
		System.out.println("1.人  2.小狗");
		int choice = in.nextInt();
		try {
			if(choice == 2) {
				throw new MyException();
			}else {
				System.out.println("这才对嘛");
			}
		}catch(MyException e) {
			e.print();
		}
	}
	

}
 class MyException extends RuntimeException{
	public MyException() {
		System.out.println("你才小狗");
	}
	
	public void print() {
		System.out.println("再给你一次做人的机会");
	}
}
