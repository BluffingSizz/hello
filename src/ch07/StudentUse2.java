package ch07;

public class StudentUse2 {
	
	public static void main(String[] args) {
		Student2 s1 = new Student2();//객체 생성
		s1.input("홍길동", "컴공", 1, "20210301", 4.3, 5000000);
		System.out.println(s1);
		s1.print();
		
	}

}
