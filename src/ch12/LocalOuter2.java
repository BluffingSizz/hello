package ch12;
//Local inner class의 규칙
//1. Local inner class는 외부메소드로부터 불러올 수 없다.
//2. jdk1.7까지는 마지막이 아닌 지역 변수에 접속할 수없다.
//3. jdk1.8부터는 마지막이 아닌 지역 변수에도 접속할 수 있다.

public class LocalOuter2 {
	private int data =30;//멤버변수
	void display() {
		int value = 50;//지역변수1
		int value2=100;
		class LocalInner2 {
			void msg() {
				System.out.println(value);
			}//end msg(
		}//end inner class
		LocalInner2 li = new LocalInner2();
		li.msg();
	}//end display()
	
	public static void main(String[] args) {
		LocalOuter2 lo = new LocalOuter2();
		lo.display();
	}

}
