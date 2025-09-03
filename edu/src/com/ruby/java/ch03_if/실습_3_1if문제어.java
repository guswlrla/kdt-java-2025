package com.ruby.java.ch03_if;

import java.util.Scanner;

public class 실습_3_1if문제어 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("if문 실습");
		System.out.print("택배 무게를 입력하세요: ");
		int weight = scanner.nextInt();
		
		/*
		 * 무게에 따라 택배 요금 계산하여 출력한다.
		 * 1000이하 3000
		 * 1000 < w <= 5000 5000
		 * 5000 < w <= 10000 8000
		 * 10000 < w 12000
		 * 
		 * 출력: 택배 요금은 0000원 입니다.
		 */
		int fare = 0;
		if (weight < 1000)
			fare = 3000;
		else if (1000 < weight && weight < 5000)
			fare = 5000;
		else if (5000 < weight && weight < 10000)
			fare = 8000;
		else
			fare = 12000;
		System.out.println("택배 요금은 " + fare + "원 입니다.");
		scanner.close();
			
	}
}
