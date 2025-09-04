package com.ruby.java.ch02데이터타입;

public class 실습_2_6최소지폐수계산 {

	public static void main(String[] args) {
		// 천원 미만은 할인하고 임의의 금액을 지불하기 위해 필요한 지폐 장수를 구하는 프로그램을 작성
		/*
		* 상품 가격 167,000원을 지불하기 위해 필요한 최소 지폐 장수는 아래와 같다.
		* 5만원 * 3장
		* 1만원 * 1장
		* 5천원 * 1장
		* 1천원 * 2장 
		*/
		
		int money = 167000;
		
		int a = money / 50000;
		int b = (money % 50000) / 10000;
		int c = (money % 10000) / 5000;
		int d = (money % 5000) / 1000;
		
		System.out.println("5만원 지폐 장 수 : " + a);
		System.out.println("1만원 지폐 장 수 : " + b);
		System.out.println("5천원 지폐 장 수 : " + c);
		System.out.println("1천원 지폐 장 수 : " + d);
	}

}
