package ch05;

public class ArrayBasic {
	public static void main(String[] args) {
//		int[] score;//배열 참조변수 선언
//		score = new int[5];//new를 통해 메모리에 5개의 int형 배열 생성
		//score는 이제 배열참조변수가 됨으로써 
		//메모리에 생성된 배열에 접근할 수 있는 첫번째 메모리 주소값을 가짐.
		
		
//		score[0] = 100;
//		score[1] = 90;
//		score[2] = 80;
//		score[3] = 70;
//		score[4] = 60;
		//score[5] = 50; //범위 초과 ,error
		
		int[] score = {100,90,80,70,60};
		
		//배열을 다루는데 있어서 for문은 거의 필수적으로 사용된다.
		for (int i =0; i<5;i++) {
			System.out.println(score[i]);
		}
	}

}
