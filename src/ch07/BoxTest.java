package ch07;

public class BoxTest {
	
	public static void main(String[] args) {
		Box b;//Box는 데이터 타입
		b = new Box();//객체 생성
		b.width = 20;
		b.length = 20;
		b.height = 30;
		System.out.println("상자의 가로, 세로, 높이는 "+b.width+","+b.length+","+b.height);
	}

}
