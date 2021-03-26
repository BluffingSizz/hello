package ch06;
//재귀호출 = 실제 잘 사용안함(메모리 증가)
//factorial계산 : 5!=5x4x3x2x1

public class RecursiveEx {
	
	//fact1()안에서 또 fact1()재귀호출
	static long fact1(int n) {
		return n==1 ? 1 : n * fact1(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(fact1(5));
	}

}
