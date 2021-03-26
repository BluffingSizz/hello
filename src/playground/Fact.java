package playground;

import java.util.Scanner;

public class Fact{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input  ;
		System.out.print("정수를 입력하세요 : ");
		input = sc.nextInt();
		System.out.print(fact(input));
		sc.close();
		
	}
	
	public static int fact(int n) {
		if(n<=1)
			return n;
		else
			return fact(n-1)*n;
	}

}
