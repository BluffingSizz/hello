package test;

public class Gugu {
	
	public static int result(int a , int b) {
		return a*b;
	}
	
	public static void print(int a , int b) {
		System.out.print(a+" * "+ b + " = ");
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("구구단 실행");
		for(int i =1; i<10; i++) {
			for(int j=1;j<10; j++) {
				print(i,j);
				System.out.println(result(i,j));
			}
		}
	}

}
