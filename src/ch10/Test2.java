package ch10;

class A2 {
	void print() {//nonstatic멤버
		System.out.println("a");
		
	}
}

class B2 extends A2 {
	//class 앞에 final을 쓰면 상속이 금지
	//method 앞에 final을 쓰면 오버라이딩 금지
	
	@Override
	void print() {
		System.out.println("b");
	}
}


public class Test2 {
	public static void main(String[] args) {
		B2 b = new B2();
		b.print();
	}

}
