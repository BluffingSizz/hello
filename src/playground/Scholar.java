package playground;

public class Scholar extends Student{
	private String category;//장학금 종류
	private int money;//장학금액
	
	public Scholar() {
		
	}
	public Scholar(String name, String num, String major, int year, String category, int money) {
		super.Student(name, num, major, year);
		this.category = category;
		this.money = money;
		
	}
	
	public Scholar(String name, String num, String major, int year) {
		super.Student(name, num, major, year);
		
	}
	
	public void print() {
		System.out.println("이름\t학번\t전공\t학년\t구분\t장학금액");
		System.out.println(name+"\t"+num+"\t"+major+"\t"+year+"\t"+category+"\t"+money);
	}
	
	public void print2() {
		System.out.println("이름\t학번\t전공\t학년");
		System.out.println(name+"\t"+num+"\t"+major+"\t"+year);
	}

}

