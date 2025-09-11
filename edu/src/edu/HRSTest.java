//package edu;
//abstract class Employee2 { //추상 클래스
//	String name;
//	int salary;
//	public abstract void calcSalary(); // 추상 메소드
//	public abstract void calcBonus(); // 클래스의 메소드는 함수 바디가 있어야 하는데, 없이 하려면 abstract로 붙임. 클래스 내에 추상 메서드를 포함하면 추상 클래스로 선언
//}
//abstract class Salesman extends Employee2 { //307페이지 하단 밑에서 두번째 문단
//	int salesQty;
//	public void calcSalary() {
//		System.out.println("Salesman 급여 = 기본급+판매수당*판매량");
//	}
//}
//class DomesticSalesman extends Salesman { // concrete class - 객체를 만들 수 있음
//	int domesticSalesQty;
//	public void calcBonus() {
//		System.out.println("DomesticSalesman 보너스 = 기본급* 0.01");
//	}
//}
//class Consultant extends Employee2 {
//	int consultingHours;
//	public void calcSalary() {
//		System.out.println("Consultant 급여 = 기본급+컨설팅단가 * 컨설팅 시간");
//	}
//	public void calcBonus() {
//		System.out.println("Consultant 보너스 = 기본급* 0.02");
//	}
//}
//class Manager extends Employee2 {
//	int teamNumbers;
//	public void calcSalary() {
//		System.out.println("Manager 급여 = 기본급+관리자단가 * 팀수");
//	}
//	public void calcBonus() {
//		System.out.println("Manager 보너스 = 기본급* 0.03");
//	}
//}
//public class HRSTest {
//	public static void main(String[] args) {
////		Salesman s = new Salesman(); // 추상 클래스
//		Salesman s = new DomesticSalesman();
//		Consultant c = new Consultant();
//		Manager m = new Manager();
//		
//		s.calcSalary();
//		c.calcSalary();
//		m.calcSalary();
//	}
//
//}
