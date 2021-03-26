package ch09;

public class Area {
	//멤버변수
	private int width;
	private int length;
	
	public Area() { }//기본 생성자
	public Area(int width, int length) {
		this.width = width;
		this.length = length;
	}
	public int getArea() {
		return width*length;
	}

}
