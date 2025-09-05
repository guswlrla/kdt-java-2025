package com.ruby.java.ch04배열;

import java.util.Arrays;
import java.util.Random;

/*
 * 배열 사용, 난수로 입력된 10명의 성적 평균 구하기
 * Random rd =new Random();
 * score[i] = rd. nextInt(100);//0 ~ 99 정수 생성
 * 
 * 10명 학생의 학점 출력:
 *    ~90 A, ~80 B, ~70 C, ~60 D, 59~ F
 *    출력은 "99점 - A 학점" 등으로 출력한다.
 */

public class 실습_4_3_배열_점수평균 {
	public static void main(String[] args) {
		int score[] = new int[10];
		
		// 랜덤으로 점수를 얻기 위한 변수
		Random rd = new Random();
		
		// 랜덤으로 0~100까지 정수 입력
		for(int i = 0; i < score.length; i++) {
			score[i] = rd.nextInt(101); // 0~100 정수 생성
		}
		
//		System.out.println(Arrays.toString(score)); 밑의 코드와 똑같음
//		System.out.print("[");
//		for (int i = 0; i < score.length; i++) {
//			System.out.print(score[i]);
//			if (i + 1 < score.length)
//				System.out.print(", ");
//		}
//		System.out.println("]");
		
		// 학점 출력
		for(int i = 0; i < score.length; i++ ) {
			if(score[i] >= 90)
				System.out.println(score[i] + "점 - A학점");
			else if(score[i] >= 80)
				System.out.println(score[i] + "점 - B학점");
			else if(score[i] >= 70)
				System.out.println(score[i] + "점 - C학점");
			else if(score[i] >= 60)
				System.out.println(score[i] + "점 - D학점");
			else
				System.out.println(score[i] + "점 - F학점");
		}
	}
}
