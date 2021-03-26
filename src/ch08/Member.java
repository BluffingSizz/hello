package ch08;

public class Member {//고객정보
	//입력값 : 이름, 아이디, 구매금액
	//출력: 이름, 아이디, 구매금액, 회원등급
	private String name;
	private String userid;
	private int money;
	private String grade;
	
	public Member() {
		System.out.println("기본 생성자 호출...");
	}
	//매개변수가 있는 생성자
	public Member(String name, String userid) {
		System.out.println("매개변수가 있는 생성자 호출...");
		this.name = name;
		this.userid = userid;
		this.money = money;
	}
	public String getGrade() {
		if(money >= 100000) {
			grade = "gold";
		}else {
			grade = "silver";
		}
		return grade;
	}
	
	public void print() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println(name+"\t"+userid+"\t"+money+"\t"+grade);
	}
	public void input(String a, String b,int c) {
		// TODO Auto-generated method stub
		
	}

}
