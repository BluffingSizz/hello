package playground;

public class Employee2 {
	private int num;
	private String name;
	private String address;
	private String email;
	private String rrn;
	private int salary;
	
	public Employee2() {
		
	}
	
	
	public int getNum() {
		return num;
	}


	public String getName() {
		return name;
	}


	public String getAddress() {
		return address;
	}


	public String getEmail() {
		return email;
	}


	public String getRrn() {
		return rrn;
	}


	public int getSalary() {
		return salary;
	}


	public Employee2(int num, String name, String address, String email, int salary, String rrn) {
		this.num = num;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.rrn = rrn;
		this.email = email;
	}
	
	

}
