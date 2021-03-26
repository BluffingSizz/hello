package ch02;

public class VarScope {
	static int x;//전역변수 선언만
	//정수형 = 0
	//실수형 = 0.0
	//논리형 = false
	
	public static void main(String[] args) {
		int y=0;//지역변수 선언만
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
	}

}
