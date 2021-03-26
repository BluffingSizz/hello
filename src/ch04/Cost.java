package ch04;

import java.util.Scanner;

public class Cost {
	public static void main(String[] args) {
		//변수 선언
		String name=""; //이름
		int price=0;//구매금액
		int point=0;//포인트(1만원이상이면 사용가능하게)
		int point_use=0;//포인트 사용액
		int fee=0;//배송료 (2만원 미만 2000원)
		int pay; //실제 결제 금액
		//자료 입력(선택)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("구매 금액 : ");
		price = sc.nextInt();
		System.out.println("포인트 : ");
		point = sc.nextInt();
		//계산
		if ( price < 20000 ) {
			fee = 2000;
		}
		if ( point >= 10000 ) {
			point_use = point;
			pay  = price + fee - point;
		}else {
			pay = price + fee;
		}if (pay < 0) {
			pay =0;
		}
		//출력
		System.out.println("이름\t구매금액\t배송료\t포인트사용\t결제금액");
		System.out.println(name+"\t"+price+"\t"+fee+"\t"+point_use+"\t"+pay);
	}

}
