package ch07;

import java.util.Scanner;

public class PersonUse2 {
	
	public static void main(String[] args) {
		Person p1 =new Person();
		p1.setName("홍길동");
		p1.setAge(30);
		p1.setEmail("hong@naver.com");
		p1.setaAdress("서울 강동구 천호동");
		p1.print();
		Person p2 =new Person();
		p2.setName("사임당");
		p2.setAge(25);
		p2.setEmail("samindang@daum.net");
		p2.setaAdress("서울 강남구 개포동");
		p2.print();
		
		Scanner sc = new Scanner(System.in);
		Person p3 =new Person();
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("이메일을 입력하세요 : ");
		String email = sc.nextLine();
		
		System.out.println("주소를 입력하세요 : ");
		String adress = sc.nextLine();
		sc.close();
		
		p3.setName(name);
		p3.setAge(age);
		p3.setEmail(email);
		p3.setaAdress(adress);
		p3.print();
		
		
		
		
	}

}
