package playground;

import java.util.Scanner;

public class SmallProject {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		String a ="김치찌게";
		String b = "된장찌게";
		String c = "카레라이스";
		String d = "불고기백반";
		while (true) {
	
		System.out.println("(1) "+a);
		System.out.println("(2) "+b);
		System.out.println("(3) "+c);
		System.out.println("(4) "+d);
		System.out.print("원하시는 메뉴를 선택하세요.(종료:0)>");
		String tmp = sc.next();
		menu = Integer.parseInt(tmp);
		if(menu ==0) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}else if(menu<1 || menu>4) {
			System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
			continue;
		}
		else if(menu ==1) {
			System.out.println("선택하신 메뉴는 "+a+"입니다.");
		}else if(menu ==2) {
			System.out.println("선택하신 메뉴는 "+b+"입니다.");
		}else if(menu ==3) {
			System.out.println("선택하신 메뉴는 "+c+"입니다.");
	}else if(menu ==4){
		System.out.println("선택하신 메뉴는 "+d+"입니다.");
	}else {
		break;
	}
		}//while문
		sc.close();
	}
}
