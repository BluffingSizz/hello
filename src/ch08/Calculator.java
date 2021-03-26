package ch08;

public class Calculator {
	private int left;
	private int right;
	
	
	//기본생성자는 개발자가 명시적으로 코딩하지 않으면 컴퓨터가 스스로 만든다.
	public Calculator() {//기본생성자
		System.out.println("기본 생성자 호출 ...");
	}


	public Calculator(int left, int right) {//setter메소드와 같은 형태
		System.out.println("매개변수가 있는 생성자 호출...");
		this.left = left;
		this.right = right;
	}
	//getter,setter추가


	public int getLeft() {
		return left;
	}


	public void setLeft(int left) {
		this.left = left;
	}


	public int getRight() {
		return right;
	}


	public void setRight(int right) {
		this.right = right;
	}
	
	public void sum() {
		System.out.println(left + right);
	}
	
	public void avg() {
		System.out.println((left+right)/2);
	}
	
	
	

}
