package com.ruby.java.ch02데이터타입;

public class Test03 {
	public static void main(String[] args) {
		byte age;
		short point;
		int price;
		long totalSales;
		
		age = 23;
		point = 32000;
		price = 3500000;
		totalSales = 2147483648L; // 변수에 저장하기 전에 임시로 메모리에 데이터 타입을 int로 저장 - 숫자 끝에 l or L 표기
		
		System.out.println(age);
		System.out.println(point);
		System.out.println(price);
		System.out.println(totalSales);
	}
}
