package ch06;

public class MethodCall {
	static void test(int b) {//b를 매개변수, arguments, parameters라 불림
		System.out.println("test method 호출");
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		System.out.println("시작");
		int a =10;
		test (a);//a는 call by value로 값을 전달
		
		int[] num = {10,20,30,40,50};
		test2(num);
		System.out.println();
		System.out.println("끝");
		
	}

	static void test2(int[] n) {
		for(int i=0; i<n.length; i++) {
			System.out.print(n[i]+"\t");
		}
		
	}//end test2

}
