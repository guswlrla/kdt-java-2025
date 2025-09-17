package com.ruby.java.ch02데이터타입;

public class Test09 {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		
		a += b; // a = a + b
		System.out.println(a); // 12
		a -= b;
		System.out.println(a); // 10
		a *= b;
		System.out.println(a); // 20
		a /= b;
		System.out.println(a); // 10
		a %= b;
		System.out.println(a); // 0
	}
}
