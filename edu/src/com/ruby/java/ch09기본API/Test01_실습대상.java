package com.ruby.java.ch09기본API;
/* 
 * 1. Object 클래스에 정의된 메서드들은 모든 자바 객체가 기본적으로 가지고 있는 공통된 기능
 *    -> 자바 객체 지향 프로그래밍의 기본 원리를 더 깊이 이해할 수 있
 * 2. 자바에서는 부모 타입의 참조 변수가 자식 객체를 가리킬 수 있다
 *    -> Object 타입의 변수는 어떤 클래스의 객체들도 가질 수 있다
 *    => generic programming, polymorphism, collection framework 학습의 기본
 * 3. 모든 클래스들에게 적용되는 기본적인 메소드들 포함
 *    -> equals(), hashCode(), toString()

 * 교재 397 - 405 실습 코드> 아래 코드를 이해할 수 있어야 한다.
 */
class MyObject2 { // 최상위 클래스 Object를 상속, 생략 가능
	public MyObject2() {}
	public MyObject2(int i) {}
	
	public String toString() {
		return "MyObject2";
	}
}
public class Test01_실습대상 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new MyObject2();
		System.out.println("===397페이지- 해시코드===");
		System.out.println("obj1.hashCode()=" + obj1.hashCode()); //출력이 정수
		System.out.println(Integer.toHexString(obj1.hashCode())); // Integer.~ - 정수를 객체로 변환(boxing)
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		
		System.out.println("===398페이지- 클래스정보===");
		MyObject2 mo = new MyObject2();
		// obj3. 과 mo. 차이를 이해하는 것이 필요 - 타입이 달라서 사용할 수 있는 메소드가 다름
		// ((MyObject2)obj3). - 타입캐스팅으로 해결, (MyObject2)obj3. << 이렇게 하면 .이 우선순위가 높아서 괄호로 묶어줘야 함 
		// mo.
		// obj3.
		Class c = obj3.getClass(); // c는 객체이고 toString()이 있음
		//c.
		System.out.println(c);
		System.out.println("객체의 클래스 이름:: " + c.getName());
		if ((c.getName()).compareTo("MyObject2") == 1) // 클래스 이름에 패키지 이름도 있으므로
			System.out.println("클래스는 " + c.getName()); 
		
		System.out.println("===399페이지- 문자열로 표현===");
		System.out.println(obj1); // toString() 결과와 같은 이유는 자동적인 타입 캐스팅 때문임 > 정수를 hexa로 변경한 것
		// 399페이지 하단: public String toString() 함수 body
		System.out.println(obj1.toString()); // 399 페이지 하단의 클래스 이름이 string
		System.out.println(obj2); // 내부적으로 obj2.toString()을 호출해서 문자열을 출력, 클래스명@해시코드 형식으로 출력
		System.out.println(obj3); // 재정의된 toString() 호출, run-time 시간에 type 체크(실제 인스턴스는 MyObject2이기에, 실제 객체의 타입(MyObject2)에 정의된 toString()이 호출)
		// run-time 시간에 type 체크? - 컴파일러는 obj3가 Object 타입이라고 인식하지만, 메서드를 호출할 땐 실제 obj3이 가리키는 실제 객체의 타입이 무엇인지 실행 중에(런타임에) 확인해서 해당 객체에 맞는 메서드를 호출
		
		System.out.println("===403페이지- 같은지 비교===");
		MyObject2 obj4 = new MyObject2(123);
		System.out.println(obj4);
		MyObject2 obj5 = new MyObject2(123); // 메모리 다른 위치에 객체가 만들어짐, 다른 객체니까 해시코드가 다름
		// obj4.equals(obj5) // MyObject의 equals()가 실행됨
		if (obj4.equals(obj5)) { // hashcode가 다르면 다른 객체로 봄 - 기준은 hashcode를 갖고 판단
			System.out.println("동일 객체이다."); // MyObject 클래스에서 equals()를 재정의한 경우
		} else {
			System.out.println("다른 객체이다."); // Object의 equal() 사용시에는 403페이지 내용 
		}
		System.out.println("해시코드 obj4: obj5 // " + obj4.hashCode() + ":" + obj5.hashCode());
		// obj4.
		if (obj4 == obj5) {// == 연산자는 참조변수 값이 같은지 비교함, 값 자체를 비교하는 건 equals()  
			System.out.println("동일 객체이다.");
		} else {
			System.out.println("다른 객체이다.");
		}
		System.out.println("obj4 = " + obj4);
		MyObject2 mo2 = new MyObject2();//402페이지의 toString() 오버라이딩
		System.out.println(mo2);
	}
}