package edu;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/*
 * 랜덤 입력 변수 설정
 * 배열을 선언 A[5], B[5], C[10]
 * 랜덤으로 값 입력
 * 합치기
*/

public class MergeArray {
	public static void main(String[] args) {
		int a[] = new int[5];
		int b[] = new int[5];
		int c[] = new int[10];
		
		Random rd = new Random();
		for(int i = 0; i < a.length; i++) {
			a[i] = rd.nextInt(101); // 0~100 정수 생성
			b[i] = rd.nextInt(101);
		}

		// 배열a 출력
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i + 1 < a.length)
				System.out.print(", ");
		}
		System.out.println("]");
		
		// 배열b 출력
		System.out.print("[");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
			if (i + 1 < b.length)
				System.out.print(", ");
		}
		System.out.println("]");
		
		// 앞뒤 합치기
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for(int i = 0; i < b.length; i++) {
			c[i+a.length] = b[i];
		}
		System.out.println("c : " + Arrays.toString(c)); // 이런 방법도 있음
		
		// 교차 합치기
		for(int i = 0; i < a.length; i++) {
			c[2*i] = a[i];
			c[2*i+1] = b[i];
		}
		System.out.println("c : " + Arrays.toString(c));
	}
}