//package com.ruby.java.ch13제네릭;
//
//class Bag<T> {
//	private T thing;
//	
//	public Bag(T thing) {
//		this.thing = thing;
//	}
//	
//	public T getThing() {
//		return thing;
//	}
//	
//	public void setThing(T thing) {
//		this.thing = thing;
//	}
//	
//	void showType() {
//		System.out.println("T의 타입은 " + thing.getClass().getName());
//	}
//}
//
//class Book {}
//class PencilCase {}
//class Notebook {}
//
//
//public class BagTest {
//	public static void main(String[] args) {
//		Bag<Book> bag = new Bag<>(new Book());
//		Bag<PencilCase> bag2 = new Bag<>(new PencilCase());
//		Bag<Notebook> bag3 = new Bag<>(new Notebook());
//		
//		bag.showType();
//		bag2.showType();
//		bag3.showType();
//
//		Book book = bag.getThing();
//		PencilCase pc = bag2.getThing();
//		Notebook nb = bag3.getThing();
//		
////		bag = bag2; // 의미적으로 잘못된 코드이지만 오류는 안남, 제네릭을 사용하면 오류로 해석해줌
//		
//	}
//}
