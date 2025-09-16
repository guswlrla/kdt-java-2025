package com.ruby.java.ch03if;
import java.util.Scanner;

public class 실습_3_2switch문 {
	/*
	 * switch - case 문 실습
	 * 음료 자판기 프로그램
	 * Scanner sc = new Scanner(System.in)
	 * 
	 * sysout > ctrl + space 사용하여 코드 자동 생성
	 * 
	 *  > 단축어로 switch, for, while, do, main에 대하여 코드 자동 생성 실습
	 *  
	 * sysout("자판기 사용 비용")
	 * sysout("1. 커피 - 2000원")
	 * sysout("2. 맥주 - 2400원")
	 * sysout("3. 콜라 - 1500원")
	 * sysout("4. 주스 - 1200원")
	 * 
	 * int choice = sc.nextInt(); //화면에서 숫자 입력
	 * int price;
	 * switch(choice) { //switch()에 올 수 있는 변수: byte, short, int, char, string
	 *     case 1:
	 *     
	 *     break;
	 *     ...
	 *     default:
	 * }
	 *     
	 */
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.println("자판기 사용 비용");
		System.out.println("1. 커피 - 2000원");
		System.out.println("2. 맥주 - 2400원");
		System.out.println("3. 콜라 - 1500원");
		System.out.println("4. 주스 - 1200원");
		
		int choice = sc.nextInt();
		switch(choice) {
			case 1:
				System.out.println("커피를 선택하셨습니다.");
				break;
			case 2:
				System.out.println("맥주를 선택하셨습니다.");
				break;
			case 3:
				System.out.println("콜라를 선택하셨습니다.");
				break;
			case 4:
				System.out.println("주스를 선택하셨습니다.");
				break;
			default:
				System.out.println("잘못된 숫자 입니다.");
		}
	}	
}
