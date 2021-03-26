package ch07;

//한개의 파일에 2개이상의 class파일을 작성시에는 public class의 클래스이름
class Phone {
	String model;
	int value;
	
	void print() {
		System.out.println(value + "만원 짜리" + model + "스마트폰");
		
	}

}


public class PhoneDemo {
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		myPhone.model = "갤럭시 노트";
		myPhone.value = 100;
		myPhone.print();
		
		Phone yourPhone = new Phone();
		yourPhone.value = 69;
		yourPhone.print();
	}
}
