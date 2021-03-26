package ch08;

public class Singleton {
	private Singleton() {
		print();
	}
	//static은 별도의 메모리서비스공간이다. new를 하지 않고서도 객체가 메모리에 올라간다.
	//static을 활용한 프로그램은 프로그램이 끝나면 메모리에서 자동 제거됨.
	
	private static Singleton instance;//instance변수는 static 이라는
	//특별한 메모리서비스 공간을 활용
	
	//생성자가 private처리가 되었을땐 이렇게 public static으로 처리한 메소드로
	//우회접근한다.
	public static Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();
		}
		//처음엔 null상태에서 실행되어 생성자를 생성하여 쓰지만 두번째 부터 부르면
		//null이 아니기 때문에 if문을 실행 안한다.
		return instance;//참조변수의 주소값을 리턴
	}

}
