package com.ruby.java.ch10컬렉션;

import java.util.ArrayList;
import java.util.Iterator;

public class Test02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(); // default 사이즈는 10개
		list.add("서울"); list.add("북경"); list.add("상해"); // 순서 있음
		list.add("서울"); list.add("도쿄"); list.add("뉴욕"); // 중복 가능
		
		for(int i = 0; i < list.size(); i++) { // size - 데이터가 들어있는 개수, length()와는 다름
			System.out.println(list.get(i));
		}
		
		System.out.println("===========");
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}