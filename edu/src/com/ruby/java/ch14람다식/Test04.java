package com.ruby.java.ch14람다식;

interface Verify2 {
	boolean check(int n, int d);
}

//class MyVerify implements Verify2 { // 명령형으로
//	@Override
//	public boolean check(int n, int d) {
//		return (n % d) == 0;
//	}
//}

public class Test04 {
	public static void main(String[] args) {
		Verify2 vf = (n, d) -> (n % d) == 0;
		System.out.println(vf.check(24, 3));
		
//		MyVerify mv = new MyVerify();
//		System.out.println(mv.check(24, 3));
	}
}
