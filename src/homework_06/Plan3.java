package Plan_6_Matrix;

import java.util.Currency;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.naming.spi.DirStateFactory.Result;

public class Plan3 {
	
	private int[][] A,B;
	private ConcurrentHashMap<Integer,ConcurrentHashMap<Integer,Integer>> AB_result = new ConcurrentHashMap<Integer,ConcurrentHashMap<Integer,Integer>>();
	private ConcurrentHashMap<Integer,Integer> AB_result_in = new ConcurrentHashMap<Integer,Integer>();
	Set<Integer> set;
	public Plan3(int[][] a, int[][] b) {
		A = a;
		B = b;
	}

	public Plan3() {}
	
//	public int[][] Multiply(){
//		AB_result_in.put(0, 0);
//		AB_result.put(0, AB_result_in);
//		int[][] C = new int[A.length][B[0].length];
//		for(int i = 0; i < A.length; i++) {
//			for(int j = 0 ; j < B[0].length; j++) {
//				for(int k = 0; k < A[0].length; k++) {
//					try {
//						 AB_result_in = AB_result.get(A[i][k]);
//						 
//					}catch(NullPointerException e) {
//						int result = A[i][k]*B[k][j];
//						this.AB_result_in.put(B[k][j], result);
//						AB_result.put(A[i][k], AB_result_in);
//						this.AB_result_in.put(A[i][k], result);
//						AB_result.put(B[k][j], AB_result_in);
//						//AB_result.put(B[k][j] + "*" + A[i][k], result);
//						C[i][j] += result;
//					}
//					//C[i][j] += A[i][k] * B[k][j];
//			}
//		}
//		
//	}
//		return C;
//	
//	}
	
	
//	 private ConcurrentHashMap<ConcurrentHashMap<Integer,Integer>,Integer> re = new ConcurrentHashMap<ConcurrentHashMap<Integer,Integer>,Integer>();
//	 private ConcurrentHashMap<Integer,Integer> re_in = new ConcurrentHashMap<Integer,Integer>();
//	 
//	 public int[][] Multiply(){
//		 int[][] C = new int[A.length][B[0].length];
//		 for(int i = 0; i < A.length; i++) {
//				for(int j = 0 ; j < B[0].length; j++) {
//					for(int k = 0; k < A[0].length; k++) {
//						try {
//							int b = re_in.get(A[i][k]);
//							if(b == B[k][j]) {
//								C[i][j] += re.get(re_in);
//							}else {
//								int result1 = A[i][k] * B[k][j];
//								re_in.put(A[i][k], B[k][j]);
//								re.put(re_in, result1);
//								C[i][j] += result1;
//							}
//						}catch(NullPointerException e) {
//							int result = A[i][k] * B[k][j];
//							re_in.put(A[i][k], B[k][j]);
//							re.put(re_in, result);
//							C[i][j] += result;
//						}
//						
//					}
//				}
//			}
//		 
//		 
//		 return C;
//	 }
	
	
	 private ConcurrentHashMap<ConcurrentHashMap<Integer,Integer>,Integer> re = new ConcurrentHashMap<ConcurrentHashMap<Integer,Integer>,Integer>();
	 private ConcurrentHashMap<Integer,Integer> re_in = new ConcurrentHashMap<Integer,Integer>();
	 
	 public int[][] Multiply(){
		 int[][] C = new int[A.length][B[0].length];
		 for(int i = 0; i < A.length; i++) {
				for(int j = 0 ; j < B[0].length; j++) {
					for(int k = 0; k < A[0].length; k++) {
						try {
							int c = Integer.MAX_VALUE;
							re_in.clear();
							re_in.put(A[i][k], B[k][j]);
							c = re.get(re_in);
							C[i][j] += c;
						}catch(NullPointerException e) {
							int result = A[i][k] * B[k][j];
							re.put(re_in, result);
							C[i][j] += result;
						}
						
					}
				}
			}
		 
		 
		 return C;
	 }
	
	
	
	
	
	
	
}
