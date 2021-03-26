package ch02;

public class Box {
	public static void main(String[] args) {
		double w;
		double h;
		double distance;
		double area;
		
		w=10.0;
		h=5.0;
		distance=2*(w+h);
		area=w*h;
		
		System.out.println("사각형의 넓이 = "+ area);
		System.out.println("사각형의 둘레 = "+ distance);
		
		
	}

}
