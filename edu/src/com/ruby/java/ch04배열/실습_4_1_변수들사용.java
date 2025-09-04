package com.ruby.java.ch04배열;
/*
 * 배열 사용없이 변수 5개를 사용하여 5명 점수의 평균 구하기
 * int score1,score2,score3, score4, score5;
 */
public class 실습_4_1_변수들사용 {
	public static void main(String[] args) {
		// 5명 점수를 score1 등의 변수로 초기화: 49, 91, 87, 67, 73
		// 최대 점수, 최소 점수, 평균 점수 계산하는 코드 구현
		int s1 = 49;
		int s2 = 91;
		int s3 = 87;
		int s4 = 67;
		int s5 = 73;

		int max = s1;
		int min = s1;
		int sum = s1 + s2 + s3 + s4 + s5;
		double avg = (double) sum / 5;

		// 최댓값 구하기
		if (s2 > max)
			max = s2;
		if (s3 > max)
			max = s3;
		if (s4 > max)
			max = s4;
		if (s5 > max)
			max = s5;
		
		// 최솟값 구하기
		if (s2 < min)
			min = s2;
		if (s3 < min)
			min = s3;
		if (s4 < min)
			min = s4;
		if (s5 < min)
			min = s5;
		
		System.out.println("평균 점수 : " + avg);
		System.out.println("최대 점수 : " + max);
		System.out.println("최소 점수 : " + min);
	}
}
