package com.ruby.java.ch02데이터타입;

public class Test04 {
	public static void main(String[] args) {
		// 실수는 기본적으로 메모리에 임시로 저장할 때, double 타입으로 저장
		// double 타입 데이터를 4byte인 float에 저장하려고 하니, 공간 부족으로 오류
		float exchangeRate = 1136.50F; // 숫자 끝에 f or F로 float 타입으로 저장
		double USDAmount = 600.50;
		double KRWAmount = 682468.25;
		
		System.out.println(exchangeRate);
		System.out.println(USDAmount);
		System.out.println(KRWAmount);
	}
}
