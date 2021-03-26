package playground;

public class Manager2 extends Employee2{
	private int bonus;
	
	public Manager2(int num, String name, String address, String email, int salary, String rrn, 
			int bonus) {
		super(num,name, address, email, salary, rrn);
		this.bonus = bonus;
	}
	
	public void print() {
		System.out.println("===========================");
		System.out.println("1.사원번호 : "+getNum());
		System.out.println("2.사원이름 : "+getName());
		System.out.println("3.주소 : "+getAddress());
		System.out.println("4.이메일주소 : "+getEmail());
		System.out.println("5.연봉 : "+getSalary());
		System.out.println("6.주민번호 : "+getRrn());
		System.out.println("7.보너스 : "+bonus);
		System.out.println("===========================");
	}

}
