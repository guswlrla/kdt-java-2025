package edu;

public class Test22 {
	public static void main(String[] args) {
		int a = 12;
		int b = 2;
		char op = '+';
		
		switch(op) {
		case '+':
			System.out.println(a+b);
			break; // break문 잘 써주기
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		default: // 아무것도 해당 안 될 경우
			System.out.println("연산없음");
		}
	}
}
