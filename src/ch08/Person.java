package ch08;

public class Person {
	//멤버변수 , 전역변수 , 필드변수
	private String name;
	private int height;
	private int weight;
	
	
//	this.멤버변수 => 로컬변수의 값을 멤버변수로 초기화, this() => 다른 생성자 호출
	public Person() {//기본 생성자(default constructor)
		this("김철수",170,60);
		
	}
	
	public Person(String name) {
		this(name,190,100);
	}
	
	public Person(String name, int height) {
		this(name,height,50);//Person(String,int,int)
	}

	public Person(String name, int height, int weight) {//매개변수가 있는 생성자
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	
	public void showInfo() {
		System.out.println("==신상 정보==");
		System.out.println("이름 : "+name);
		System.out.println("신장 : "+height);
		System.out.println("체중 : "+weight);
	}

}
