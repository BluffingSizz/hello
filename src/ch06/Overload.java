package ch06;

public class Overload {
	//오버로딩 : 같은이름의 메소드이지만 데이터 타입이 틀리거나 매개변수의 갯수가 틀린것
	static void print(String str) {
		System.out.println(str);
	}
	
	static void print(double d) {
		System.out.println(d);
	}
	
	static void print (int i) {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		print(10);
		print(10.0);
		print("ㅗ");
	}

}
