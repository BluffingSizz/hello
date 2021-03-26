package ch11;

public class Test3 extends Test implements A {
	
	public static void main(String[] args) {
		Test3 t=new Test3();
		t.print();
	}

	@Override
	public void print() {
		System.out.println("인터페이스와 추상메서드 구현");
	}

}
