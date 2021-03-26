package ch11;

public class Airplane implements Flyer{//인터페이스인 Flyer는 반드시
	//상속받은 클래스에서 추상메소드를 구현(implements)해 주어야 한다.

	@Override
	public void takeOff() {
		System.out.println("Airplane 이륙");
		
	}

	@Override
	public void fly() {
		System.out.println("Airplane 비행");
		
	}

	@Override
	public void land() {
		System.out.println("Airplane 착륙");
		
	}

}
