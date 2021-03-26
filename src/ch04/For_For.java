package ch04;

public class For_For {
	public static void main(String[] args) {
		for(int i =1; i<=5; i++) {//1,2
			for(int j=1; j<=10; j++) {
				System.out.print("*");
			}//안쪽 for
			System.out.println("");//줄바꿈처리
		}//바깥쪽 for
	}//end main

}
