package ch10;

public class StaticMethod {
	static int a = 10;//static멤버
	int b=20;//nonstatic멤버
	
	public static void printA() {//static멤버
		System.out.println(a);
		StaticMethod s1 = new StaticMethod();
		System.out.println(s1.b);
		
	}
	
	public void printB() {//nonstaitc멤버
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		printA();
		
		StaticMethod a = new StaticMethod();
		a.printB();
	}

}
