package ch07;

public class BoxTest2 {
	
	public static void main(String[] args) {
		Box a;
		a = new Box();
		a.width = 20;
		a.length = 20;
		a.height = 30;
		
		System.out.println("상자의 가로, 세로, 높이는 "+a.width+","+a.length+","+a.height+","+"입니다.");
				
	}

}
