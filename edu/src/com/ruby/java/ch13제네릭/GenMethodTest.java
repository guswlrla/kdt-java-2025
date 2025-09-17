package com.ruby.java.ch13제네릭;

public class GenMethodTest {
	static <T extends Number, v extends T> boolean isInclude(T num, v[] array) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == num)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Integer[] inum = {1, 2, 3, 4, 5};
		Double[] dnum = {1.0, 2.0, 3.0, 4.0, 5.0};
		String[] snum = {"one", "two", "three", "four", "five"};
		
		boolean b1 = isInclude(3, inum);
		System.out.println("결과 : " + b1);
		
		boolean b2 = isInclude(5.0, dnum);
		System.out.println("결과 : " + b2);
		
//		isInclude("one", snum);
		
		GenMethodTest.<Integer, Integer>isInclude(3, inum);
		GenMethodTest.<Double, Double>isInclude(5.0, dnum);
//		GenMethodTest.<String, String>isInclude("one", snum);
	}
}

/*
 * 제네릭은 참조형 타입만 설정할 수 있음
 * Integer 타입은 -128~127 사이의 값에 대해서는 String Pool과 같은 형태로 메모리에 캐싱되어 있기 때문에 "=="비교를 하더라도 동일한 객체를 참조하므로 true가 리턴
 * Double 타입은 캐싱을 하지 않으므로 객체 비교를 하게 되어 false가 리턴됨
 */