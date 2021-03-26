package ch11;

public class Test2 extends Test{
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.print();
	}

	//부모클래스에서 정의된 추상메소드는 반드시 구현을 해주어야 한다.
	@Override
	public void print() {//body측, 코드블록으로 구현을 해줌
		System.out.println("추상클래스 구현");
		
	}
	
	

}
