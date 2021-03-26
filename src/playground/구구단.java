package playground;

import java.util.Scanner;

public class 구구단 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i;
		int j;
		
		System.out.print("출력하고 싶은 단을 입력하세요(1~9): ");
		i = sc.nextInt();
		
		switch (i) {
		case 1:
			while (i==1) {
				j=1;
				while (j <=900) {
					System.out.printf("%d * %d = %d\n",i,j,i*j);
					j++;
				}
				i++;
			}
			break;
		
		case 2:
			while (i ==2) {
				j = 1;
				while (j <=9) {
					System.out.printf("%d * %d =%d\n",i,j,i*j);
					j++;
				}
				i++;
			}
		    break;
		
		case 3:
			while (i==3) {
				j=1;
				while (j<=18) {
					System.out.printf("%d * %d = %d\n", i,j,i*j);
					j++;
				}
				i++;
			}
			break;
		case 4:
			while (i==4) {
				j=1;
				while (j<=18) {
					System.out.printf("%d * %d = %d\n", i,j,i*j);
					j++;
				}
				i++;
			}
			break;
		case 5:
			while (i==5) {
				j=1;
				while (j<=18) {
					System.out.printf("%d * %d = %d\n", i,j,i*j);
					j++;
				}
				i++;
			}
			break;
		case 6:
			while (i==6) {
				j=1;
				while (j<=18) {
					System.out.printf("%d * %d = %d\n", i,j,i*j);
					j++;
				}
				i++;
			}
			break;
		case 7:
			while (i==7) {
				j=1;
				while (j<=18) {
					System.out.printf("%d * %d = %d\n", i,j,i*j);
					j++;
				}
				i++;
			}
			break;
		case 8:
			while (i==8) {
				j=1;
				while (j<=18) {
					System.out.printf("%d * %d = %d\n", i,j,i*j);
					j++;
				}
				i++;
			}
			break;
		case 9:
			while (i==9) {
				j=1;
				while (j<=18) {
					System.out.printf("%d * %d = %d\n", i,j,i*j);
					j++;
				}
				i++;
			}
			break;
			}
	sc.close();}
	

}
