package ch12;

public class TestMemberOuter1 {
	private int data = 30;
	class Inner{
		void msg() {
			System.out.println("data is "+data);
		}//end msg()
	}//inner Class
	
	public static void main(String[] args) {
		//우선 outer 객체를 생성
		TestMemberOuter1 obj = new TestMemberOuter1();//outer 객체생성
		//inner 객체를 생성할때는 외부클래스이름,내부클래스이름 참조변수 = 외부참조변수.new 내부클래스생성자이름
		TestMemberOuter1.Inner in = obj.new Inner();//inner 객체생성
		in.msg();
	}

}
