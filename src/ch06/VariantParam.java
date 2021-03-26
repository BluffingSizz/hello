package ch06;

public class VariantParam {
	//가변사이즈 매개변수처리
	//변수가 배열참조 변수가 됨
	//같은 자료형의 매개변수의 갯수에 관계없이 처리
	//실제로는 많이 안함
	
	
	static void print(String ... n) {//n이 가변형 매개변수
		for(int i=0; i<n.length; i++) {
			System.out.println(n[i]);
		}
	}
	
	
	
	
//	static void print(String a) {
//		System.out.println(a);
//		
//		
//	}
//	
//	static void print(String a,String b) {
//		System.out.println(a);
//		System.out.println(b);
//	}
//	
//	static void print(String a,String b,String c) {
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//	}
	public static void main(String[] args) {
		print("java");
		print("java", "program");
		print("java", "program","jsp");
		print("java", "program", "jsp","program");
	}

}
