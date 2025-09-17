package com.ruby.java.ch13제네릭;

class Bag4<T extends Solid2> {
	private T thing;
	private String owner;
	
	public Bag4(T thing) {
		this.thing = thing;
	}
	
	public T getThing() {
		return thing;
	}
	
	public void setThing(T thing) {
		this.thing = thing;
	}
	
	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	boolean isSameOwner(Bag4<?> obj) {
		if(this.owner.equals(obj.getOwner()))
			return true;
		return false;
	}
}

class Solid2 {}
class Liquid2 {}

class Book4 extends Solid2 {}
class PencilCase4 extends Solid2 {}
class Notebook4 extends Solid2 {}

class Water2 extends Liquid2 {}
class Coffee2 extends Liquid2 {}

public class BagTest4 {
	public static void main(String[] args) {
		Bag4<Book4> bag = new Bag4<>(new Book4());
		Bag4<PencilCase4> bag2 = new Bag4<>(new PencilCase4());
		
		bag.setOwner("김푸름");
		bag2.setOwner("김푸름");
		
		boolean result = bag.isSameOwner(bag2);
		if(result) System.out.println("소유자가 동일합니다.");
		else System.out.println("소유자가 다릅니다.");
		
//		Bag3<Water> bag4 = new Bag3<>(new Water()); // 오류 발생
//		Bag3<Coffee> bag5 = new Bag3<>(new Coffee()); // 오류 발생
	}
}
