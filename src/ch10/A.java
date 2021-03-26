package ch10;

//static = > 특정 메모리에 자동로딩
//nonstatic => 객체 생성한 후에 메모리로딩
//static method에서는 static안의 로컬변수나 static으로 정의된 멤버변수만 사용가능
//nonstatic을 이용한
public class A {
	String name = "kim";
	static int n = 20;//n은 static 멤버
	
	public void print() {//일반 멤버 메소드
		System.out.println(name);
		System.out.println(n);
	}
	
	public static void main(String[] args) {//static 멤버 메소드
		int a = 10;//지역변수,로컬변수
		double b = 20.5;
		System.out.println(a);
		System.out.println(b);
		
		A aa = new A();//객체를 생성한 후에나 nonstatic멤버들을 사용할 수 있음
		System.out.println(aa.name);
		
		System.out.println(n);
		aa.print();
		
	}

}
