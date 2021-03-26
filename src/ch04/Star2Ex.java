package ch04;

public class Star2Ex {
	public static void main(String[] args) {
		for (int i=1; i<5; i++) {//반복횟수:4번
			for(int j=4;j>0;j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}//else
			}//inner for
			System.out.println();
		}//outer for
	}//main

}
