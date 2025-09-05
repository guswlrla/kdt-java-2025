package com.ruby.java.ch04배열;
import java.util.Random;

/*
 * 난수 배열의 최대, 최소, 평균 구하기
 * 0부터 100까지의 정수 난수 10개를 생성하여 배열에 저장
 * 배열에서 최대값, 최소값, 평균을 구하기
 *   >> for문을 사용한 최대값 찾기 - 교재 149 페이지의 배열 길이: length 사용
 * 출력 내용:
 *   배열 price는 확장형 for 문으로 출력, 출력 형태는 다음과 같다:
 *   [1,2,3,4,5]
 *   최대값 출력은 다음과 같다
 *   최대값 = **
 *   최소값, 평균값 출력은 최대값 출력과 같다.
 *   
 */

public class 실습_4_4_배열생성최대값 {
	public static void main(String[] args) { // 교수님 코드, 내가 짜보기
//		// 랜덤으로 가격을 얻기 위한 변수
//		Random rd = new Random();
//			
//		// 랜덤으로 얻은 가격을 저장하는 배열
//		int price[] = new int[10];
//		
//		// 랜덤으로 0~100까지 정수 입력
//		for(int i = 0; i < price.length; i++) {
//			price[i] = rd.nextInt(101); // 0~100 정수 생성
//		}
//		
//		int max = 0;
//		int min = 0;
//		int sum = 0;
//		for(int i = 0; i < price.length; i++) {
//			if(i == 0) {
//				max = min = sum = price[i];
//				continue;
//			}
//			if(max < price[i])
//				max = price[i];
//			if(min > price[i])
//				min = price[i];
//			sum += price[i];
//		}
//		
//		int cnt = 0;
//		System.out.print("[");
//		for(int p : price) {
//			System.out.print(p);
//			if(++cnt < price.length)
//				System.out.print(" ,");
//		}
//		
//		System.out.println("]");
//		System.out.println("최댓값 : " + max);
//		System.out.println("최댓값 : " + min);
//		System.out.println("최댓값 : " + sum/(double)price.length);
	}
}
