package Plan_6_Matrix;

import java.util.Scanner;

public class Plan1 {
/*
 * Plan1:
 * ���û���Ƕ���㷨
 * ʱ�临�Ӷ�ΪO(n^3)
 * ��Ϊ����洢���ڿռ��ʱ���϶��ǽϴ�Ŀ���
 * ��Ϊ��γ������˿�����
 */
public  int[][] creatMatrix(){
		int x; //��
		int y; //��
		System.out.println("���������������������");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		int[][] Matrix_A = new int[x][y];
		System.out.println("����������");
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				Matrix_A[i][j] = in.nextInt();
			}
		}
		return Matrix_A;
	}



public  int[][] Multiply(int[][] A, int[][] B){
		int row = A[0].length; //����
		int line = B.length; //����
		if(row != line) {
			System.out.println("���������������޷����");
			return null;
		} 
		int[][] C = new int[A.length][B[0].length];
		//Ȼ�����������������
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

