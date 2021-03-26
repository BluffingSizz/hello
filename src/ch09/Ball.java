package ch09;

public class Ball extends Circle {
	//멤버변수,필드변수,전역변수
	private String color;
	
	public Ball(String color) {//color(로컬변수,지역변수)
		this.color = color;
		
	}
	
	public Ball() {//만약에 생성자코드를 코딩했다면 기본생성자도 명시적으로 코딩해주는게 좋다.
		
	}
	
	public void findColor() {
		System.out.println(color +"색 공이다.");
	}
	
	public void findVolume() {
		System.out.println("부피는 4/3*(파이*반지름*반지름*반지름)이다.");
	}

}
