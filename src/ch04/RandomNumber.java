package ch04;

import java.util.Random;
import java.util.Scanner;
//0~99사이의 난수의 합을 계산하는 프로그램
public class RandomNumber {
	public static void main(String[] args) {
		Random generator = new Random();//난수를 발생시키는 랜덤함수 생성
		System.out.print("난수의 갯수 : ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<count; i++) {
			int number = generator.nextInt(100);//0~99사이의 난수발생
            System.out.println("생성된 난수 : "+number);
            sum += number; //sum=sum+number
		}
		System.out.print("난수"+count+"개의 합은"+sum);
	}

}
