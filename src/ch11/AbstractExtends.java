package ch11;
//추상클래스를 상속받아서 사용할 경우
//1.추상 method를 구현


public class AbstractExtends extends AbstractClass{

	@Override
	void method1() {
		System.out.println("추상 method를 완성한 method");
		
	}
	
	public static void main(String[] args) {
		//AbstractClass a = new AbstractClass();
		//추상클래스는 직접 new해서 객체생성할수 없다.
		
		AbstractExtends ex = new AbstractExtends();
		ex.method1();
		ex.method2();
	}

}
