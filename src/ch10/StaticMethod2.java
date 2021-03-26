package ch10;

public class StaticMethod2 {
	static String name = "홍길동";
	int age = 30;
	String tel = "010-1234-5678";
	
	public static void printA() {
		System.out.println("--------------------");
		System.out.println("이름 : "+name);
	}
	
	public void printB() {
		System.out.println("나이 : "+age);
		System.out.println("전화 : "+tel);
		System.out.println("--------------------");
	}
	
	public static void main(String[] args) {
	
		printA();
		StaticMethod2 s = new StaticMethod2();
		s.printB();
	}

}