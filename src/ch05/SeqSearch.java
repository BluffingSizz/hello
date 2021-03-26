package ch05;

import java.util.Scanner;

public class SeqSearch {
	
	public static void main(String[] args) {
		int s[] = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int value, index = -1; //index값은 -1 초기화;
		Scanner scan = new Scanner(System.in);
		System.out.println("(보기 : 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100)");
		System.out.println("위 숫자 중 탐색할 값을 입력하시오 : ");
		value = scan.nextInt();//키보드부터 정수 입력
		for(int i=0; i<s.length; i++) {//입력한 숫자와 for문을 줄여 순차적배열인덱스에 있는 값과 비교
			//하여 같으면 아래식을 수행
			if(s[i] == value)
			index = i; 
		}
		if(index < s.length && index >=0)//true && true
			System.out.println(""+value+"값은 index "+index+"의 위치에 있습니다.");
	}

}
