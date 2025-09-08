package edu.pnu;

import java.util.Scanner;

class Phone {
	private String number; // 010-1234-5678
	private String name; // 홍길동
	private String alias; // 홍사장
	
//	private void print() { // 외부에선 쓸 수 없지만 내부에선 사용 가능
//		System.out.println(number);
//	}
	
	private void print1() {
		System.out.println(number);
	}
	private void print2() {
		System.out.println(name);
	}
	private void print3() {
		System.out.println(alias);
	}
	
	public void print() {
		print1();
		print2();
		print3();
	}
}

public class MyTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Phone phone = new Phone();
//		phone.print(); // private 때문에 호출 불가
		phone.print(); // 이렇게는 가능
		
	}
}
