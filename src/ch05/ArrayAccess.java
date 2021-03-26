package ch05;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int intArray[] =new int[5];//배열생성
		int max=0;//현재 가장 큰 수
		System.out.println("양의정수 5개를 입력하세요.");
		for(int i =0;i<intArray.length;i++) {
			intArray[i] = scanner.nextInt();//입력받은 정수를 배열에 저장
			if(intArray[i]>max) {//intArray 현재 가장 큰 수보다 크다면
				max = intArray[i];//intArray[i]를 max로 변경
			}
		}//end for
		System.out.println("가장 큰 수는 "+max+"입니다.");
		scanner.close();//Scanner 종료
	}

}
