package edu;

public class Test39 {
	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		int num = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		
		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				if(i == j)
//					sum = sum + arr[i][j];
//			}
//		}
		for(int i = 0; i < arr.length; i++) { // 코드를 쉽게 바꾸기 (가로, 세로 개수가 같을 경우만 쓸 수 있음)
			sum += arr[i][i];
		}
		System.out.println("합계 : " + sum);
	}
}
