package ch08;

public class SingletonUse {
	//Singleton a = new Singleton();//new로 호출하면 에러
	
	//클래스이름 변수 = 클래스이름.method()로 싱글톤처리된(private)생성자 접근
	Singleton a = Singleton.getInstance();

}
