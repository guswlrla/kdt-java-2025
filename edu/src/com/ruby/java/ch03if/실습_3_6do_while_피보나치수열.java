package com.ruby.java.ch03if;

import java.util.Scanner;

/*
 * 피보나치 수열: 0 1 1 2 3 5 8 ...
 * int n = sc.nextInt(); //항의 수
 * int first = 0;
 * int second = 1;
 * sysout(first);
 * do {
 *    sysout(second)
 *    int next = first + second;
 *    first = second;
 *    second = next;
 * } while();
 * 
 */

public class 실습_3_6do_while_피보나치수열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int n = sc.nextInt();
		
		int first = 0;
		int second = 1;
		do {
			int next = first + second;
			first = second;
			second = next;
		} while(first == 0);
		
		//System.out.println(next);
		
	}
}
