	package Plan_6_Matrix;

import Plan_6_Matrix.Plan1;
import Plan_6_Matrix.Plan3;

public class MultiplyMatrix {
	public static void main(String[] args) {
		/*
		 * ��֤��ȷ������
		 */
		int [][] A = {{4,5,8,9,3},
					  {2,1,7,6,6},
					  {3,3,5,9,7}};
		int [][] B = {{3,3},
					  {2,7},
					  {8,9},
					  {7,3},
					  {5,6}};
		
		/*
		 * ����һ
		 */
		Plan1 plan1 = new Plan1();
		int[][] A1 = creatRandomMatrix(3000,100);
		int[][] B1 = creatRandomMatrix(100,5000 );
		long start1 = System.currentTimeMillis();
		print(plan1.Multiply(A, B));
		long end1 = System.currentTimeMillis();
		System.out.println(end1 - start1); //10����
		
		
		
		
		/*
		 * ������
		 */
		
		
//		int[][] A2 = creatRandomMatrix(3000, 100);
//		int[][] B2 = creatRandomMatrix(100, 5000);
		Plan3 plan3 = new Plan3(A,B);
		long start2 = System.currentTimeMillis();
		print(plan3.Multiply());
		long end2 = System.currentTimeMillis();
		System.out.println(end2 - start2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	/*
	 * ��ӡ����
	 */
	public static void print(int[][] Matrix) {
		for(int t[] : Matrix) {
			for(int s : t) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
	}
	
	/*
	 * ��������������� + ����
	 */
	public static int[][] creatRandomMatrix(int line, int row) { //����������
		int[][] Matrix = new int[line][row];
		for(int i = 0; i < line; i++) {
			for(int j = 0; j < row; j++) {
				Matrix[i][j] = (int) (Math.random() * 10);
			}
		}
		return Matrix;
	}
	
}
