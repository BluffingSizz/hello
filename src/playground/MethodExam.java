package playground;

import java.util.Scanner;

public class MethodExam {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =0;
		int b =0;
		System.out.println("-------------------------");
		System.out.println("정수 a를 입력하세요 : ");
		a = sc.nextInt();
		System.out.println("정수 b를 입력하세요 : ");
		b = sc.nextInt();
		sc.close();
		System.out.println("-------------------------");
		System.out.println(a+" + "+b+ " = "+ sum(a,b));
		System.out.println(a+" - "+b+ " = "+ minus(a,b));
		System.out.println(a+" * "+b+ " = "+ multi(a,b));
		System.out.println(a+" / "+b+ " = "+ String.format("%4.1f",di(a,b)));
		System.out.println("-------------------------");
	}

	public static double di(int a, int b) {
		
		return (double)a/(double)b;
	}

	public static int multi(int a, int b) {
		
		return a*b;
	}

	public static int minus(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	public static int sum(int i, int j) {
		return i+j;
	}

}
