package com.ruby.java.ch09기본API;
/*
 * 417페이지 (6) 문자열 편집
 * 
 * 하단에서 두번째 문단: String은 "원본 변경 불가(immutable)"라는 원칙
 * 
 */
public class Test06_실습대상 {

	public static void main(String[] args) {
		String s = "Everything in your world is created";
		s = "hello"; // 앞에 넣었던 문자열은 hello로 덮어서 사라지는게 아니라, 가리키는게 바뀜 (Evertthing..~은 immuteable 객체로 바뀜, 프로그램 영역은 절대 수정 불가)
		System.out.println("s = " + s);
		String s2 = s.concat(" by What you think."); // string을 붙인 것을 s2가 가리킴

		System.out.println(s2);
		System.out.println("s = " + s);	

		String s3 = s2.replaceAll("by What you think.", "by Your thoughts.");

		System.out.println(s3);
		System.out.println("s = " + s);
		
		String s4 = s3.toLowerCase();
		String s5 = s3.toUpperCase();
		System.out.println("s = " + s);
		
		System.out.println(s4);
		System.out.println(s5);
		String s6 = "hello";
		s6.concat(" by what you think.");
		System.out.println(s6);
		s6 = s6.concat(" by what you think.");
		System.out.println(s6);
	}

}