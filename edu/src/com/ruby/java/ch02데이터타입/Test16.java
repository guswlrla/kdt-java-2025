package com.ruby.java.ch02데이터타입;

public class Test16 {
	public static void main(String[] args) {
		byte a = 23;
		int b = a; // 작은 타입은 큰 타입에 넣어도 문제 없음
		System.out.println(b); // 23
		
		byte c = 23;
		short d = 47;
		int e = 65;
		int f = c + d + e;
		System.out.println(f); // 135
		
		int g = 23;
		byte h = (byte)g; // 큰 타입을 작은 타입에 넣을 수 없음
		System.out.println(h); // 23
		
		byte i = 10;
		byte j = 20;
		// 연산자를 이용해서 연산할 때, 정수는 int 타입으로 변환하여 연산 수행
		byte k = (byte) (i + j); // 큰 타입을 작은 타입에 넣을 수 없기에 타입캐스팅 수행
		System.out.println(k); // 30
	}
}
