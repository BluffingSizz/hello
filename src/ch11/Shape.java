package ch11;

public abstract class Shape {//추상클래스
	int x,y;
	public void move(int x , int y) {
		this.x =x;
		this.y = y;
	}
	public abstract void draw();//구현부가 없는(body가 없는)메소드인 추상메소드

}
