package com.ruby.java.ch06객체구현;

public class 실습_6_2생성자사용 {
	public static void main(String[] args) {
		String[] subjects = {"수학", "국어", "영어", "과학", "역사"};
		Student[] students = { 
				// 생성자를 사용하여 객체 생성
				new Student("홍길동", 21, subjects, new int[]{85, 90, 78, 88, 92}, -1),
				new Student("김유신", 22, subjects, new int[]{75, 80, 85, 90, 95}, -1),
				new Student("계백", 23, subjects, new int[]{65, 70, 75, 80, 85}, -1),
				new Student("강감찬", 24, subjects, new int[]{95, 92, 88, 84, 91}, -1),
				new Student("을지문덕", 25, subjects, new int[]{88, 76, 85, 79, 90}, -1)
		};

		// 학생 정보 출력
		실습_6_1객체생성자미사용.showStudents(students);
	}
}