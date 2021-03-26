package ch12;

//static nested inner class(정적 중첩 클래스)
//정적중첩클래스는 non-static멤버를 안에서 사용할 수 없다.
//외부크래스이름.내부클래스이름으로 new 할 수 있다.

public class StaticOuter {
	static int data = 30;//static멤버
	int data2 = 50;//nonstatic멤버
	static class StaticInner{
		void msg() {
			System.out.println("data is "+data);
			System.out.println("data is ");//nonstatic멤버 사용불가능
		}
	}//inner class
	
	public static void main(String[] args) {
		StaticOuter.StaticInner in = new StaticOuter.StaticInner();
		in.msg();
	}

}
