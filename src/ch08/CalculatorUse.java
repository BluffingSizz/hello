package ch08;

public class CalculatorUse {
	public static void main(String[] args) {
		//객체(인스턴스) 생성
		Calculator c1 = new Calculator();//기본생성자 호출의 매커니즘 들어있다.
		
		//입력
		c1.setLeft(10);
		c1.setRight(20);
		
		
		//출력
		System.out.println(c1.getLeft());
		System.out.println(c1.getRight());
		
		Calculator c2 = new Calculator(30, 40);
		c2.sum();
		c2.avg();
		
		Calculator c3 = new Calculator(50, 60);
		c3.sum();
		c3.avg();
	}

}
