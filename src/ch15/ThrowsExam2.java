package ch15;

public class ThrowsExam2 {
	public static void main(String[] args) {
		test(0);
	}

	static void test(int n) {
		if(n==0) {
			throw new NullPointerException();
			//throws, throw는 다르기 때문에 주의해야 함.
			//throw new 예외처리클래스(); 특정한 조건에 인위적으로 예외를 발생시킨
		}
		
	}

}
