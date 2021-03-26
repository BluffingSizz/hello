package ch10;

public class Test3 {
	public static void main(String[] args) {
		Object a = 10;
		Object b =20.0;
		char c ='A';
		String d = "hello";
		//최상위 클래스인 Object를 쓸 수있지만 그대로 사용하면
		//메모리를 상당량 취하기 때문에 속도저하, 무거워진다.
		//Object 타입 하나로 모든 타입을 다 다룰 수 있지만 해당하는 한개의 자료타입으로
		//자료형으로 처리하는게 좋다. Object등의 자료형 하나로 모든 자료형을
		//처리하는 능력을 다형성이라 한다.
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//좌변 : 부모객체, 우변 : 자식객체
		Object e = new Integer(10);
		System.out.println(e);
	}

}
