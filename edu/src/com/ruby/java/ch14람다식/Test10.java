package com.ruby.java.ch14람다식;

interface StringFunc3 {
	String modify(String s);
}

public class Test10 {
	static String func(String s) { // modify와 데이터타입, 매개변수 개수가 일치해야 함
		String result = "";
		char c;
		for(int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if(c == ',')
				result += " ";
			else
				result += c;
		}
		return result;
	}
	
	public static void main(String[] args) {
		StringFunc3 sf = Test10::func; // 람다 객체를 생성하는 코드
		
		String str = "Korea,Australia,China,Germany,Spain,Turkey";
		String result = sf.modify(str);
		System.out.println(result);
		
		String str2 = "서울,북경,도쿄,뉴욕,발리";
		result = sf.modify(str2);
		System.out.println(result);
	}
}
