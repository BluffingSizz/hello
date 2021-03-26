package playground;

import java.util.Scanner;

public class RectangleTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x, y, area;
		
		
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		x = sc.nextDouble();
		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		y = sc.nextDouble();
		
		area = x * y;
		System.out.println("직사각형의 넓이는 "+area+"입니다.");
		
		sc.close();
		
		
	}

}
