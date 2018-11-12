package Plan_6_Matrix;

import java.util.ArrayList;

public class Plan2 {

	/*
	 * Plan2:
	 * 采用Strassen算法(分治)
	 * 时间复杂度为O(n^ln7) ~= O(n^2.81)
	 * 存储上依旧采用数组存储，但在算法上进行改进
	 * 采用分治和递归的方式来算
	 */
	public static void main(String[] args) {
		
	}
	
	
	
	/*
	 * matrix + matrix
	 */
	public static int[][] plus(int[][] t, int[][] r) {
		int n = t.length;
		int[][] s = new int[n][n];
		for(int i = 0 ; i < n; i++) {
			for(int j = 0; j < n; j++) {
				s[i][j] = t[i][j] + r[i][j];
			}
		}
		return s;
	}
	
	/*
	 * matrix - matrix
	 */
	public static int[][] minus(int[][] t, int[][] r) {
		int n = t.length;
		int[][] s = new int[n][n];
		for(int i = 0 ; i < n; i++) {
			for(int j = 0; j < n; j++) {
				s[i][j] = t[i][j] - r[i][j];
			}
		}
		return s;
	}
	
	/*
	 * matrix * matrix
	 */
	public static int[][] mul(int[][] t, int[][] r) {
		int n = t.length;
		int[][] s = new int[n][n];
		for(int i = 0 ; i < n; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0 ; k < n; k++) {
					s[i][j] += t[i][k] * r[k][j];  
				}
			}
		}
		return s;
	}
	
	/*
	 * 数组切分赋值
	 */
	public static void Assignment(ArrayList<int[][]> M) {
		int N = M.get(0).length;
//		int[][] A11 = 
	}
	
//	int N = A.length;
//	int[][] A11 = new int[N/2][N/2];int[][] B11 = new int[N/2][N/2];
//	int[][] A12 = new int[N/2][N/2];int[][] B12 = new int[N/2][N/2];
//	int[][] A21 = new int[N/2][N/2];int[][] B21 = new int[N/2][N/2];
//	int[][] A22 = new int[N/2][N/2];int[][] B22 = new int[N/2][N/2];
//	int[][] M1 = mul(A11,minus(B12,B22));
//	int[][] M2 = mul(B22,plus(A11,A12));
//	int[][] M3 = mul(B11,plus(A21,A22));
//	int[][] M4 = mul(A22,minus(B21,B11));
//	int[][] M5 = mul((plus(A11,A22)),plus(B11,B22));
//	int[][] M6 = mul(minus(A12,A22),plus(B21,B22));
//	int[][] M7 = mul(minus(A11,A21),plus(B11,B12));
//	int[][] C = new int[N][N];
//	C[0][0] = M5[0][0] + M4[0][0] - M2[0][0] + M6[0][0];
//	C[0][1] = M1[0][0] + M2[0][0];
//	C[1][0] = M3[0][0] + M4[0][0];
//	C[1][1] = M5[0][0] + M1[0][0] - M3[0][0] -M7[0][0];
//	return C;
	public static void recursive(ArrayList<int[][]> W1,ArrayList<int[][]> W2) {
		if(W1.get(0).length != 2 ) {
			int N = W1.get(0).length;
			
//			recursive(P1,P2);
		}
		
		
	}
	
	
	
	
}
