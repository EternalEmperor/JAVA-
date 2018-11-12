package Plan_6_Matrix;

import java.util.Scanner;

public class Plan1 {
/*
 * Plan1:
 * 采用基本嵌套算法
 * 时间复杂度为O(n^3)
 * 且为数组存储，在空间和时间上都是较大的开销
 * 作为低纬矩阵相乘可以用
 */
public  int[][] creatMatrix(){
		int x; //行
		int y; //列
		System.out.println("请输入矩阵行数和列数：");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		int[][] Matrix_A = new int[x][y];
		System.out.println("请输入数字");
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				Matrix_A[i][j] = in.nextInt();
			}
		}
		return Matrix_A;
	}



public  int[][] Multiply(int[][] A, int[][] B){
		int row = A[0].length; //列数
		int line = B.length; //行数
		if(row != line) {
			System.out.println("矩阵不满足条件，无法相乘");
			return null;
		} 
		int[][] C = new int[A.length][B[0].length];
		//然后把逐行逐列相乘想加
		for(int i = 0; i < A.length; i++) {
			for(int j = 0 ; j < B[0].length; j++) {
				for(int k = 0; k < row; k++) {
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		
		return C;
	}
}

