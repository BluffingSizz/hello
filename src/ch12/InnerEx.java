package ch12;

public class InnerEx {
	private static int x = 10;
	class Inner {
		int getX() {
			return x;
		}//end 메소드
	}//end inner 클래스
	
	public static void main(String[] args) {
		System.out.println(x);
		InnerEx e = new InnerEx();
		InnerEx.Inner in =e.new Inner();
		System.out.println(in.getX());
	}

}
