package ch11;

import java.awt.Graphics;

public class DrawCircle extends Point implements Draw{
	private int width, height;
	public DrawCircle() {//기본생성자
		this(0,0,0,0);//매개변수가 있는 생성자 호출
	}
	//super.멤버 : 부모클래스의 멤버 호출
	//super() : 부모클래스의 생성자 호출
	public DrawCircle(int a, int b, int w, int h) {
		super(a,b);//부모클래스 (Point)의 생성자 호출
		//public Point(int a, int b)호출
		width = w;
		height = h;
	}
	
	//Graphics : 그래픽 처리 클래스
	@Override
	public void paint(Graphics g) {
		g.drawOval(a, b, width, height);
		
		
	}
	

}
