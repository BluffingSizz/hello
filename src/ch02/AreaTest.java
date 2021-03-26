package ch02;
//반지름이 5.0인 원의 면적을 계산
public class AreaTest {
	public static void main(String[] args) {
		double radius;
		double area;
		radius = 5.0;
		area = radius * radius * Math.PI;
		
		System.out.println("원의 면적은 : "+ area );
		
	}

}
