package gugu;

import java.util.Scanner;

public class Gugu23 {
	
	public static int[] result(int a) {
		int[] result = new int[9];
		for(int i =0; i<result.length;i++) {
			result[i] = a * (i+1);
		}
		return result;
	}
	
	public static void print(int[] a) {
		for(int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		int dan;
		int[] a = new int[9];
		Scanner scan = new Scanner(System.in);
		System.out.println("단을 입력하세요 : ");
		dan = scan.nextInt();
		a=result(dan);
		print(a);
		
		
//		int[] result = new int[9];
//		for(int i = 0; i<result.length;i++) {
//			result[i] = 2*(i+1);
//			System.out.println(result[i]);
//		}
//		System.out.println(result);
//		
		//		System.out.println("구구단 중 출력할 단을 입력하세요 : ");
//		Scanner scan = new Scanner(System.in);
//		int dan = scan.nextInt();
//		boolean j = true;
//		while (j) {
//		if(dan<2 || dan>9) {
//			System.out.println("2이상,9이하의 값만 입력할 수 있습니다. 다시 입력해주세요");
//			dan = scan.nextInt();
//		}else {
//			for(int i =1; i<10; i++) {
//				System.out.println(dan+" * "+i+" = "+dan*i);
//				j=false;
//			}
//		}
//		}
//		scan.close();
//		System.out.println("2단");
//		System.out.println(2+" * "+1+" = "+2*1);
//		System.out.println(2+" * "+2+" = "+2*2);
//		System.out.println(2+" * "+3+" = "+2*3);
//		System.out.println(2+" * "+4+" = "+2*4);
//		System.out.println(2+" * "+5+" = "+2*5);
//		System.out.println(2+" * "+6+" = "+2*6);
//		System.out.println(2+" * "+7+" = "+2*7);
//		System.out.println(2+" * "+8+" = "+2*8);
//		System.out.println(2+" * "+9+" = "+2*9);
//		System.out.println("3단");
//		System.out.println(3+" * "+1+" = "+3*1);
//		System.out.println(3+" * "+2+" = "+3*2);
//		System.out.println(3+" * "+3+" = "+3*3);
//		System.out.println(3+" * "+4+" = "+3*4);
//		System.out.println(3+" * "+5+" = "+3*5);
//		System.out.println(3+" * "+6+" = "+3*6);
//		System.out.println(3+" * "+7+" = "+3*7);
//		System.out.println(3+" * "+8+" = "+3*8);
//		System.out.println(3+" * "+9+" = "+3*9);
//		//4단
//		System.out.println("4단");
//		int i = 4 * 1;
//		System.out.println(i);
//		i = 4*2;
//		System.out.println(i);
//		i = 4*3;
//		System.out.println(i);
//		i=4*4;
//		System.out.println(i);
//		i=4*5;
//		System.out.println(i);
//		i=4*6;
//		System.out.println(i);
//		i=4*7;
//		System.out.println(i);
//		i=4*8;
//		System.out.println(i);
//		i=4*9;
//		System.out.println(i);
//		System.out.println("구구단 중 출력할 단은? :");
//		Scanner scan = new Scanner(System.in);
//		int result = scan.nextInt();
//		System.out.println(result+" * "+1+" = "+result*1);
//		System.out.println(result+" * "+2+" = "+result*2);
//		System.out.println(result+" * "+3+" = "+result*3);
//		System.out.println(result+" * "+4+" = "+result*4);
//		System.out.println(result+" * "+5+" = "+result*5);
//		System.out.println(result+" * "+6+" = "+result*6);
//		System.out.println(result+" * "+7+" = "+result*7);
//		System.out.println(result+" * "+8+" = "+result*8);
//		System.out.println(result+" * "+9+" = "+result*9);
		
//		//6단
//		int i = 1;
//		while (i<10) {
//			System.out.println(6*i);
//			i++;
//		}
//		
//		//7단
//		for(i = 1;i<10;i++) {
//			System.out.println(7*i);
//		}
	}

}
