package ch07;

public class StudentUse {
	public static void main(String[] args) {
		//객체 생성
		Student s1 = new Student();
		
		//데이터 입력
		s1.setName("아무개");
		s1.setMajor("컴퓨터");
		s1.setYear(3);
		s1.setNum("1234");
		s1.setPoint(4.1);
		s1.setMoney(4000000);
		s1.getSave();
		s1.getInput();
		s1.print();
	}

}