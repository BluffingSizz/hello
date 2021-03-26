package ch10;

public class Test {
	static int a; //static member
	int b;//nonstatic member
	void print() {//nonstatic 메소드
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		//static 메소드에서는 nonstatic멤버를 직접 쓸 수 없다.
		Test t = new Test();
		
		System.out.println(t.b);//new를 해야만 nonstatic멤버를 쓸 수 있다.
		t=null;//객체가 주소를 잃고 메모리상에서 떠돌아 다님.
		System.out.println(Math.PI);//대표적예인 PI 값
		final int NUM =5000;
		int[] arr = new int[NUM];
		//int[
		
	}

}
