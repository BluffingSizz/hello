package playground;

import java.util.Scanner;

public class Mill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		System.out.print("첫번째 정수를 입력하세요 : ");
		x = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		y = sc.nextInt();
		sc.close();
		System.out.println("두 정수의 최댓값은 " +max(x,y)+"입니다.");
	}
	static int max(int a , int b) {
		int result = (a>b) ? a : b;
		return result;
		
	}

}
