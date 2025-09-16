package com.ruby.java.ch03if;
import java.util.Scanner;

/*
 * 달의 일 수 계산
 * int month = sc.nextInt()
 * switch(month) { 
 *     case1:
 *     		break;
 *     case3:
 *         days=31;
 * }
 * 
 */

public class 실습_3_3switch문_달일수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();	
		
		System.out.print("달을 입력하세요 : ");
		int month = sc.nextInt();

		
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(year + "년 " + month + "월의 일 수는 31일 입니다.");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(year + "년 " + month + "월의 일 수는 30일 입니다.");
				break;
			case 2:
				if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
					System.out.println(year + "년 " + month + "월의 일 수는 29일 입니다.");
				else
					System.out.println(year + "년 " + month + "월의 일 수는 28일 입니다.");
				break;
			default:
				System.out.println("잘못된 숫자 입니다.");
		}
	}
}
