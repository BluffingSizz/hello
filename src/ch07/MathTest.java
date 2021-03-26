package ch07;

public class MathTest {
	
	public static void main(String[] args) {
		int sum;//지역변수,로컬변수(반드시 개발자가 값을 초기화해야한다.)
		Math obj=new Math();
		sum = obj.add(2, 3);
		System.out.println("2와 3의 합은 " + sum);
		sum = obj.add(7, 8);
		System.out.println("7과 8의 합은 "+ sum);
		
	}

}
