package playground;

import java.util.Scanner;

public class While_Gugu_Scan {
	public static void main(String[] args) {
		int i =1;
		int dan = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력하세요 : ");
		dan = sc.nextInt();
		sc.close();
			System.out.println("** "+dan +" 단 **");
			while (i<=9) {
				System.out.println(dan+" x "+i+" = "+dan*i);
				i++;
			}
		
	}

}
