package ch12;

public class LocalOuter {
	private int data=30;
	void display() {
		class LocalInner{
			void msg() {
				System.out.println(data);
			}//ends msg
		}//ends inner class
		LocalInner li=new LocalInner();//내부객체 생성
		li.msg();
	}//ends display()
	
	public static void main(String[] args) {
		LocalOuter lo =new LocalOuter();
		lo.display();
	}

}
